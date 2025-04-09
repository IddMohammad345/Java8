package parallel_Stream_practies;

import java.util.Arrays;
import java.util.List;

public class SumOfSquareOfElement {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,6,7,7,8,9);
        //using parallel stream
        int sum = list.parallelStream()
                .mapToInt(n -> n * n)
                .sum();
        System.out.println(sum);

        //using stream
       int r= list.stream()
                .mapToInt(n->n*n)
                .sum();
        System.out.println(r);
    }
}
