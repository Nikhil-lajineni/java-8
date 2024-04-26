package MethodRef.MethodRef2;

import java.util.function.Supplier;

public class Solution {
    public static void main(String[] args) {

//    Doctor doctor=new Doctor();
        Supplier<Doctor> s = Doctor::new;
        Doctor d = s.get();
        d.m1();
    }
}
