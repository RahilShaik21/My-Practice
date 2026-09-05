package dsa.recursion;

import java.util.Arrays;

public class PatternInRecur {
    static void main(String[] args) {
//        triange(4,0);
        int[] arr={2,3,1};
//        bubble(arr,0,arr.length-1);
        selection(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void reverseTriange(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("*");
            reverseTriange(r,c+1);
        }else{
            System.out.println();
            reverseTriange(r-1,0);
        }
    }
    static void triange(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            triange(r,c+1);
            System.out.print("*");

        }else{
            triange(r-1,0);
            System.out.println();
        }
    }
    static void bubble(int[] arr,int p,int l){
        if(l==0){
            return;
        }
        if(p<l){
           if(arr[p]>arr[p+1]){

               int temp=arr[p];
               arr[p]=arr[p+1];
               arr[p+1]=temp;

           }
            bubble(arr,p+1,l);
        }else{
            bubble(arr,0,l-1);
        }
    }
    static void selection(int[] arr,int p,int l){
        if(l==1){
            return;
        }
        if(p<l){
            int max=getmax(arr,0,l);
            int temp=arr[l];
            arr[l]=arr[p];
            arr[p]=temp;
            selection(arr,p+1,l);
        }
        else{
            selection(arr,0,l-1);
        }


    }
    static int getmax(int[] arr,int s,int e){
        int max=arr[0];
        if(s==arr.length){
            return Integer.MIN_VALUE;
        }
        if(arr[s]>max){
            max=arr[s];
        }
        int maxall=getmax(arr,s+1,e);
        return Math.max(maxall,max);
    }
}
