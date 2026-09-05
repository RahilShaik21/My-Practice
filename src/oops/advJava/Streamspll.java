package oops.advJava;

import java.util.ArrayList;
import java.util.List;

public class Streamspll {
    static void main(String[] args) {
        List<Integer> l=new ArrayList<>(List.of(1,2,3,5 ,6 ,12 ,15,20));
        l.parallelStream()
                .map(x->x*2)
                .forEach(System.out::println);
    }
}
