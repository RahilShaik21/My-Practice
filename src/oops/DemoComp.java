package oops;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class DemoComp{
    static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(95,"aditya"));
        list.add(new Student(98,"rahil"));
        list.add(new Student(85,"rohit"));
        list.add(new Student(85,"monu"));
        Collections.sort(list);//ascending
//        for (Student stu:list){
//            System.out.println(stu.marks+" "+stu.name);
//        }
        TreeSet<Student> st=new TreeSet<>(list);
        System.out.println(st.size());

//        List<Integer> l=new ArrayList<>(List.of(10,2,42,4));
//        Collections.sort(l);
//        System.out.println(l);
    }
}
class  Student implements Comparable<Student>{
    int marks;
    String name;

    public Student(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public int compareTo(@NotNull Student o) {
        if(this.marks!=o.marks){
            return -this.marks+o.marks;
        }
        return this.name.compareTo(o.name);
//        return -this.marks+o.marks;
    }
}
