package MethodRef.MethodRef3;

import java.util.function.Supplier;

public class MyClass {
    public void m1(){
        for(int i=1;i<11;i++){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        MyClass myClass=new MyClass();
        Runnable runnable=myClass::m1;
        Thread t1=new Thread(runnable);
        t1.start();
    }
}
