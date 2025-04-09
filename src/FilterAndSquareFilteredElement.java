import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterAndSquareFilteredElement {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,21,13,12,14,15,16);

        List<Integer>list1=list.stream()
                .filter(n->n >= 10 && n<16)
                .map(n->n*n)
                .collect(Collectors.toList());
        System.out.println(list1);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");

        List<Integer>list2=list.stream()
                .filter(n->n <10 )
                .map(n->n +n)
                .collect(Collectors.toList());
        System.out.println(list2);
    }
}
