package CoreJavaPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Total odd numbers between 1 - 100
public class TotalNumOfOddNum {
    public static void main(String[] args) {
        int count = 0;
        for (int i=1 ; i <= 100; i++){
            if (i % 2 != 0){
                count++;
            }
        }
        System.out.println("Total odd numbers between 1 - 100 are : "+count);


    }
}
