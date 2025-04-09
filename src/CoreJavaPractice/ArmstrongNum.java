package CoreJavaPractice;

//java program to find armstrong Number
public class ArmstrongNum {
    public static void main(String[] args) {
        int n;
              int  arg;
                      int sum=0;
                              int r;
        n=153;//input
        arg=n;
        for (int i=1;i<n;i++){
            while (n>0){
                r=n%10;
                sum=sum+(r*r*r);
                n=n/10;
            }
        }
        if (arg==sum){
            System.out.println("Given number is armstrong number: "+arg);
        }else {
            System.out.println("Given number is not a armstrong number: "+arg);
        }




        //printing Armstrong Number using java 8 feature

        int num=150;
        int summed = String.valueOf(num)
                .chars()
                .map(Character::getNumericValue)
                .map(digit -> (int) Math.pow(digit, String.valueOf(num).length()))
                .sum();
        if (num==summed){
            System.out.println("given number is armstrong number :"+num);
        }else {
            System.out.println("not a armstrong number : "+num);
        }
    }
}
/*
An Armstrong number (also known as a narcissistic number or pluperfect digital invariant) is a number that is equal to the sum of its own digits, each raised to the power of the number of digits.

For example, let's look at the number 153:

- It has 3 digits.
- Raise each digit to the power of 3 (the number of digits):
  - \(1^3 = 1\)
  - \(5^3 = 125\)
  - \(3^3 = 27\)
- Now, add these up: \(1 + 125 + 27 = 153\)

Since the sum of the cubes of its digits equals the number itself, 153 is an Armstrong number.

### Examples of Armstrong numbers:
- **153** (as shown above)
- **370**: \(3^3 + 7^3 + 0^3 = 370\)
- **407**: \(4^3 + 0^3 + 7^3 = 407\)

The concept applies to any number of digits.
*/