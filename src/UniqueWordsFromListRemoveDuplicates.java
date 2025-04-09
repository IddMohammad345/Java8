import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueWordsFromListRemoveDuplicates {
    public static void main(String[] args) {
        String s="Hello";
        String world = s.concat(" world");
        System.out.println(world);

        System.out.println("=================================");
        List<String>fruit= Arrays.asList("Apple","banana","Orange","Apple","Orange","Kiwi");
        List<String> list = fruit.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println("===================================");

        List<String> list1 = fruit.stream()
                .sorted()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(" sorted "+list1);
    }
}
