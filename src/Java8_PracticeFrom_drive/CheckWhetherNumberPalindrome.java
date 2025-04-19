package Java8_PracticeFrom_drive;

public class CheckWhetherNumberPalindrome {
    public static void main(String[] args) {
        int num=121,n,rev=0;
        int st=num;
        while (num>0){
            n=num%10;
            rev=rev*10+n;
            num=num/10;
        }
        if (st==rev){
            System.out.println("number is palindrome..");
        }else {
            System.out.println("number is not palindrome..");
        }
    }
}
