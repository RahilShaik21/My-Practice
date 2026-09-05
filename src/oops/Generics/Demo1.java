package oops.Generics;

public class Demo1<T extends Number ,U> {
    static void main(String[] args) {
        Pair<Integer,String> p1=new Pair<>(2,"hi");
        System.out.println(p1.first+" "+p1.second);
//        Integer i=(Integer) Demo1.getResult(97);
        Demo1.getResult("dnn");
//        Demo1<String> d=new Demo1();
//        d.print();
    }
    public static <T>T getResult(T x){
        return x;
    }
    public  void print(T first,U second){
        System.out.println(first+" "+second);
    }
}
class Pair<T,U>{
    T first;
    U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
}

class Animal{
    void display(){
        System.out.println("diplaying Animal");
    }
}
class Box<T extends Animal & Swim>{
    T value;

    static void main(String[] args) {
        Box<Fish> n=new Box<>();
    }
}
class Dog extends Animal{

}
interface Swim{
    void swim();
}
class Fish extends Animal implements Swim{

    @Override
    public void swim() {

    }
}