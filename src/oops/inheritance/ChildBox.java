package oops.inheritance;

public class ChildBox extends Box{
    double weight;
    public ChildBox(){
        this.weight=-1;
    }
//    @Override
static void greeting(){
    System.out.println("hey i am in child class");
}
    ChildBox(ChildBox other){
        super(other);
        this.weight= other.weight;
    }

    public ChildBox(double side, double weight) {
        //what is this
        this.weight = weight;
    }
    public ChildBox(double l, double h, double w, double weight) {
        //what is this
        super(l, h, w);
        this.weight = weight;

    }
}
