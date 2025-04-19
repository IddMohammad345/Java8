package Java8_PracticeFrom_drive;

import java.util.*;
import java.util.stream.Collectors;

public class MinAndMaxSalaryOfEmployee {
    public static void main(String[] args) {
        List<Employee>list=new ArrayList<>(
        Arrays.asList(
                new Employee("Raju",20,12000.00),
                new Employee("sai",23,12000.00),
                new Employee("dasu",20,14000.00),
                new Employee("sri",20,19000.00)
        ));
        list.add(new Employee("idd",23,12000.00));

        Optional<Employee> minSalary = list.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println( "Employee with min salary: "
                +(minSalary.isPresent()?minSalary.get():"Not Applicable")
        );
        System.out.println("=================================================================");
        Optional<Employee> maxSalary=list.stream()
                .collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));

        System.out.println("Employee with max salary : "
        +(maxSalary.isPresent()?maxSalary.get():"Not Applicable")
        );


        System.out.println("=====================using max method===============================");
     Employee sal= list.stream()
             .max(Comparator.comparing(Employee::getSalary)).get();
        System.out.println(sal);
    }

}
class Employee{
    private String name;
    private Integer age;
    private Double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) && Objects.equals(age, employee.age) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}