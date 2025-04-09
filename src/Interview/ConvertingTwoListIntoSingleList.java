package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertingTwoListIntoSingleList {
    public static void main(String[] args) {
        //merge two string in single string
        List<Integer>list= Arrays.asList(1,2,3,3,4,5,5);
        List<Integer>list2=Arrays.asList(4,5,6,7,7,8);

        List<Integer> collect = Stream.concat(list.stream(), list2.stream())
                                .distinct()
                                .collect(Collectors.toList());
        System.out.println(collect);

        //mergo two diffent type of List in Single List
        List<Integer>list3=Arrays.asList(3,3,3,3,3,3,3);
        List<String>list4=Arrays.asList("hello","how","are","you");
        Stream.concat(list3.stream(),list4.stream()).forEach(System.out::println);
    }
}
