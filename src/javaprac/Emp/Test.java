package Emp;

public class Test {
    static void main(String[] args) {
        Employee emp1=new Employee("rahil",18,100000);
        System.out.println(emp1.EmpDetails());
        emp1.setSalary(120000);
        System.out.println(emp1.getSalary());
    }

}
