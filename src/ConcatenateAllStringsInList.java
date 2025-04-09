import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateAllStringsInList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "coconut", "apple");

        List<String> list2 = list.stream().collect(Collectors.toList());

        System.out.println(list2);

        System.out.println("====================================");

        List<String> list1 = new ArrayList<>(list);
        System.out.println(list1);
    }
}
