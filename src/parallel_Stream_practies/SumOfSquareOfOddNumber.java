package parallel_Stream_practies;

import java.util.Arrays;
import java.util.List;

public class SumOfSquareOfOddNumber {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        //using parallel stream
       int result= list.parallelStream()
                .filter(n->n%2 !=0)
                .mapToInt(n->n*n)
                .sum();
        System.out.println(result);
        System.out.println("============================");
        //using stream
        int result1=list.stream()
                .filter(n->n%2 !=0)
                .mapToInt(n->n*n)
                .sum();
        System.out.println(result1);

    }
}
