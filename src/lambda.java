import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public  class lambda{
    public static void main(String[] args) {
        functionalInterface add= Integer::sum;
        functionalInterface mul=(a,b)->a*b;
        functionalInterface sub=(a,b)->a-b;
        functionalInterface div=(a,b)->a/b;

        System.out.println("Addition : "+arthemetic(2,3,add));
        System.out.println("Subtraction : "+arthemetic(3,5,sub));
        System.out.println("Multiplication : "+arthemetic(5,8,mul));
        System.out.println("Division : "+arthemetic(5,5,div));

        System.out.println("===============================================");

        List<String>fruit= Arrays.asList("mango","orange","jackfruit","pineapple","grapes");
        //before lambda Expression
        for (String f:fruit){
            System.out.println(f);
        }

        //after lambda Expression
        fruit.forEach(System.out::println);
        System.out.println("======================================");
        //Stream Api
        List<String>name=Arrays.asList("Anju","Amir","Akash","Ashiq","Anwar");

        List<String> list = name.stream().filter(n -> n.length() > 4).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(list);
    }

    private static int arthemetic(int a, int b,functionalInterface op) {
        return op.arthemetic(a,b);
    }
}
