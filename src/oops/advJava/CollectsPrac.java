package oops.advJava;

import java.util.*;
import java.util.stream.Collectors;

class CollectsPrac {
    static void main(String[] args) {
        List<String> list=new ArrayList<>(List.of("a","bb","ccc","dd","e"));
//        Map<Integer,String> map=list.stream()
//                .collect(Collectors.toMap(x->x.length(),x->x));
//        System.out.println(map);
        Map<Integer,List<String>> i=list.stream()
//                .map(x->x.length())
//                .toList();
//        .collect(Collectors.groupingBy(x->x.length()));
//        .collect(Collectors.partitioningBy(x->x%2==0));
        .collect(Collectors.groupingBy(x->x.length(),
                Collectors.mapping(x->x.toUpperCase(),Collectors.toList())
        ));
        System.out.println(i);
    }
}
