import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Count_String_Length_Is_Greater_Then_5 {
    public static void main(String[] args) {
        List<String>strings= Arrays.asList("apple","banana","grape","watermelon","Kiwi","orange");

        //printing number of string that is greater then 5
        long count = strings.stream()
                .filter(s -> s.length() > 5)
                .count();
        System.out.println("===================================");
        System.out.println(count);


        List<String> list = strings.stream()
                .filter(y -> y.length() > 5)
                .collect(Collectors.toList());
        System.out.println("====================================");
        System.out.println(list);

        System.out.println("====================================");
        List<String>name=Arrays.asList("Ramu","Kumar","Rahul","Mukesh","Nitish","Akshay");
        List<String> list1 = name.stream().filter(s -> s.length() == 4)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
