import java.util.Arrays;
import java.util.List;

public class AverageNumberInList {
    public static void main(String[] args) {

        String s1=new String("abc");
        String s2=new String("abc");
        String s3="abc";

        System.out.println("s1.equals(s2)  :  "+s1.equals(s2));
        System.out.println(" s1 == s2 : "+s1 == s2);
        System.out.println(" s1 == s3 : "+s1 == s3);
        System.out.println("s1.equals(3) : "+s1.equals(s3));

        System.out.println("================================");
        List<Double>list= Arrays.asList(1.0,2.0,3.0,4.0,5.0,6.0,8.0);
        double asDouble = list.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .getAsDouble();
        System.out.println(asDouble);
    }
}
