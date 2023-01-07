package test.demo;

import java.util.Comparator;

public class Employee implements Comparable<Employee> {

    private Integer empId;
    private String firstName;
    private String lastName;

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", depId=" + depId +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }

    private String email;
    private Integer depId;
    private double salary;

    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Employee(Integer empId, String firstName, String lastName, String email, Integer depId, double salary, Integer age) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.depId = depId;
        this.salary = salary;
        this.age = age;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getDepId() {
        return depId;
    }

    public void setDepId(Integer depId) {
        this.depId = depId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        return this.empId - o.empId;
    }

    public static final Comparator<Employee> NameComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.firstName.compareTo(o2.firstName);
        }

    };

    public static final Comparator<Employee> ageComparator = new Comparator<Employee>(){

        @Override
        public int compare(Employee o1, Employee o2) {
            return o2.getAge().compareTo(o1.getAge());
        }

    };

    public static final HelloWorld hello = new HelloWorld(){
        @Override
        public void print() {
            super.print();
        }
    };
}
