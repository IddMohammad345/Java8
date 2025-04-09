package Interview;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveNullValues_HCL {
    public static void main(String[] args) {

        //List<String> strings = Arrays.asList("abc", "", "PQR", null, "pass", "fail");
       //1) remove all null and empty strings, and all the string should be in capital case
       // strings.stream().removeAll("//s", "").toUpperCase();

       /* List<String> removeNulls = strings.stream().filter(n -> n != null && !n.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(removeNulls);*/

        System.out.println("=======================================================");
        List<String>stringList=new ArrayList<>(Arrays.asList("abc","","PQR",null,"pass","fail"));
        stringList.replaceAll(s -> (s != null && !s.isEmpty()) ? s.toUpperCase() : null);
        stringList.removeAll(Collections.singleton(null));
        System.out.println(stringList);

        //  List<String> st = Arrays.asList("abc", "", "PQR", null, "pass", "fail");
        //  st.removeAll(Arrays.asList(null,""));
        //  st.replaceAll(String::toUpperCase);
        // System.out.println(st);
        System.out.println("=======================================================");

        String s1="hello";
        String s2="hello";
        String s3 = new String("hello");
        System.out.println(s1==s2); //true
        System.out.println(s2==s3); //false
        System.out.println(s1.equals(s3));//true

        System.out.println("========================================================");

        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"Ram");
        map.put(2,"Abay");
        map.put(3,"Vinay");
        map.put(4,"Komal");
        map.put(5,"Virat");

       map.entrySet().stream().forEach(n-> System.out.println(n.getKey()+" "+n.getValue()));
        System.out.println("=========================================");
        /*output:
        ======
        2, Abay
        4, Komal
        1, Ram
        3, Vinay
        5, Virat
*/
        List<Integer>custom=Arrays.asList(2,4,1,3,5);
        custom.stream()
                .map(key->new AbstractMap.SimpleEntry<>(key,map.get(key)))
                .forEach(n-> System.out.println(n.getKey()+" "+n.getValue()));
    }
}
