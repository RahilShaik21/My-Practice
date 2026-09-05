package oops.Str;

import java.util.Arrays;

class StringtypeOfMaking{
    static void main(String[] args) {
        String s1=new String();
        String s2=new String("Hello");
        String s3="aditya";
        String s4=new String(s3);
        char[] arr={'A','s',' ','a'};
        String s5=new String(arr);
//        arr[0]='3';
        System.out.println(s5);
        String s6=new String(arr,0,2);
        System.out.println(s6);
        byte[] arr2={97,98,99};
        String s7=new String(arr2);
        System.out.println(s7);


    }
}

public class Methods {
    static void main(String[] args) {
        //length and emptiness
        String s1=new String("rahil");
        String s2=new  String("rahil");
//        System.out.println(s1.length());
//        System.out.println(s1.isBlank());
//        System.out.println(s1.isEmpty());
        //
         //character access group
//        System.out.println(s1.charAt(2));
//        char[] arr=s1.toCharArray();
//        //comparision
//        System.out.println(s1.equals(s2));
//        System.out.println(s1.equalsIgnoreCase(s2));
//
//        System.out.println(s1.compareTo(s2));
//        //searching
//        System.out.println(s1.contains("hi"));
//        System.out.println(s1.indexOf(' '));
//        System.out.println(s1.startsWith("r"));
//        System.out.println(s1.endsWith("ahil"));
        String s8=new String(String.valueOf(23));
        byte[] s11=s8.getBytes();
        System.out.println(Arrays.toString(s11));
    }
}
