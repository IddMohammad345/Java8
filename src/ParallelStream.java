import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9);

        int sum = list.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}
