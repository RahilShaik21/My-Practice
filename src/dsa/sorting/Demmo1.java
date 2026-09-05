package dsa.sorting;

import java.util.Arrays;

public class Demmo1 {
    static void main(String[] args) {
    int[] arr={2,4,3,1};
    inser(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            int idx=getMIn(arr,i);
            int temp=arr[idx];
            arr[idx]=arr[i];
            arr[i]=temp;
        }
    }
   static int getMIn(int[] arr,int start){
        int min=arr[start];
        int minIdx=start;
        for (int i = start; i < arr.length ; i++) {
            if(min>arr[i]){
                min=arr[i];
                minIdx=i;
            }
        }
        return minIdx;
    }

    public static int[] bubbleSort(int[] nums) {
        boolean swapped;
        for (int i = 0; i < nums.length-1; i++) {
            swapped=false;
            for (int j = 1; j < nums.length-i ; j++) {
                if(nums[j-1]>nums[j]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    swapped=true;
                }
            }
            if(!swapped){
                break;
            }
        }
        return nums;
    }
    static int[] inser(int[] nums){
        int i=0;
        while(i<nums.length-1){
            int j=i+1;
            while (j>0){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }else{
                    break;
                }
                j--;
            }
            i++;
        }
        return nums;
    }
    static void mergeS(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }
        int m=s+(e-s)/2;
        mergeS(arr,s,m);
        mergeS(arr,m,e);
        mer(arr,s,m,e);
    }

    private static void mer(int[] arr, int s,int m, int e) {
        int[] mix=new int[e-s];
        int i=s;
        int j=m;
        int k=0;
        while(i<m&&j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m){
            mix[k]=arr[i];
            i++;k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];
        }
    }

//    public int[] bubblesort(int[] nums) {
//
//    }

}

