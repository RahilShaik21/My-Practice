package oops.advJava;

import java.util.Optional;

public class OptionalCls {
    static void main(String[] args) {
        Optional<String> name=getName();
//        if(name.isPresent()){
//            System.out.println(name.get());
//        }
//        name.ifPresent(System.out::println);
//        System.out.println(name.orElse("unknown"));
//        System.out.println(name.orElseGet(()->"unknown"));
//        System.out.println(name.orElseThrow());
        name.ifPresentOrElse(System.out::println,()-> System.out.println("unknnown"));
    }

    public static Optional<String> getName(){
//        return Optional.empty();
//        return Optional.of("Rahil");
            return Optional.ofNullable(null);

    }
}
class demoo{
    static void main(String[] args) {
        Optional<User> u=getUser();
//        if(u!=null){
//            if(u.address!=null){
//                if(u.address.city!=null){
//                    System.out.println(u.address.city);
//                }
//            }
//        }
//        u.map(x->x.address)
//                .map(y->y.city)
//                .ifPresent(System.out::println);
                u.flatMap(x->x.address)
                        .map(y->y.city)
                        .ifPresent(System.out::println);
    }
    private static Optional<User> getUser(){
        Address a=new Address();
        a.city="Delhi";
        User u=new User();
        u.address=Optional.of(a);
        return Optional.ofNullable(u);
    }
}
class User{
    public Optional<Address> address;
}
class Address{
    public String city;
}
