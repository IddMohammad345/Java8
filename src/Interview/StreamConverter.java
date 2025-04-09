package Interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamConverter {
    public static void main(String[] args) {
        List<Employee>employees=new ArrayList<>();
        employees.add(new Employee(1,"Raju",18));
        employees.add(new Employee(2,"Rakesh",19));
        employees.add(new Employee(3,"Idd",20));

        // Convert the list of Employee objects to a list of EmployeeDTO objects
      List<EmployeeDto> employeeDto=employees.stream()
                .map(emp -> new EmployeeDto(emp.getId(), emp.getName()))
                .collect(Collectors.toList());
      employeeDto.forEach(employeeDto1 -> System.out.println("id = "+employeeDto1.getId()
                                                         +", name ="+employeeDto1.getName()));
    }
}
class Employee{
    private int id;
    private String name;
    private int age;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
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

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
class EmployeeDto{
    private int id;
    private String name;
    public EmployeeDto(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}