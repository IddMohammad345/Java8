package Chars_Practice;

import java.util.stream.Collectors;

public class ConvertingStringToUpperCaseUsingMap {
    public static void main(String[] args) {
        String s="java 8 practice";
        String result = s.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .map(String::toUpperCase)
                .collect(Collectors.joining());
        System.out.println(result);

        // .forEach(System.out::print);
    }
}
