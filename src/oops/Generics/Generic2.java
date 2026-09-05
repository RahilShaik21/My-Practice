package oops.Generics;

import java.util.ArrayList;
import java.util.List;

public class Generic2 {
    static void main(String[] args) {
//        Animal1 a=new Animal1();
//        a.eat();
//        a.walk();
//    List<Dog1> dogs=new ArrayList<>();
//    List<Animal1> an=dogs;
        Dog1[] don=new Dog1[10];
        Animal1[] ani=don;
        ani[0]=new Dog1();
        ani[1]=new Dog1();
        ani[2]=new Dog1();
        ani[3]=new Dog1();
        ani[4]=new Animal1();
        for(Animal1 animal1:ani){
            if(animal1==null){
                continue;
            }
            animal1.eat();
        }
    }
}

class Deemo{
    static void main(String[] args) {
//        List<Dog1> d=new ArrayList<>();
//        d.add(new Dog1());
//        d.add(new Dog1());
//        fun(d);
        List<Animal1> a=new ArrayList<>();
        a.add(new Animal1());
        a.add(new Animal1());
        fun(a);
    }
//    static void fun(List<Animal1> animals){
//        for(Animal1 animal1:animals){
//            animal1.eat();
//        }
//    }
//    static  void fun(List<? extends Animal1> values){
//        for(Animal1 obj:values){
//            values.add(new Dog1());
//            System.out.println(obj.getClass().getName());
//            obj.eat();
//
//        }
//    }
    static void fun(List<? super Animal1> values){
        values.add(new Animal1());
        values.add(new Dog1());
        for(Object obj:values){
            Animal1 a=(Animal1) obj;
            a.eat();
        }
    }
}
class Animal1{
    void eat(){
        System.out.println("Eating");
    }
    void walk(){
        System.out.println("walking");
    }
}
class Dog1 extends Animal1{
    @Override
    void eat(){
        System.out.println("dog eating");
    }
    void bark(){
        System.out.println("barking");
    }
}