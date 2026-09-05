package oops.polymorph;

class Rectangle extends Shape  {
    //this will run when obj is rectangle is created
    //hence it is overriding the parent method
    @Override//this is called annotation
    void area(){
        System.out.println("Area is :length*breadth");
    }
}