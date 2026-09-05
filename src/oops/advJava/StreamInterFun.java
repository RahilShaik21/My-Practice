package oops.advJava;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamInterFun {
    static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(1,15,11,4,25,1,12,12));
        list.stream()
                .filter(x -> x>10)
                .map(x->x*2)
                .peek(System.out::println)
                .sorted((a,b)->b-a)
                .distinct()
//                .dropWhile()
                .forEach(System.out::println);

//        Stream.iterate(1,x->x+1)
//                .limit(10)
//                .skip(5)
//                .forEach(System.out::println);

//        List<List<Integer>> list=new ArrayList<>(List.of(
//                List.of(1,2,3),
//                List.of(4,5,6)
//        ));
//        list.stream()
//                .flatMap(x->x.stream())
//                .map(x->x*2)
//                .forEach(System.out::println);

    }
}
class TerminalOpe{
    static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(1,12,32,14,25));

//                .forEach(System.out::println);
//           List<Integer> list2=list.stream()
//                   .map(x->x+1);
//                   .toList();
//        .collect(Collectors.toList());
//        List<Integer> list2=list.stream()
//                .collect(Collectors.toList());
//        list2.add(4);

//        Optional<Integer> sum=list.stream().reduce((a,b)->a+b);
//  int sum=list.stream().reduce(1,(a,b)->a+b);
//        System.out.println(sum);

//      boolean i=  list.stream()
////              .anyMatch(x->x%2==0);
//        .allMatch(x->x%2==0);
//        System.out.println(i);

//        int sum= list.stream()
//                .filter(x->x>10)
//                .mapToInt(x->x)
//                .sum();
        OptionalInt max=list.stream()
                .filter(x->x>10)
                .mapToInt(x->x)
                .max();
        System.out.println(max.getAsInt());
//        List<String> l=new ArrayList<>(List.of("hi","hello","abc"));
//        int sum1=l.stream()
//                .mapToInt(x->x.hashCode())
//                .sum();
//        System.out.println();
    }
}
