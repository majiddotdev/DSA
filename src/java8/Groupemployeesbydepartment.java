package java8;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Groupemployeesbydepartment {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee(1,"Alice", "HR", 50000),
                new Employee(2,"Bob", "IT", 70000),
                new Employee(3,"Charlie", "HR", 55000),
                new Employee(4,"David", "IT", 80000),
                new Employee(5,"Eve", "Finance", 60000)
        );
        Map<String, List<Employee>> map1 = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(map1);


    }
}
