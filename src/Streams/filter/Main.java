package Streams.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //app 1
        List<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(6);
        list.stream().filter(i->i>2).forEach(i->System.out.println(i));
        //app 2
        List<String> names = Arrays.asList("John", "Anushka", "Anupama", "Smith", "Ashok");
        names.stream().filter(i->i.startsWith("A")).forEach(i->System.out.println(i));

    }
}
