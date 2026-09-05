package oops.collectionframe;

import java.util.*;

public class DemoCf4{
    static void main(String[] args) {
        Collection<Integer> c=new ArrayList<>();
        c.add(1);
        c.add(2);
        c.add(3);
//        System.out.println(c.size());
//        System.out.println(c.isEmpty());
//        System.out.println(c.contains(4));
//
//        Object[] obj=c.toArray();
//        Integer[] arr2=new Integer[0];
//        Integer[] arr=c.toArray(arr2);
//        for (Integer i:arr){
//            System.out.println(i);
//        }
        boolean a=c.add(3);
        System.out.println(a);

        System.out.println(c.remove(6));
    }
}
