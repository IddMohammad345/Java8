package CoreJavaPractice;
//Find the sum of the digits of number
public class Sum_of_digits_of_num {
    public static void main(String[] args) {
        long num=7093956524L;
        System.out.println("=======using core java ========");
        long sum=0, rem=0, temp;
        temp=num;
        while (num>0){
            rem=num % 10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("sum of Digits of "+ temp + " is "+sum);

        System.out.println("========Same Operation using java 8==========");
        long num1=7093956524L;
        int total= String.valueOf(num1)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println(total);
    }
}
