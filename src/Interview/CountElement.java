package Interview;

import java.util.Arrays;
import java.util.List;

public class CountElement {
    public static void main(String[] args) {
        List<Integer>nub= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14);

        long count = nub.stream().filter(n -> n > 12)
                .count();
        System.out.println("no of element which is greater then 5 is "+count);

        long n = nub.size();
        System.out.println(n);
        System.out.println("============================");
        long r=nub.stream().count();
        System.out.println(r);
    }
}
