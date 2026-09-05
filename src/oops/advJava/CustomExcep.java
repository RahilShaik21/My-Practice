package oops.advJava;

import java.util.ArrayList;
import java.util.List;

public class CustomExcep {
    static void main(String[] args) {
//        checkEligibility(-2);
        try{
            checkEligibility(-2);
        }
        catch (InvalidAgeException e){
            System.out.println("age cannot be -ve");
            System.out.println("Entered age was"+e.getAge());
        }
    }
    private static void checkEligibility(int age){

        if(age<=0){
            throw new InvalidAgeException("Age cannot be negative",age);
        }
        if(age>18){
            System.out.println("you are eligible to vote");
        }

    }
}
class InvalidAgeException extends RuntimeException{
    private int age;
    public InvalidAgeException(String msg,int age){
        super(msg);
        this.age=age;
    }
    public int getAge(){
        return age;
    }
}


















