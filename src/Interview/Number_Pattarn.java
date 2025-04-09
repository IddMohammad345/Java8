package Interview;

import java.util.Scanner;

public class Number_Pattarn {
    public static void main(String[] args) {
        Number_Pattarn m=new Number_Pattarn();
        m.pattarnPrinte(5);
        Scanner scanner=new Scanner(System.in);

        // Read input from user
        System.out.println("Inter Number");
        int n = scanner.nextInt();


        for (int i = 1; i <= n; i++) {
            StringBuilder stringBuilder=new StringBuilder();
            for (int j=1;j<=i;j++){
                stringBuilder.append(i);
            }
            System.out.println(stringBuilder.toString());
        }

        scanner.close();
    }
    public void pattarnPrinte(int n){
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
