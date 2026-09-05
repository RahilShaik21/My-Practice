package dsa.sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    static void main(String[] args) {
        int[] nums={0,9,-976,};
//        BubbleSort(nums);
//        System.out.println(Arr.toString(nums));
        insertionSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void BubbleSort(int[] nums){
        //run steps n-1 items
        boolean swapped;
        for (int i = 0; i < nums.length; i++) {
            swapped=false;
            //for each step,max index will come at last respective
            for (int j = 1; j < nums.length-i; j++) {
                //swap if the items is smaller than the previous item
                if(nums[j]<nums[j-1]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                    swapped=true;
                }
            }
            //if array is not swapping in the iteration simply break the loop cuz it is already sorted
            if(!swapped){
                break;
            }
        }
    }
    public  static void insertionSort(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j>0; j--) {
                if (nums[j]<nums[j-1]){
                    int temp=nums[j-1];
                    nums[j-1]=nums[j];
                    nums[j]=temp;
                }else{
                    break;
                }
            }
        }
    }

}
