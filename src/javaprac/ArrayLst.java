package dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayLst {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        ArrayList<Integer> arr=new ArrayList<>(9);
//        int i=0;
//        while(i<9){
//            System.out.println("enter a number:");
//            int num=in.nextInt();
//            arr.add(num);
//            i++;
//        }
        Integer[] ar={88,29,28,29};
        arr.addAll(Arrays.asList(ar));

        System.out.println(arr);
    }

}
