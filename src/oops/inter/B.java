package oops.inter;

public interface B{
    void greet();
//    void fun();
}
class C implements A{

//    @Override
//    public void greet() {
//        System.out.println("hi");
//    }

//    @Override
//    public void fun() {
//        System.out.println("hello");
//    }
static void main(String[] args) {
    MIan obj=new MIan();
    A.greet();
}
}