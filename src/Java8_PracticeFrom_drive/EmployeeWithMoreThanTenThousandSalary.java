package Java8_PracticeFrom_drive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EmployeeWithMoreThanTenThousandSalary {
    public static void main(String[] args) {

        List<Emp>list=new ArrayList<>(
        Arrays.asList(new Emp(3,"Dholu",4000.22),
                new Emp(4,"Bholu",6000.44),
                new Emp(5,"Chutki",67000.84)));

        list.add(new Emp(1,"Raju",4000.33));
        list.add(new Emp(2,"Kaliya",50008.3));

        list.stream()
                .filter(emp -> emp.getSalary()>10000.00)
                .forEach(emp -> System.out.println("id : "+emp.getId()
                        +" \n name : "+emp.getName()
                        +" \n salary : "+emp.getSalary()));
    }
}
class Emp{
    private Integer id;
    private String name;
    private Double salary;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Emp(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}