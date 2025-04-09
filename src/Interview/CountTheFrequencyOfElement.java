package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountTheFrequencyOfElement {
    public static void main(String[] args) {
        // Find the Frequency of each character from below list using java8 stream api
        //  output: A=2,B=2,c=2,D=1,E=1
        List<String> list = Arrays.asList("A", "B", "C", "A", "B", "C", "D", "E");
        Map<String, Long> collect = list.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
          collect.forEach((key,value)->System.out.println(key+ " "+ value));


        //Find the Maximum Even number and minimum Odd number from below array. output: max even is 16 and odd is 1
        Integer[] arr = new Integer[]{ 2,4,8,6,12,16,25,14,1,7,9};
       List<Integer> list1=Arrays.asList(arr);
       int ar= list1.stream().filter(n -> n % 2 == 0).sorted((a, b) -> b - a).findFirst().get();
        System.out.println("=========================================");
        System.out.println("Maximum even Number : "+ar);
        System.out.println("==========================================");
       int re= list1.stream().filter(n->n%2!=2).sorted().findFirst().get();
        System.out.println("Minimum Odd number : "+re);

    }
}
