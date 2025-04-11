package CoreJavaPractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int[] arr={1,3,4,4,5,6,7,8,3,5,7,6,5,4,4,3};
        Map<Integer,Integer>frequencyOfElement=new HashMap<>();
        for (int num:arr){
            frequencyOfElement.put(num,frequencyOfElement.getOrDefault(num,0)+1);
        }

        System.out.println("Frequency Of an Element");
        for (Map.Entry<Integer,Integer>entry:frequencyOfElement.entrySet()){
            System.out.println(entry.getKey()+" ==> "+entry.getValue());
        }

        System.out.println("\n printing duplicates element: ");
        for (Map.Entry<Integer,Integer>entry:frequencyOfElement.entrySet()){
            if (entry.getValue()>1){
                System.out.println(entry.getKey());
            }
        }

        //printing Using Java 8 feature
        //Converting array to list for list processing
       List<Integer>list= Arrays.stream(arr).boxed().collect(Collectors.toList());

        //Finding frequency using java 8 feature
        Map<Integer, Long> frequency = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("elements    :   no. of repeated time");
        frequency.forEach((a,b)-> System.out.println("     "+a+"             "+b));

        System.out.println("=============================================");
        //printing Duplicates
        Set<Integer> collect = Arrays.stream(arr).boxed()
                .collect(Collectors.toList())
                .stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e -> e.getKey() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        collect.forEach(System.out::println);
    }
}
