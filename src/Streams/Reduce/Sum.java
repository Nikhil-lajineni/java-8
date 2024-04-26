package Streams.Reduce;

import java.util.Arrays;
import java.util.List;

public class Sum {
    public static void main(String[] args) {
        int x=1;
       int list[]={1,2,3,4,5};
       int reduce= Arrays.stream(list).reduce(x,(a,b)->a+b);
        System.out.println(reduce);
    }
}
