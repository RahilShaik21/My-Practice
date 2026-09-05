package oops.inter;

public class Car implements Enigne,Brake,Media{

    @Override
    public void brake() {
        System.out.println("drift style break");
    }

    @Override
    public void start() {
        System.out.println("scream out louad");
    }

    @Override
    public void stop() {
        System.out.println("engine stop like normal");
    }

    @Override
    public void acc() {
        System.out.println("1 sec 100kmph");
    }

    static void main(String[] args) {
//        Car mycar=new Car();
//        mycar.start();
//        mycar.acc();
//        mycar.brake();
//        mycar.stop();
        Media carMedia=new Car();
        carMedia.start();
    }
}