package CoreJavaPractice;

public class ElectricBill {
    public static void main(String[] args) {
        int unit=123;
        int bill=0;

        if (unit>100){
            if (unit>=200){
                if (unit>300) {
                    bill = unit * 8;
                }
                else
                    bill=unit*6;
            }
            else
                bill=unit*5;
        }
        System.out.println("CHENNAI ELECTRICITY LTD, CHENNAI");
        System.out.println("Units Consumed: "+unit);
        System.out.println("Total Bill: "+bill);
    }
}
