package oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayList<T extends Number>{
//extends Number // this is a wild card> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        Object[] temp=new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return data.length;
    }
    public void set(int index,T num){
        data[index]=num;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public T remove(){
        T removed=(T)data[--size];
        return removed;
    }
    public void getList(List<? extends Number> list){

    }//without the question mark thing we only can pass the Number class only in order
    // to allow it subclass also we need to do that
    static void main(String[] args) {
        CustomArrayList<Integer> arr=new CustomArrayList<>();
        arr.add(12);
        arr.set(1,2);
        System.out.println(arr.get(2));
        System.out.println(arr.toString());
        for (int i = 0; i < 19; i++) {
            arr.add(i);
        }
//        CustomArrayList<String> rr=new CustomArrayList<>();
//        List<Float> list=new List<>(6);

//        arr.getList( list);
        System.out.println(arr.toString());
        System.out.println(arr.size());
    }

}