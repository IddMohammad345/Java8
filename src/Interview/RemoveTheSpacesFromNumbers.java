package Interview;

import java.util.Scanner;

public class RemoveTheSpacesFromNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the numbers : ");
        String number=scanner.nextLine();

        String numberWithoutSpace=number.replaceAll("\\s","");
        System.out.println(numberWithoutSpace);

        scanner.close();
    }
}
