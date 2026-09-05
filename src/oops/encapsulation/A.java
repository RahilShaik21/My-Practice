package oops.encapsulation;

public class A {
    private int num;
    int[] arr;
    protected String name;
    public int getNum(){
        return num;
    }
    public A(int num, String name) {
        this.num = num;
        this.arr = new int[num];
        this.name = name;
    }
}
