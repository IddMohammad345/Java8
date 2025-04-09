import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static sun.plugin.util.ProgressMonitor.get;

public class SecondLargestNumber {
    public static void main(String[] args) {
        
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,6,7,7,8,8,4,3,2,6,8,9,10,23);
        //finding second largest number
       int result =list.stream()
               .distinct()
                .sorted((a,b)->b-a)
               .skip(1)
               .findFirst()
               .get();
        System.out.println(result);

        System.out.println("-===============================================-");
        //For Largest number from list
        int collect = list.stream()
                .distinct()
                .min((a, b) -> b - a)
                .get();
        System.out.println(collect);

        System.out.println("==================================");
        List<Integer>list1=Arrays.asList(1,0,1,1,0,1,0,1,0,0,1,1);
        //printing zeros at one side and one's at one side
         List<Integer>res=   list1.stream()
                 .sorted()
                 .collect(Collectors.toList());
         res.forEach(System.out::print);

        System.out.println("\n==================================");
        //printing zeros at one list and one's at other list
        for (Integer o : list1.stream()
                .filter(i->i==0)
                .collect(Collectors.toList())){
            System.out.print(o+" ,");
        }
        System.out.println("\n==================================");
        List<Integer> list2 = list1.stream()
                .filter(integer -> integer == 1)
                .collect(Collectors.toList());
        System.out.println(list2);

    }
}
