package Lambda.FunctionalAgain;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Employee {
    String name;
    int deptNo;
    String location;
    Employee(String name,int deptNo,String location){
        this.deptNo=deptNo;
        this.name=name;
        this.location=location;
    }

    public static void main(String[] args) {
        Employee e1=new Employee("rupali",1,"pune");
        Employee e2=new Employee("nikhil",2,"hyd");
        Employee e3=new Employee("amrita",3,"chennai");
        Employee e4=new Employee("akhil",4,"warangal");
        List<Employee> list = Arrays.asList(e1, e2, e3, e4);
        Predicate<Employee> p=(e)->e.name.charAt(0)=='a';
        for(Employee emp: list){
            if(p.test(emp)){
                System.out.println(emp.name);
            }
        }
    }
}
