public class ImmutableClass {
    static void main(String[] args) {
        Clg clg=new Clg("iit a","ap");
        Studen s1=new Studen(17,"bes",clg);
        System.out.println(s1.getAge());
        System.out.println(s1.getClg().name);
        s1.getClg().name="iit t";
        System.out.println(s1.getClg().name);

    }
}
final class Studen{
    private int age;
    private String name;
    private Clg clg;
    Studen(int age,String name,Clg clg){
        this.age=age;
        this.name=name;
        this.clg=new Clg(clg.name,clg.addres);
    }
    public Clg getClg() {
        return new Clg(this.clg.name,this.clg.addres);
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }
}
class Clg{
    String name;
    String addres;

    public Clg(String name, String addres) {
        this.name = name;
        this.addres = addres;
    }

}
