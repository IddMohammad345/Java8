package Interview;


public class AddTenDigitNumber {
    public static void main(String[] args) {
        Long number=7093956524L;
        long sum = String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sum);

        System.out.println("============================================");
        //adding 10 digit number
        int sum1=String.valueOf(number)
                .chars()
                .map(Character::getNumericValue)
                .sum();
        System.out.println(sum1);
    }

}
