package oops.inheritance;

class Main {
//    static void main(String[] args) {
////        Box box1 = new Box(2);
////        System.out.println(box1.l + " " + box1.w + " " + box1.h);
////        Box box2 = new Box(284, 24, 42);
////        System.out.println(box2.l + " " + box2.w + " " + box2.h);
//        ChildBox box1=new ChildBox(1,1,1,1);
//        System.out.println(box1.l);
////        Box box4=new ChildBox(1,2,33,3);
////        System.out.println(box4.weight); error
////        System.out.println(box4.h);
//        //here box didnt know about the box weight it is child prop so error
////            ChildBox box5=new Box(11,2,21); error
//
//
//    }
static void main(String[] args) {
    BoxPrice box1=new BoxPrice(324,432,333,324,2342);
    System.out.println(box1.weight);
    Box box=new Box();
//    box.greeting();
    Box.greeting();
    Box nox=new ChildBox();
    nox.greeting();//obj ref is parent so parent fun is returning
    ChildBox childBox=new ChildBox();//here ref is child
    childBox.greeting();//here it is not ovverriding it just hide the two function
    // and return the function which is based on the obj ref
}
}
