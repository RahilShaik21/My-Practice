package oops.encapsulation;

import javax.management.ObjectName;

public class ObjDemo {
    int num;
    float gpa;
    public ObjDemo(int num,float gpa) {
        super();
        this.num=num;
        this.gpa=gpa;
    }


    @Override
    public int hashCode() {
        return num;
    }

    @Override
    public boolean equals(Object obj) {
        return this.num==((ObjDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "num:"+this.num;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    static void main(String[] args) {
        ObjDemo obj=new ObjDemo(28,87.44f);
        ObjDemo obj1=new ObjDemo(28,87.4f);
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        if(obj==obj1){
            System.out.println("obj is equal");
        }
        if(obj.equals(obj1)){
            System.out.println("obj is equals");
        }
    }
}
