package Lambda.Supplier;

import java.util.Random;
import java.util.function.Supplier;

public class Solution {
    public static void main(String[] args) {
       Supplier s=()->{
           int x=0;
           Random random=new Random();
           for(int i=0;i<5;i++){
               x+=random.nextInt();
           }
           return x;
       };
       System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());

    }
}
