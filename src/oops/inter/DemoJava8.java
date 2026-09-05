package oops.inter;

public class DemoJava8 implements vehicle{
    @Override
    public void move(){
        System.out.println("...");
    }
    static void main(String[] args) {
        DemoJava8 d=new DemoJava8();
        d.move();
    }
}
interface vehicle{
    default void move(){
        System.out.println("vehicle is moving");
        accelerate();
    }
    static void brake(){
        System.out.println("vehicle is stop");
    }
    private void accelerate(){
        System.out.println("vehicle is accelerating");
    }
}

interface A1{
    void fun();
}
interface A2 extends A1{
    default void fun(){
        System.out.println("A2");
    }
}
interface A3 extends A1{
    default void fun(){
        System.out.println("A3");
    }
}
class A4 implements A2,A3,Cloneable{
    @Override
    public void fun() {
        System.out.println("A4");
    }
@Override
public Object clone() throws CloneNotSupportedException{
        return super.clone();
}
   static void main(String[] args) throws CloneNotSupportedException {
//        B3 b=new B3();
//        b.fun();
//        A4 a=new A4();
//        A4 aa=(A4) a.clone();
        String s1="ja";
        String s2=s1+"va⭐";
        String s3="java";
        String s4=s2;
        s2="Java";
       System.out.println(s2+""+s4);
       System.out.println(s4==s2);
       System.out.println(s2);
    }
}
interface B1{
    default void fun(){
        System.out.println("B1");
    }
 }
 class B2{
    public void fun(){
        System.out.println("B2");
    }
 }
 class B3 extends B2 implements B1{

 }