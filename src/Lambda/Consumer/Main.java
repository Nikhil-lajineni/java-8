package Lambda.Consumer;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
       Consumer<String> consumer=(s)->System.out.println(s.length());
       consumer.accept("nikhil");
       Consumer<Integer> consumer1=(i)->System.out.println(i+100);
       consumer1.accept(20);

    }
}
