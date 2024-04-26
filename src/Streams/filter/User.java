package Streams.filter;

import java.util.Arrays;
import java.util.List;

public class User {
    int age;
    String name;
    User(String name,int age){
        this.age=age;
        this.name=name;
    }

    public static void main(String[] args) {
        User u1 = new User("Anushka", 25);
        User u2 = new User("Smith", 30);
        User u3 = new User("Raju", 15);
        User u4 = new User("Rani", 10);
        User u5 = new User("Charles", 35);
        User u6 = new User("Ashok", 30);
        List<User> list = Arrays.asList(u1, u2, u3, u4, u5, u6);
//        list.stream().filter(x->x.age>18).forEach(x->System.out.println(x.name));
//        list.stream().filter(x->x.age>18 && x.name.startsWith("A")).forEach(x->System.out.println(x.name));
        list.stream().filter(x->x.age>18).filter(x->x.name.startsWith("A")).
        forEach(x->System.out.println(x.name));
    }
}
