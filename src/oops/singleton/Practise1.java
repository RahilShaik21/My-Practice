package oops.singleton;

import oops.encapsulation.A;

public class Practise1 extends A {
    public Practise1(int num, String name) {
        super(num, name);
    }
    Practise1 num = new Practise1(24, "sbkhbh");
    String name = num.name;

//    A rahil=new A(23,"dss");
//    String n= rahil.name;

//class Subclass extends Practise1{
//    public Subclass(int num, String name) {
//        super(num, name);
//    }
static void main(String[] args) {
    Practise1 obj=new Practise1(3,"sj");
    String n=obj.name;
    if(obj instanceof A){
    System.out.println(true);}
}

}
