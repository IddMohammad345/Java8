package Chars_Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase {
    public static void main(String[] args) {
        List<Character>list= Arrays.asList('J','A','V','A');

        list.forEach(System.out::println);
        System.out.println("=============================");
        //convert all characters to Lower case
        list.stream()
                .map(Character::toLowerCase)
                .forEach(System.out::print);
    }
}
