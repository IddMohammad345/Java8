import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumOfAllEvenNumbers {
    public static void main(String[] args){
        //printing sum of all even numbers from the List
        List<Integer> number= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,16,17);
        System.out.println("====================================");
        int sum = number.stream()
                .filter(n -> n % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);

        //printing all even number from the list
        List<Integer> collect = number.stream()
                .filter(m -> m % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("====================================");

       System.out.println(collect);

       //printing all odd number from the list
        List<Integer> odd=number.stream()
                .filter(u->u%2 !=0)
                .collect(Collectors.toList());
        System.out.println("=====================================");
        System.out.println(odd);
    }
}
