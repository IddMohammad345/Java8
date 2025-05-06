package Java8_PracticeFrom_drive;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String name1="Hello";
        String name2="olelH";
        char[] f=name1.replaceAll(" ","").toLowerCase().toCharArray();
        char[] s=name2.replaceAll(" ","").toLowerCase().toCharArray();

        Arrays.sort(f);
        Arrays.sort(s);

        if (Arrays.equals(f,s)){
            System.out.println("Anagram "+f.toString() +"  "+ s.toString().t);
        }else {
            System.out.println("Not Anagram "+f+"  "+s);
        }
    }
}
