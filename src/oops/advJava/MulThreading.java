package oops.advJava;

public class MulThreading {
    static void main(String[] args) {
//        T1 t1=new T1();
//        t1.start();
        MyThread r1=new MyThread();
        Thread t1=new Thread(r1);
        t1.start();
    }

}class T1 extends Thread{
    @Override
    public void run(){
        System.out.println(5/0);
    }
}
class MyThread implements Runnable{

    @Override
    public void run() {
        System.out.println("thread is running with runnale");
    }
}
class Demmot{
    static void main(String[] args) {

        Thread mainThread=Thread.currentThread();
        Thread t1=new Thread(()->{
            System.out.println("my current thread is:"+Thread.currentThread().getName());
            System.out.println(mainThread.getState());
        });
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        try{
            mainThread.sleep(2000);
        }
        catch (Exception e){}
        System.out.println(t1.getState());
    }
}
















