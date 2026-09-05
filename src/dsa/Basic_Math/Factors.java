package dsa.Basic_Math;

import java.util.ArrayList;
import java.util.Arrays;

public class Factors {
    static void main(String[] args) {
//        get_factors(20);
        System.out.println(Gcd(1,2));
    }

   Integer[] get_factors(int n){
        ArrayList<Integer> arr=new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n); i++) {
            if(n%i==0) {
                if (i / n == i) {
                    arr.add(i);
                } else {
                    arr.add(i);
                    arr.add(n / i);
                }
            }
        }
       Integer[] res=arr.toArray(new Integer[0]);//arr is a array list

       return res;
    }
    static int Gcd(int a,int b){
        if(a==0){
            return b;
        }
        return Gcd(b%a,a);
    }
    public static boolean isArmstrong(int n) {
        int temp=n;
        int res=0;
        while(n!=0){
            int digit=n%10;
            res+=digit*digit*digit;
            n/=10;
        }
        return temp==res;
    }

}
