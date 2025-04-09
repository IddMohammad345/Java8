package Chars_Practice;

public class charToString {
    public static void main(String[] args) {
        char letter='j';
        String s = String.valueOf(letter);//convert char to string
        System.out.println("Char as String : "+s);

        char c = s.charAt(0); //converting String to char
        System.out.println("String as char : "+c);
    }
}
