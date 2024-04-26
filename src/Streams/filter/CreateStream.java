package Streams.filter;

import java.util.ArrayList;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        //way 1
        Stream<Integer> integerStream = Stream.of(1, 4, 5, 2, 3);
        System.out.println(integerStream);
        //way 2
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(5);
        list.add(6);
        Stream<Integer> stream = list.stream();
        System.out.println(stream);
    }
    // intermediate and terminal
}
