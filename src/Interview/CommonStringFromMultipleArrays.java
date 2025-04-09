package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonStringFromMultipleArrays {
    public static void main(String[] args) {
    List<String>list1= Arrays.asList("AAA","BBB","CCC");
    List<String>list2= Arrays.asList("DDD","BBB","EEE");
    List<String>list3= Arrays.asList("EEE","FFF","BBB");
        List<String>result= list1.stream()
                .filter(list2::contains)
                 .filter(list3::contains)
                 .collect(Collectors.toList());
        System.out.println(result);
        result.forEach(System.out::println);

        System.out.println("==============================");
        list1.stream()
                .filter(list2::contains)
                .filter(list3::contains)
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
