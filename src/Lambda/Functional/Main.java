package Lambda.Functional;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
      Function<String,Integer> f=(s)->{
          return s.length();
      };
      System.out.println(f.apply("nikhil"));
      BiFunction<Integer,Integer,Integer> biFunction=(a,b)->{
          return a+b;
      };
      System.out.println(biFunction.apply(5,10));



    }
}
