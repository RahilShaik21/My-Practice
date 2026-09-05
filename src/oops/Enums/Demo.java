package oops.Enums;

import org.w3c.dom.ls.LSOutput;

public class Demo {
    static void main(String[] args) {
        int status =PaymentStatus2.SUCCESS;
        System.out.println(status);
        PaymentStatus status1=PaymentStatus.SUCCESS;
//        PaymentStatus st=100;
    }

}
/*problems
1.type safety
2.poor readability
3.nogrouping related entities
*/
class PaymentStatus2{
    public static final int SUCCESS=1;
    public static final int FAILED=2;
    public static final int PENDING=3;
}
//class Role{
//    public static final int USER=1;
//    public static final int ADMIN=2;
//}
enum PaymentStatus{
    SUCCESS,
    FAILED,
    PENDING;
}

class demo2{
    static void main(String[] args) {
        Direction d=Direction.EAST;
//        System.out.println(d.getDeg());
    }
}
enum Direction{
//    NORTH(0),
//    EAST(90),
//    WEST(180),
//    SOUTH(270);
//    private int deg;
//    Direction(int deg){
//        this.deg=deg;
//    }
//
//    public int getDeg() {
//        return this.deg;
//    }
    NORTH {
    @Override
    public void move() {
        System.out.println("move up y+1");
    }
},
    EAST{
        @Override
        public void move(){
            System.out.println("move right x+1");
        }
    },
    WEST{
        @Override
        public void move(){
            System.out.println("move left x-1");
        }
    },
    SOUTH{
        @Override
        public void move(){
            System.out.println("move down y-1");
        }
    };
    public abstract void move();
}

class Demo3{
    static void main(String[] args) {
        Direction1[] dir=Direction1.values();
        for(Direction1 d:dir){
            System.out.println(d.name());
        }
        Direction1 d2=Direction1.valueOf("EAST");
        System.out.println(d2);
        System.out.println(d2.name());
        System.out.println(d2.toString());
        System.out.println(d2.ordinal());
    }

}
enum Direction1{
    NORTH,
    SOUTH,
    EAST,
    WEST;

    @Override
    public String toString() {
        return super.toString()+" !";
    }
}
























