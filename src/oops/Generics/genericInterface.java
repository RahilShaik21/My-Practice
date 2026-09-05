package oops.Generics;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.Comparator;

public interface genericInterface <T>{
    public void displayValue(T value);
}
class Example implements genericInterface<Integer> {
    @Override
    public void displayValue(Integer value) {
        System.out.println(value);
    }

    static void main(String[] args) {

        System.out.println();
    }
}
class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno,float marks) {
        this.rollno = rollno;
        this.marks=marks;
    }
    @Override
    public int compareTo(@NotNull Student o) {
//        return (int) (this.marks-o.marks);
        return 0;
    }

//    @Override
//    public String toString() {
//        return "oops.Generics.Student{" +
//                "marks=" + marks +
//                '}';
//    }

    @Override
    public String toString() {
        return "oops.Generics.Student{" +
                "rollno=" + rollno +
                ", marks=" + marks +
                '}';
    }

    static void main(String[] args) {
        Student s1=new Student(12,89.93f);
        Student s2=new Student(13,57.190f);
        if(s2.compareTo(s1)>0){
        System.out.println("s2 has more marks");}
        else{
            System.out.println("s1 has more marks");
        }
        Student[] lsit={s1,s2};
        System.out.println(Arrays.toString(lsit));
        Arrays.sort(lsit);
        System.out.println(Arrays.toString(lsit));
        Arrays.sort(lsit, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int) (o1.marks-o2.marks);
            }
        });


    }


}