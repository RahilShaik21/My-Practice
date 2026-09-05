package dsa.recursion;

import dsa.BinarySearch.BinarySearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    static void main(String[] args) {
//        print1(1);
//        System.out.println(fibonacci(4));
        System.out.println(BinarySearch(new int[]{1,2,3,4},3,0,3));
    }
    static void print1(int num){
        if(num>5){
            return;
        }
        System.out.println(num);
        print1(num+1);
    }
//    static void print2(int num){
//        System.out.println(num);
//        print3(3);
//    }
//    static void print3(int num){
//        System.out.println(num);
//        print4(4);
//    }
//    static void print4(int num){
//        System.out.println(num);
//        print5(5);
//    }
//    static void print5(int num){
//        System.out.println(num);
//    }
    public  static int fibonacci(int num){
       if(num<2){
           return num;
       }

              return fibonacci(num-1)+fibonacci(num-2);
    }
    public static int BinarySearch(int[] nums,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start/2);
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]<target){
            return BinarySearch(nums,target,mid+1,end);
        }else{
            return  BinarySearch(nums,target,start,mid-1);
        }
    }

}
class dem{
    static void main(String[] args) {
        int[] a={1,2,3,4};
        reverse(a,a.length);
        System.out.println(Arrays.toString(a));
    }
    public static void reverse(int[] arr, int n) {
        if(arr.length/2==n&arr.length%2==1){
            return;
        }
        if(n<arr.length/2){
            return;
        }
        int temp=arr[n-1];
        arr[n-1]=arr[arr.length-n];
        arr[arr.length-n]=temp;
        reverse(arr,n-1);
    }
    public boolean palindromeCheck(String s) {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i <str.length(); i++) {
            if(s.charAt(i)>='a'&&s.charAt(i)<='Z'&&s.charAt(i)>='A'&&s.charAt(i)<='z'){
                str.append(s.charAt(i));
            }
        }
        return check(str.toString().toLowerCase(),0,str.length()-1,str.length());
    }
    boolean check(String s,int left,int right,int n){
        if(left>=right){
            return true;
        }
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }

        return check(s,left+1,right-1,n);
    }
    public int fib(int n) {
        //your code goes here
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return fib(n-1)+fib(n-2);
    }
}