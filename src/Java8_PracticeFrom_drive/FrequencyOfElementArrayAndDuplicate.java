package Java8_PracticeFrom_drive;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElementArrayAndDuplicate {
    public static void main(String[] args) {
        int[] numbers={1,2,3,3,4,5,5,5,6,6,7,9,7,6,4,3,3,2};
        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());

        //using java 8
        list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(e->e.getValue()>1)
                .map(Map.Entry::getKey)
                .forEach((key) -> System.out.println(key + " "));


        System.out.println("=============================================");
        //Finding duplicates using hashmap
        Map<Integer,Integer>map=new HashMap<>();
        for (int numb:numbers){
            map.put(numb, map.getOrDefault(numb,0)+1);
        }

        //Duplicate elements
        for (int k:map.keySet()){
            if (map.get(k)>1){
                System.out.println(k+" appear "+map.get(k));
            }
        }
    }
}
