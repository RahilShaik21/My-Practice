package oops.collectionframe;

import java.util.*;

class DemoCf1 {
    static void main(String[] args) {
        Collection<Integer> list=new TreeSet<>();
        list.add(10);
        list.add(12);
        list.add(14);
        list.add(16);
        list.add(18);
        Iterator<Integer> it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}


