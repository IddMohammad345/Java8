import java.util.*;

public class LongestStringInList {
    public static void main(String[] args) {

        //print
        List<String>fruit= Arrays.asList("Apple","Kiwi","Orange","Banana","PineApple","JackFruit");

        OptionalInt max = fruit.stream()
                .mapToInt(String::length)
                .max();
        System.out.println(max);

        System.out.println("===============================================");

        Optional<String> longest=fruit.stream()
                .max(Comparator.comparingInt(String::length));
        longest.ifPresent(System.out::println);
    }
}
