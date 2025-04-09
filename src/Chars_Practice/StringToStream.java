package Chars_Practice;

public class StringToStream {
    public static void main(String[] args) {
        String s="Java * Practice";
        s.chars() //<-- this Logic convert to charectars Into ASCII value
                .forEach(c->System.out.print((char)c));//<-- this Logic Print charectors By joining
    }
}
