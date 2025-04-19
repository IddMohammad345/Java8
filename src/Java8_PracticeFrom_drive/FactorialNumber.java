package Java8_PracticeFrom_drive;

public class FactorialNumber {
    public static void main(String[] args) {
        int num=4;
        int fac=1;
        for (int i=1;i<=num;i++){
            fac=fac*i;
        }
        System.out.println(fac);


        System.out.println("=====================================");
        int factorial=1;
        for (int i=1;i<=num;i++){
            System.out.println(num+" * "+i+" = "+(factorial=factorial*i));
        }
    }

}
