import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class RemoveNullValuesFromList {
    public static void main(String[] args) {
        List<String>fruit= Arrays.asList("apple","banana","cherry","coconut","apple");
        List<String> list = fruit.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        System.out.println(list);
    }
}
