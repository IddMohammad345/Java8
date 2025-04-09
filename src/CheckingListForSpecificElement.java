import java.util.Arrays;
import java.util.List;

public class CheckingListForSpecificElement {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,7,8,89,1,0,9,8,91,233,4,5,455,6,76,7,6,7,7,87,8,87,0);
        boolean b = list.stream().anyMatch(n -> n.equals(9));
        System.out.println(b);
    }
}
