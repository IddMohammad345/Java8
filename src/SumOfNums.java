import java.util.Arrays;
import java.util.List;

public class SumOfNums {
    public static void main(String[] args) {
        List<Integer>num= Arrays.asList(1,2,3,4,5,6,7,7,88,10);

        int nums = num.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(nums);
    }
}
