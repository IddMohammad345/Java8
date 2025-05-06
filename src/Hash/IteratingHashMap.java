package Hash;

import java.util.*;

public class IteratingHashMap {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"Idd");
        map.put(2,"Fate");
        map.put(3,"Alam");
        map.put(4,"mohammad");
        Map<Integer,String>map1=new HashMap<>();
        map1.put(1,"Idd");
        map1.put(2,"Fate");
        map1.put(3,"Alam");
        map1.put(4,"mohammad");

        map.forEach((key, value) -> System.out.println(key + "  : " + value));

        //creating ArrayList
        List<Object>list=new ArrayList<>();
        list.add(map);
        list.add(map1);
        list.forEach(System.out::println);

        System.out.println("===============================================================");
        for (Map.Entry<Integer,String>m:map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
