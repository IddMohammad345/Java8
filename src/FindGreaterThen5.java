import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Fetch All numbers from a list That are Greater than 5.
public class FindGreaterThen5 {
    public static void main(String[] args){

        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        List<Integer> result=numbers.stream()
                .filter(n->n>5)
                .collect(Collectors.toList());
        System.out.println(result);

    }
}