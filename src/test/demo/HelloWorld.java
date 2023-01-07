package test.demo;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class HelloWorld {
    public static void main(String[] args) {



        System.out.println("Hello world");

        List<Employee> employeeList = Arrays.asList(new Employee(10, "Jhon", "Smith", "john.smith@email.com", 234, 3434.09, 23),
                new Employee(2, "Gary", "Jordan", "gary.smith@email.com", 235, 2434.09, 42),
                new Employee(6, "France", "Windy", "france.smith@email.com", 236, 1434.09, 34));

                employeeList.stream().forEach(System.out::println);
                //List<Employee> employeeList1= employeeList.stream().map(e->e.setSalary(e.getSalary() + 1000.00)).collect(Collectors.toList());
                    employeeList.stream().forEach(employee -> employee.setSalary(employee.getSalary()+1000.00));

        Collections.sort(employeeList, Employee.ageComparator);
        System.out.println(employeeList);
        employeeList.stream().forEach(System.out::println);
        Collections.reverse(employeeList);
        employeeList.stream().forEach(System.out::println);

        employeeList.sort(Comparator.comparing(Employee::getFirstName));

        employeeList.stream().forEach(System.out::println);

        employeeList.stream().sorted(Comparator.comparingInt(Employee::getAge)).forEach(System.out::println);
        System.out.println("Age > 30");
        employeeList.stream().filter(employee -> employee.getAge()>30).forEach(System.out::println);
        System.out.println("Max Age");
        Employee emp= employeeList.stream().max(Comparator.comparing(Employee::getAge)).get();
        System.out.println(emp.toString());
        Map<String, Long> empl =  employeeList.stream().collect(groupingBy(Employee::getLastName, counting()));
        System.out.println(empl);

    }

    public void print(){
        System.out.println("Printing...");
    }
}
