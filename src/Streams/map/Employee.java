package Streams.map;

import java.util.Arrays;
import java.util.List;

public class Employee {
    String name;
    int age;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    double salary;
    //Task : Print Emp Name with Emp age whose salary is >= 50,000 using Stream API.
    public static void main(String[] args) {
        Employee e1 = new Employee("John", 35, 55000.00);
        Employee e2 = new Employee("David", 25, 45000.00);
        Employee e3 = new Employee("Buttler", 35, 35000.00);
        Employee e4 = new Employee("Steve", 45, 65000.00);
        List<Employee> list = Arrays.asList(e1, e2, e3, e4);
//        list.stream().filter(i->i.salary>=50000).map(i->i.name+"-"+i.age).forEach(i->System.out.println(i));
        list.stream().filter(i->i.salary>=50000).forEach(i->System.out.println(i.name+"-"+i.age));


    }
}
