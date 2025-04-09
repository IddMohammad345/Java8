package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ProductOfArrays {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5); //the output should be [120,60,40,30,24]
        Integer reduce = list.stream()
                .reduce(1, (a, b) -> a * b);//calculate the product of all elements //120 result


        //for each element,divide the total product by the element
        List<Integer> list1 = list.stream()
                .map(num -> reduce / num)//(120/1),(120/2),(120/3),(120/4),(120/5)
                .collect(Collectors.toList());
        System.out.println(list1);
    }
}
