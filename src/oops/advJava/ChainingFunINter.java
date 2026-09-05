package oops.advJava;

import java.util.function.Consumer;

public class ChainingFunINter {
    static void main(String[] args) {
        Consumer<String> printName=System.out::println;
        Consumer<String> PrintUp=s-> System.out.println(s.toUpperCase());
        Consumer<String> pipeLine=printName.andThen(PrintUp);
        pipeLine.accept("rahil");
    }
}
