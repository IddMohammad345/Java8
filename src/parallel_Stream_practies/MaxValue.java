package parallel_Stream_practies;

import java.util.Arrays;
import java.util.List;

public class MaxValue {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9);
     int result=   list.parallelStream()
               // .mapToInt(Integer::intValue)
             .sorted((a,b)-> b-a)
             .findFirst()
             //.max()
             .orElseThrow(()->new IllegalArgumentException("list is empty"));
        System.out.println(result);
    }
}
