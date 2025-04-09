package CoreJavaPractice;
//program to print Armstrong number between 1 and 1000
public class ArmstrongNumBetween1To1000 {
    public static void main(String[] args) {
        int num,rem,limit=1000,sum=0;
        System.out.println("Armstrong numbers from 1 to "+limit);
        for (int i=1;i<=limit;i++){
            num=i;
            while (num>0){
                rem=num%10;
                sum=sum+(rem*rem*rem);
                num=num/10;
            }
            if (sum==i){
                System.out.println(i+" ");
            }sum=0;
        }

        //finding using java 8
        System.out.println("=======finding using java 8 feature=======");
        for (int i = 1; i <= limit; i++) {
            int numDigits = String.valueOf(i).length();  // Calculate the number of digits once
            int sum1 = String.valueOf(i).chars()
                    .map(Character::getNumericValue)   // Convert each char to digit
                    .map(d -> (int) Math.pow(d, numDigits)) // Raise each digit to the power of numDigits
                    .sum();  // Sum all the powered digits

            // Check if the sum equals the number itself (Armstrong number)
            if (i == sum1 && numDigits>1) {
                System.out.println(i + " is an Armstrong number");
            }
        }
    }
}
