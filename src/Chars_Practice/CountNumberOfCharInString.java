package Chars_Practice;

public class CountNumberOfCharInString {
    public static void main(String[] args) {
        String str="Hello world";

        long len=str.chars().count();//counting the number of characters in a String but this logic counts the spaces as a character
        System.out.println(len);

        long count = str.replaceAll("\\s", "").chars().count();//this logic counts the characters only
        System.out.println(count);

        System.out.println("===================================================");
        String stringWithoutSpace=str.replaceAll("\\s","");//Removing the space from strings
        System.out.println(stringWithoutSpace);

    }
}
