package CoreJavaPractice;

//Finding the sum of first n numbers
public class Sum_Of_First_n_Num {
    public static void main(String[] args) {
        int sum = 0 ;
        int n =10 ;
        for (int i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("The Sum of "+"1 To "+n+" Numbers are : "+sum);
    }
}
