package oops;

public abstract class AbsClass {
    abstract void carrer();
    int age;
    final int VAL;
    void cap(){
        System.out.println("on your left");
    }
    static void greet(){
        System.out.println("bring me thanos");
    }
    public AbsClass(int age,int val) {
        this.age = age;
        this.VAL=val;
    }
}
class Child extends AbsClass{
    int age;

    public Child(int age) {
        super(age,age);
        this.age = age;
    }
    @Override
    void cap(){
        System.out.println("on your right");
    }
    @Override
    void carrer() {

        System.out.println("I am iron man");
    }
}
class Doughter extends AbsClass {
    int age;

    @Override
    void carrer() {
        System.out.println("i am thor,odin son");
    }

    public Doughter(int age) {
        super(age,age);
        this.age = age;
    }
}
    class Main{
        static void main(String[] args) {
            Child son=new Child(16);
            Doughter lil=new Doughter(7);
            son.carrer();
            lil.carrer();
//            AbsClass abs=new AbsClass(876);
//        AbsClass abs=new AbsClass(876) {
//            @Override
//            void carrer() {
//                System.out.println("sbd");
//            }
//        };
//        abs.carrer();
            AbsClass.greet();
            AbsClass asb=new Child(32);
            asb.cap();

        }

    }

