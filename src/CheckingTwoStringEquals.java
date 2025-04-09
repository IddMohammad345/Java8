import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckingTwoStringEquals {
    public static String check(String str1,String str2){
        char[] st=str1.toCharArray();
        char[] st1=str2.toCharArray();
        Arrays.sort(st);
        Arrays.sort(st1);
        if(Arrays.equals(st, st1)){
            return "it is equal";
        }else {
            return "not equal";
        }
    }

    public static  void number(Integer[] num1){
        List<Integer> n=Arrays.asList(num1);
        List<Integer> r = n.stream().skip(3).collect(Collectors.toList());
        System.out.println(r);
    }

    public static void main(String[] args) {
        System.out.println( CheckingTwoStringEquals.check("abc","cba"));

        number(new Integer[]{1,2,3,4,4,5,5,6,6,7,7,8});

        System.out.println(
        );
    }
}
