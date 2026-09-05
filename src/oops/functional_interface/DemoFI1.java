package oops.functional_interface;


public class DemoFI1 {
    static void main(String[] args) {
        Calculator c=(a,b)->a+b;
        print(1,2,c);
    }
    public static void print(int a,int b,Calculator c){
        System.out.println(c.calculate(a,b));
    }
}
@FunctionalInterface
interface Calculator{
    int calculate(int a,int b);
}
