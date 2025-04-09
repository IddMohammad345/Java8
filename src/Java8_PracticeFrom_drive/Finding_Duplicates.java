package Java8_PracticeFrom_drive;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Finding_Duplicates {
    public static void main(String[] args) {
        List<String>companies= Arrays.asList("Infosys","Bajaj","wipro","TCS","Bajaj","TCS");

        List<String> dublicateCompanies = companies.stream()
                .filter(company -> Collections.frequency(companies, company) > 1)
                .collect(Collectors.toList());
        System.out.println(dublicateCompanies);

        System.out.println("=====================================================================");

        //printing using chat gpt
        Map<String,Long>frequencymap=companies.stream()
                .collect(Collectors.groupingBy(e->e,Collectors.counting()));

        //print the duplicates
        frequencymap.entrySet().stream()
                .filter(e->e.getValue()>1)
                .forEach(c-> System.out.println(c.getKey()));
    }
}
