import java.util.Arrays;
import java.util.List;

public class CheckingElementOnCustomLogic {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,2,3,4,5,6,7,8,8,9,10,11,12,13,14,15,16);

        boolean b = num.stream().allMatch(n -> n%2 == 0);
        System.out.println("All even numbers : "+b);
    }
}
