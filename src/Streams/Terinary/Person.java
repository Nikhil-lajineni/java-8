package Streams.Terinary;



import java.util.Arrays;
import java.util.List;

public class Person {
    String name;
    String country;
    Person(String name,String country){
        this.country=country;
        this.name=name;
    }
    public static void main(String[] args) {
        Person p1 = new Person("John", "USA");
        Person p2 = new Person("Steve", "JAPAN");
        Person p3 = new Person("Ashok", "INDIA");
        Person p4 = new Person("Ching", "CHINA");

        List<Person> persons = Arrays.asList(p1, p2, p3, p4);
        /*1)  boolean anyMatch (Predicate p )
2)  boolean allMatch (Predicate p )
3)  boolean noneMatch (Predicate p )

         */
        boolean india = persons.stream().anyMatch(i -> i.country.equals("INDIA"));
        System.out.println(india);
        boolean second=persons.stream().allMatch(i->i.name.startsWith("a"));
        System.out.println(second);
        boolean third=persons.stream().noneMatch(i->i.country.equals("hello"));
        System.out.println(third);

    }
}
