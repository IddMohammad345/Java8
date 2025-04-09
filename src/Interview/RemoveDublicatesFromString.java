package Interview;

import java.util.List;
import java.util.stream.Collectors;

public class RemoveDublicatesFromString {
    public static void main(String[] args) {
        String name="programming";
        String list = name.chars()
                .distinct()
                .mapToObj(n -> String.valueOf((char) n))
                .collect(Collectors.joining());
        System.out.println(list);
    }
}
