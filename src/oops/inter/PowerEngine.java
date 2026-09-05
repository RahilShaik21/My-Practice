package oops.inter;
class Electic_engine implements Enigne{

    @Override
    public void start() {
        System.out.println("electic engine starts");
    }

    @Override
    public void stop() {
        System.out.println("electic engine stops");
    }

    @Override
    public void acc() {
        System.out.println("electic engine acceralate");
    }
}
public class PowerEngine implements Enigne{
    @Override
    public void start() {
        System.out.println("Vrooom Vromm");
    }

    @Override
    public void stop() {
        System.out.println("Voom shuuss!");
    }

    @Override
    public void acc() {
        System.out.println("Voom tu tu Voom tu tu");
    }

}
