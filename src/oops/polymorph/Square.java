package oops.polymorph;
public class Square extends Shape {
    @Override
    void area(){
        System.out.println("Area of Square:side*side");
    }
}
class Main{
    static void main(String[] args) {
        Shape shape=new Shape();
        Rectangle rec=new Rectangle();
        Square square=new Square();
        shape.area();
        rec.area();
        square.area();
    }
}
