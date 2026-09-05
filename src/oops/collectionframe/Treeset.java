package oops.collectionframe;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class Treeset{
    static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet<>();
//        Set<Integer> set1=new TreeSet<>(List.of(1,2,2,3,3,4));
        set.add(80);
        set.add(23);
        set.add(10);
        set.add(90);
        set.add(50);
        //sorted set iterface
        System.out.println(set.first()+" "+set.last());
        System.out.println(set.headSet(80,true));
        System.out.println(set.tailSet(50,true));
        System.out.println(set.subSet(10,true,90,false));

    }
}
class MapPrac{
    static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"aditya");
        map.put(102,"rohan");
        map.put(103,"rohit");
//        map.keySet();
//        map.values();
//       Set<Map.Entry<Integer,String>> entries=map.entrySet();
//       for (Map.Entry<Integer,String> entry:entries){
//           Integer i=entry.getKey();
//           String s=entry.getValue();
//           System.out.println(i+" "+s);
//       }
        Map<Integer,String> map1=Map.of(101,"rahil",75,"shshsh");

    }
}
