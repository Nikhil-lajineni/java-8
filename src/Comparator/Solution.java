package Comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 7, 9, 10);
        Collections.sort(list,(a,b)->a>b?-1:1);
        list.forEach((x)->System.out.println(x));
    }
}
