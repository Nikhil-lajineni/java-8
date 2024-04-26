package Lambda.Functional2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Employee {
    String name;
    int deptId;
    String location;
    Employee(String name,int id,String location){
        this.name=name;
        this.deptId=id;
        this.location=location;
    }

    public static void main(String[] args) {
        Employee e1=new Employee("nikhil",1,"hyd");
        Employee e2=new Employee("abc",2,"ban");
        Employee e3=new Employee("xyz",3,"che");
        Employee e4=new Employee("ijk",4,"del");
        List<Employee> list = Arrays.asList(e1, e2, e3, e4);
        Predicate<Employee> p1=x->x.location.equals("hyd");
        Predicate<Employee> p2=x->x.name.equals("nikhil");
        Predicate<Employee> p3=x->x.deptId==1;
        Predicate p=p1.and(p2).and(p3);
        for(Employee e:list){
            if(p.test(e)){
                System.out.println(e.name +" "+ e.deptId);
            }
        }
    }
}