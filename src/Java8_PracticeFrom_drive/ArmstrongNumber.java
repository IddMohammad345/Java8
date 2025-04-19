package Java8_PracticeFrom_drive;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num=158,n,rev=0;
        int s=num;
        while (num>0){
            n=num%10;
            rev=rev+(n*n*n);
            num=num/10;
        }

        if (s==rev){
            System.out.println("number is armstrong number..");
        }else {
            System.out.println("number is not a armstrong number..");
        }
    }
}
