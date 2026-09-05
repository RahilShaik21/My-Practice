package oops.advJava;

public class DemoThread2 {
    static void main(String[] args) throws InterruptedException {
//       try{ Thread.currentThread().sleep(2000);}
//       catch (Exception e){};
        System.out.println("Main thread starts");
        Thread t1=new Thread(()->{
            try {
                Thread.sleep(2000);
                System.out.println("Thread 0 Starts");
            }
            catch (Exception e){}
        });
        t1.start();
        t1.join(1000);
        System.out.println("Main thread ends");

    }
}
class DemmonThread{
    static void main(String[] args) {
        Thread t1=new Thread(()->{
            while (true){
                System.out.println("Thread is running");
            }
        });
        t1.setName("Slave-1");
        t1.setDaemon(true);
        t1.start();
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
    }
    int c=0;
    void INcrement(){
        c++;
    }
}
class RaceCondn{
    static void main(String[] args) throws InterruptedException {
        DemmonThread d=new DemmonThread();
        Thread t1=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                d.INcrement();
            }
        });
        Thread t2=new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                d.INcrement();
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(d.c);

    }
}
