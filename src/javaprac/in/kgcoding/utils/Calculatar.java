package in.kgcoding.utils;

import in.kgcoding.geometry.circle;
import in.kgcoding.geometry.rectangle;
public class Calculatar {
    public static void main(String[] args) {
        circle cir=new circle(78);
        rectangle rec=new rectangle(23,2);
        double cirArea=Math.PI*Math.pow(cir.radius,2);
        double recArea=rec.length*rec.breadth;
        System.out.printf("Area of circle is %f and area of rectangle is %f",cirArea,recArea);
    }
}
