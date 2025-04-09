

public class PalindromeOfStrings {
    public static void main(String[] args) {

        PalindromeOfStrings p=new PalindromeOfStrings();
        System.out.println(p.palindrome("atta"));
    }

    public boolean palindrome(String str){
        str=str.replaceAll("\\s","").toLowerCase();
        //reverse the string and compare
        String compare =new StringBuilder(str).reverse().toString();
        return str.equals(compare);
    }

}
