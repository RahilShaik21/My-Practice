package oops.encapsulation;
 class Mian extends A{
     public Mian(int num, String name) {
         super(num, name);
     }

    Mian a=new Mian(21,"rahil");
    int num=a.getNum();
    String k=a.name;


     static void main(String[] args) {
         A rahil=new A(23,"dss");
         String n= rahil.name;
         System.out.println(rahil instanceof A);
         System.out.println(rahil.getClass().getName());
     }
 }
