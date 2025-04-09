package Interview;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListStringBasedOnThereLength {
    public static void main(String[] args) {
        /*
        Write a program to group a list of strings based on their lengths
        and count the number of strings in each group
        For Example:-
        if the input list is
        ["dog","cat",element","rabbit","fox","giraffe","ant",zebra",owl"],
        the out put should be
        Strings of length 3:4 strings (e.g.,"dog","cat","fox","owl")
        Strings of length 5:1 strings (e.g.,"zebra")
        Strings of length 6:2 strings (e.g.,"rabbit","giraffe")
        Strings of length 8:1 strings (e.g.,"elephant")
         */
        List<String>strings= Arrays.asList("dog","cat","element","rabbit","fox","giraffe","ant","zebra","owl");
        Map<Integer,Integer>groupedByLength=new HashMap<>();
        for (String str :strings) {
            int Length=str.length();
            groupedByLength.put(Length,groupedByLength.getOrDefault(Length,0)+1);
        }
        for (Map.Entry<Integer,Integer>entry:groupedByLength.entrySet()){
            System.out.println("String of length "+entry.getKey()+" : "+entry.getValue());
        }
    }
}
