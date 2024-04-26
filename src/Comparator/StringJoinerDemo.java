package Comparator;

import java.util.StringJoiner;

public class StringJoinerDemo {

    public static void main(String[] args) {

        StringJoiner sj1 = new StringJoiner("-");
        sj1.add("nikhil");
        sj1.add("likes");
        sj1.add("java");
        System.out.println(sj1);

        StringJoiner sj2 = new StringJoiner("-", "(", ")");
        sj2.add("nikhil");
        sj2.add("likes");
        sj2.add("java");
        System.out.println(sj2);

    }

}

