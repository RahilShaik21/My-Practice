package oops.singleton;

public class Singleton {
    private Singleton(){
        //constructor
    }
    private static Singleton Instance;
    public static Singleton getInstance(){
        if(Instance ==null){
            Instance =new Singleton();
        }
        return Instance;
    }
}
