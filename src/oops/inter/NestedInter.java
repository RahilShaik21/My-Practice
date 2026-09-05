package oops.inter;

public class NestedInter {
    public interface Nested{
        boolean isOdd(int num);
    }
}
class D implements NestedInter.Nested{
    @Override
    public boolean isOdd(int num) {

        return (num&1)==1;
    }
}
class E{
    static void main(String[] args) {
        D obj=new D();
        System.out.println(obj.isOdd(9));
    }
}