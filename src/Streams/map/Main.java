package Streams.map;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("nikhil", "akhil", "amrita", "divya");
//        list.stream().map(i->i.toUpperCase()).forEach(i->System.out.println(i));
        list.stream().mapToInt(i->i.length()).forEach(i->System.out.println(i));

    }
}
