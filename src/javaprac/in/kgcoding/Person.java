package in.kgcoding;

import java.util.Objects;

public class Person {
    private  String name;
    private int age;
    public Person(String name,int age){
        this.age=age;
        this.name=name;
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
