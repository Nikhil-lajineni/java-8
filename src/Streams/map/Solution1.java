package Streams.map;

import java.util.Arrays;
import java.util.List;

public class Solution1 {
    // using stream show output which starts with A and also show output with its length.
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ashok", "Anil", "Raju", "Rani", "John", "Akash", "Charles");
        names.stream().filter(i->i.startsWith("A")).map(i-> i+"-"+ i.length()).forEach(
                i->System.out.println(i));

    }
}
