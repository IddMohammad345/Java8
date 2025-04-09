import java.util.Arrays;

public class CheckingAnagramOfStrings {
    public static void main(String[] args) {

        CheckingAnagramOfStrings check=new CheckingAnagramOfStrings();

        boolean b = check.anagram("Hello ", "OLLeh");
        System.out.println(b);
    }

    public boolean anagram(String str1,String str2){
        //removing Space and changing into lower case ;
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2=str2.replaceAll("\\s","").toLowerCase();

        //if Length are different they can't be anagram
        if (str1.length()!=str2.length()){
            return false;
        }
        //converting into arrays
        char[] s1=str1.toCharArray();
        char[] s2=str2.toCharArray();

        //sort the arrays
        Arrays.sort(s1);
        Arrays.sort(s2);

        //checking equal of two strings
        return Arrays.equals(s1,s2);
    }
}
