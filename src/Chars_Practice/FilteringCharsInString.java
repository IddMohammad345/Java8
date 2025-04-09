package Chars_Practice;

import java.util.stream.Collectors;

public class FilteringCharsInString {
    public static void main(String[] args) {
        String s="java 8 Practice";
        String result = s.chars()
                .filter(n -> "AIEUOaieow".indexOf(n) != -1)//checking if the characters is vowels
                .mapToObj(n -> String.valueOf((char) n))//convert ASCII to char then to string
                .collect(Collectors.joining()); //collect them into a single string
        System.out.println("vowels in the string : "+result);
    }
}
