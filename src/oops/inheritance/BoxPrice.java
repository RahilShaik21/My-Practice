package oops.inheritance;

public class BoxPrice extends ChildBox {
    double cost;

     public BoxPrice(){
         this.cost=-1;
     }

    public BoxPrice(ChildBox other, double cost) {
        super(other);
        this.cost = cost;
    }

    public BoxPrice(double l, double h, double w, double weight, double cost) {
        super(l, h, w, weight);
        this.cost = cost;
    }

    public BoxPrice(double weight, double side,double cost) {
         super(side,weight);
        this.cost = cost;
    }
}
