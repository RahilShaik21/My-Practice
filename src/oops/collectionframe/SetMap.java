package oops.collectionframe;

import java.util.*;

public class SetMap{
    static void main(String[] args) {
//        Set<String> set=new HashSet<>();
//        set.add("rahil");
//        set.add("vaseem");
//        set.add("ameenu");
//        System.out.println(set.contains("rahil"));
        Map<Integer,String> map=new HashMap<>();
        map.put(101,"adtiya");
        map.put(102,"rahil");
        map.put(103,"rahil");
        System.out.println(map.containsKey(101)+" "+map.get(101));

    }
}
class Demos1{
    static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        //intial Capicity
        Set<Integer> set1=new HashSet<>(100);
        Set<Integer> set2=new HashSet<>(100,0.8f);

    }
}
