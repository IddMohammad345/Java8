package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindingNumberHavingZeros {
    public static void main(String[] args) {

        // [102, 111, 500,567, 809,887,  543]
        List<Integer> list = Arrays.asList(102, 111, 500, 567, 809, 887, 543);
        List<Integer>result=list.stream().filter(n->n.toString().contains("0")).collect(Collectors.toList());
        result.forEach(System.out::println);


        System.out.println("==============================");

        list.stream().filter(n->n.toString().contains("5"))
                .collect(Collectors.toList()).forEach(System.out::println);
    }
}
