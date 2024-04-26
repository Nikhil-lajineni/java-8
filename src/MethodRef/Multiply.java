package MethodRef;

public class Multiply {
    public void mul(int a, int b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        Multiply m=new Multiply();
        Functional f=m::mul;
        f.m1(5,6);
    }
}
