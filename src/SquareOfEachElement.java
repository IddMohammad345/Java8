import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfEachElement {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5,5,6,7,8);
        List<Integer> list = num.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println("===================================");
        List<Integer> list1 = list.stream()
                .map(m -> m-1%2)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
