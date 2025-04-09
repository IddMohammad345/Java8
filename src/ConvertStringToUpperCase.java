import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringToUpperCase {
    public static void main(String[] args) {
        List<String>name= Arrays.asList("Appla","Banana","Orange","Kiwi");
//printing all string into upper case
        List<String> list = name.stream().map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("==========================");
        System.out.println(list);
//printing all String Into Lower Case
        List<String> list1 = name.stream().map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println("=============================");
        System.out.println(list1);

        System.out.println("=============================================");
        //again practice
        name.stream().map(String::toUpperCase).forEach(System.out::println);
    }
}
