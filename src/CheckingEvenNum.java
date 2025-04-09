import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckingEvenNum {
    public static void main(String[] args) {
        List<Integer>num= Arrays.asList(1,2,3,4,4,5,6,7,8,98,9,1,2,12,23,45,67);

        num.stream().filter(n->n%2==0)
                .mapToInt(Integer::intValue)
                //.sum()
                .forEach(System.out::println);
        System.out.println("===========================");

        List<Integer>nums=num.stream()
                .filter(n->n%2==0)
                .collect(Collectors.toList());
        System.out.println(nums);
    }
}
