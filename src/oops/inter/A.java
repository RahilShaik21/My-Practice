package oops.inter;

public interface A{
    //static interface method have a body
    static void greet(){
        System.out.println("i am in static in A");
    }
    default void fun(){
        System.out.println("i am in A");
    }
    interface Ak{
        void fun2();
    }
}
class MIan implements A,B{

    @Override
    public void greet() {
        System.out.println("i am B");
    }

    @Override
    public void fun() {
        A.super.fun();
    }
}

