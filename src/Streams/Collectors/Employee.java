package Streams.Collectors;

import java.util.*;
import java.util.stream.Collectors;
// Write a java program to get MAX, MIN and AVG salary from given employees data using Stream API.
class Employee {
    int id;
    String name;
    double salary;
    String country;

    public Employee(int id, String name, double salary,String country) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.country=country;
    }
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Robert", 26500.00, "USA");
        Employee e2 = new Employee(2, "Abraham", 46500.00, "INDIA");
        Employee e3 = new Employee(3, "Ching", 36500.00, "CHINA");
        Employee e4 = new Employee(4, "David", 16500.00, "INDIA");
        Employee e5 = new Employee(5, "Cathy", 25500.00, "USA") ;

        List<Employee> list = Arrays.asList(e1, e2, e3, e4, e5);
//        list.stream().forEach(i->System.out.println(i.name+" "+ Thread.currentThread()));
        list.parallelStream().forEach(i->System.out.println(i.name+" "+Thread.currentThread()));

//        Optional<Employee> collect = list.stream().collect(Collectors.maxBy(Comparator.comparing(i -> i.salary)));
//        System.out.println(collect.get().name);
//        Optional<Employee> collect1 = list.stream().collect(Collectors.minBy(Comparator.comparing(i -> i.salary)));
//        System.out.println(collect1.get().name);
//        Double collect2 = list.stream().collect(Collectors.averagingDouble(i -> i.salary));
//        System.out.println(collect2);
//        Map<String, List<Employee>> collect3 = list.stream().
//                collect(Collectors.groupingBy(i -> i.country));
//        System.out.println(collect3);

    }
}
