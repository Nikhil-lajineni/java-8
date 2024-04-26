package Lambda.Functional2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Person {
    String name;
    int age;
    Person(String name,int age){
        this.age=age;
        this.name=name;
    }

    public static void main(String[] args) {
        Person p1=new Person("nikhil",25);
        Person p2=new Person("abc",10);
        Person p3=new Person("xyz",40);
        Person p4=new Person("ijk",15);
       List<Person> list= Arrays.asList(p1,p2,p3,p4);
        Predicate<Person> p=(x)->x.age>16;
        for(Person k: list){
            if(p.test(k)){
                System.out.println(k.name);
            }
        }
    }
}
