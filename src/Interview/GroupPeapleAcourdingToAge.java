package Interview;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupPeapleAcourdingToAge {
    public static void main(String[] args) {
        List<person>list= Arrays.asList(
                new person("Raj",10),
                new person("Rakesh",22),
                new person("Amir",23),
                new person("Arjun",24)
        );

        Map<Integer, List<person>> collect = list.stream()
                                              .collect(Collectors.groupingBy(person::getAge));

        collect.forEach((age,group)->{System.out.println("age : "+age);
        group.forEach(person -> System.out.println("name : "+person.getName()));
        });
    }
}
class person{
    String name;
    int age;
    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}