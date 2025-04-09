package CoreJavaPractice;

//Display odd numbers between 1-100
public class OddNumber {
    public static void main(String[] args) {
        System.out.println("The odd numbers are : ");
        for (int i=1;i<=100;i++){
            if (i % 2 !=0){
                System.out.print(i+ " ");
            }
        }
    }
}
