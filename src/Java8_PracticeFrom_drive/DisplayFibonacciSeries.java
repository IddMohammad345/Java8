package Java8_PracticeFrom_drive;

public class DisplayFibonacciSeries {
    public static void main(String[] args) {
        int f=0;
        int s=1;
        for (int i=0;i<=10;i++){
            int next=f+s;
            System.out.println(f +" + "+s+" = "+next);
            f=s;
            s=next;
        }
    }
}
