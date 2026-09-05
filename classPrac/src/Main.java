import java.util.Scanner;

public class Main{
    static void main(String[] args) {
        byte b;
        System.out.println("Enter abytr value:");
        Scanner sc=new Scanner(System.in);
        b=sc.nextByte();
        System.out.println("byte b:"+b);
        Short s;
        System.out.println("Enter a Short value:");
        s=sc.nextShort();
        System.out.println("Short="+s);
        int i;
        System.out.println("Enter a int value:");
        i=sc.nextInt();
        System.out.println("INt="+i);
        long l;
        System.out.println("Enter a long value:");
        l=sc.nextLong();
        System.out.println("Long="+l);
        float f;
        System.out.println("Enter a float value:");
        f=sc.nextFloat();
        System.out.println("Float="+f);
        Double d;
        System.out.println("Enter a double value:");
        d=sc.nextDouble();
        System.out.println("Double="+d);
        boolean bo;
        System.out.println("ENter a boolean value");
        bo=sc.nextBoolean();
        System.out.println("Boolean b0:"+bo);
        char c;
        c=sc.next().charAt(0);

    }
}
