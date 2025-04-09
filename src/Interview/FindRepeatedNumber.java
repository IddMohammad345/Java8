package Interview;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindRepeatedNumber {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 8, 9, 8, 9);

        //with using map
       Map<Integer,Long>frequency= list.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
       frequency.entrySet()
               .stream()
               .filter(e->e.getValue()>1)
               .forEach(e-> System.out.println("Repeated Number: "+e.getKey()));

        System.out.println("=========================================");

        //without using map
        Set<Integer>seen=new HashSet<>();
        Set<Integer>duplicates=new HashSet<>();
          //now Iterate through the list duplicates
        list.stream()
                .filter(n-> !seen.add(n))//add returns false if the element already in the set
                .forEach(duplicates::add);

        //print the repeated numbers
        duplicates.forEach(n-> System.out.println("Repeated number : "+n));
    }
}
