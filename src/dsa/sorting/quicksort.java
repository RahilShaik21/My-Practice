package dsa.sorting;

import java.util.Arrays;

public class quicksort{
    static void main(String[] args) {
        int[] arr={4,5,2,1,3};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] nums,int low,int high){
        if(low>=high){
            return;
        }
        int s=low;
        int e=high;
        int m=s+(e-s)/2;
        int pivot=nums[m];
        while(s<=e){
            //also a reason why if it already sorted
            while(nums[s]<pivot){
                s++;
            }
            while(nums[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }

        }
        sort(nums, low, e);
        sort(nums,s,high);
    }

}


















