package Java8_PracticeFrom_drive;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountAndOccurrenceAndDuplicateCharactersInString {
    public static void main(String[] args) {
        String str="Hello World";

        long count = str.replaceAll("\\s","").chars().count();//Counting the number of character in string
        System.out.println("Number of character : "+count);

//checking the frequency of characters in string
        Map<Character, Long> collect = str.replaceAll("\\s", "")
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors
                        .groupingBy(
                        Function.identity(),
                        Collectors.counting())
                );

        collect.forEach((a,b)-> System.out.println("character : "+a+" -> repeat : "+b));

        System.out.println("================================");
         //printing only duplicate value
        for (Map.Entry<Character,Long>map:collect.entrySet()){
            if (map.getValue()>1){
                System.out.println(map.getKey());
            }
        }
    }
}
