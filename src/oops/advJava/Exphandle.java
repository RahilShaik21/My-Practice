package oops.advJava;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exphandle {
    static void main(String[] args) {
        System.out.println("step1");
        try{
            int a =5;
            int b=0;
            methodA(a,b);
        } catch (ArithmeticException e) {
            System.out.println("division by 0 is not allowed");
        }

    }
    private static  void methodA(int a ,int b){
        methodB(a,b);
    }
    private static void methodB(int a,int b){
        System.out.println(a/b);
        System.out.println("step2");
    }
}
class ExpHand2{
    static void main(String[] args) {
        try{
            System.out.println("OUTER try start");
            try{
                System.out.println("innner try starts");
                System.out.println(5/0);
                System.out.println("inner try ends");
            }
//            catch(ArithmeticException e){
//                System.out.println("divide by 0 is not allowed:inner");
//            }
            catch(NullPointerException e){
                System.out.println("null is not allowed:inner");
            }
            System.out.println("outer try end");
        }
        catch (ArithmeticException e){
            System.out.println("divide by 0 is not allowed:outer");
        }
    }

}
class Demmo3{
    static void main(String[] args) {
        try{
//            System.out.println(5/0);
//            String str=null;
//            str.length();
            Object obj ="hello";
            Integer i=(Integer) obj;
        }
        catch (ArithmeticException| NullPointerException e){
            System.out.println(e.getMessage());
        }
//        catch(NullPointerException e){
//            System.out.println("null are not allowed ");
//        }
        catch(Exception e){
            System.out.println("generic expection");
        }
    }

}
class DEm04{
    static void main(String[] args) {
        checkEligibility(0-6);

    }
    private static void checkEligibility(int age){

            if(age<=0){
                throw new IllegalArgumentException("Age cannot be negative");
            }
            if(age>18){
                System.out.println("you are eligible to vote");
            }

    }
}
class Demo05{
    static void main(String[] args){
       try {
           readFil();
       } catch (Exception e){
            System.out.println(e.getMessage());
        }
//        readFil();
    }
    private static void readFil() throws FileNotFoundException {
        FileReader fr=new FileReader("abc.txt");
//        try{
//            FileReader fr=new FileReader("abc.txt");
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
    }
}