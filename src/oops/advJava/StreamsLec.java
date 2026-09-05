package oops.advJava;
import java.util.*;
import java.util.stream.Stream;

public class StreamsLec {
    static void main(String[] args) {
        List<Integer> list=new ArrayList<>(List.of(1,12,3,24,15,6));
        Stream<Integer> s=list.stream();
        s=s.filter(x->x>10);
        s=s.map(x->x*2);
        s.forEach(System.out::println);
//        list.stream()
//                .filter(x->x>10)
//                .map(x->x*2)
//                .forEach(System.out::println);
        Stream<Integer> s1=Stream.empty();
    }
;
}
