package oops.functional_interface;

import com.sun.jdi.IntegerType;

import java.util.*;
import java.util.function.*;

public class DemoFI2{
    static void main(String[] args) {
        Function<Integer,Integer> squar=(x)->x*x;
//        System.out.println(squar.apply(5));
        Consumer<Integer> c=x-> System.out.println(x);
//        c.accept(6);
        Supplier<Double> s=()->Math.random();
//        System.out.println(s.get());
        Predicate< Integer> p=(x)->x%2==0;
//        System.out.println(p.test(3));
        List<Integer> list=new ArrayList<>(List.of(1,2,3,4,5,6,7));
//        for(Integer i:list){
//            System.out.println(i);
//        }
//        list.forEach(x-> System.out.println(x));
//        list.forEach(System.out::println);
        list.forEach(Soi::sos);

    }
}
class Soi{
    public static void sos(int n){
        System.out.println("hu ->"+n);
    }
}