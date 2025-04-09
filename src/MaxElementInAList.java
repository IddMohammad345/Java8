import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MaxElementInAList {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,3,4,5,6,7,8,75,4,3,3,5,5,55,6,7,7,7,7,76,6);
        //printing max values from List
        int asInt = list.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
        System.out.println(asInt);

        System.out.println("=========================================");
        //printing min values from list
        int i = list.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();
        System.out.println(i);

        System.out.println("====================================");
        //printing average values from list
        double asDouble = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();
        System.out.println(asDouble);

        System.out.println("==========================================");
        Optional<Integer> first = list.stream()
                .sorted()
                .findFirst();
        System.out.println(first);

        //printing value who is equal to zero
        list.stream()
                .filter(j->j==7)
                .forEach(System.out::print);
    }
}
