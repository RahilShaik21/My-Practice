package oops.collectionframe;

import org.jetbrains.annotations.NotNull;

import java.util.*;

public class ComparatorInter {
    static void main(String[] args) {
//        int[] arr=new int[1000000000];
        List<Student> list=new ArrayList<>();
        list.add(new Student(95,"rahil",10));
        list.add(new Student(60,"aditya",11));
        list.add(new Student(80,"sonu",9));
        list.add(new Student(90,"rohit",8));
//        Comparator<Student> c1=new SortByName();
//        Comparator<Student> c2=new SortByMarks();
//        Comparator<Student> c3=new SortByRollNo();
        Collections.sort(list,(s1,s2)->s1.marks-s2.marks);
        for (Student s:list){
            System.out.println(s.name+" "+s.rollNo+" "+s.marks);
        }
    }
}
//class Student implements Comparable<Student>{
class Student{
    int marks;
    String name;
    int rollNo;

    public Student(int marks, String name, int rollNo) {
        this.marks = marks;
        this.name = name;
        this.rollNo = rollNo;
    }

//    @Override
//    public int compareTo(Student o) {
//        return this.marks-o.marks;
//    }
}
class SortByName implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.name.compareTo(o2.name);
    }
}
class SortByMarks implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.marks-o2.marks;
    }
}
class SortByRollNo implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        return o1.rollNo-o2.rollNo;
    }
}
