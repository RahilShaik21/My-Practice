package oops.collectionframe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListInter{
    static void main(String[] args) {
        List<Integer> l=new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
//        System.out.println(l.get(2));
//        l.set(1,2);
//        l.addAll(0,List.of(6,7,8));
//        System.out.println(l);
//        l.remove(0);
//        System.out.println(l);
//        System.out.println(l.indexOf(1));
//        ListIterator<Integer> it=l.listIterator(5);
//        while (it.hasPrevious()){
//            System.out.println(it.previous());
//        }
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        List<Integer> l1=List.of(1,2,3,4,5);
//        l1.add(8);  exception
        System.out.println(l1);
        List<Integer> l2=List.copyOf(l1);
//        l2.add(2);



    }
}