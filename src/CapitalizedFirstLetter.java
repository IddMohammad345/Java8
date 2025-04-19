import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CapitalizedFirstLetter {
    public static void main(String[] args) {
        List<String>list= Arrays.asList("apple","grapes","banana","orange");
        list.stream()
                .map(str->str.isEmpty() ? str: str.substring(0,1)
                        .toUpperCase()+str.substring(1))
                .forEach(System.out::println);
        System.out.println("========================================");

        //if we have String without any gap
        String letter="hello world , how are you";
      List<String >re= Collections.singletonList(Arrays.stream(letter.split(" "))
              .map(i -> i.isEmpty() ? i : i.substring(0, 1).toUpperCase() + i.substring(1))
              .reduce((word1, word2) -> word1 + " " + word2)
              .orElse(""));
        System.out.println(re);
    }
}
