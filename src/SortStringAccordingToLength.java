import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringAccordingToLength {
    public static void main(String[] args) {
        List<String> fruit= Arrays.asList("mango","orange","banana","grapes","pineapple","jackfruit");

        List<String> list = fruit.stream()
                .sorted((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .collect(Collectors.toList());

        System.out.println(list);
        System.out.println("===================================================");

        List<String> list1 = fruit.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
