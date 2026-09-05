package oops.singleton;


public class Main {

    public static void main(String[] args) {
        Singleton obj=Singleton.getInstance();
       Singleton obj1=Singleton.getInstance();
       Singleton obj2=Singleton.getInstance();
       //all the three obj are pointing to one object

    }
}
