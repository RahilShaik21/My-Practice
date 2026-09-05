package dsa.sorting;

import java.util.Arrays;

public class Merge {
    static void main(String[] args) {
        int[] nums={1,2,3,3,4,5};
//        containsDuplicate(nums);
        System.out.println(thirdMax(nums));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m+i]=nums2[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = m+i; j>0 ; j--) {
                if(nums1[j]<nums1[j-1]){
                    int temp=nums1[j-1];
                    nums1[j-1]=nums1[j];
                    nums1[j]=temp;
                }else{
                    break;
                }
            }
        }
    }
    public static boolean containsDuplicate(int[] nums) {
        int i=0;
       while(i<nums.length){
           int correct=nums[i]-1;
           if(nums[i]!=nums[correct]){
               int temp=nums[i];
               nums[i]=nums[correct];
               nums[correct]=temp;
           }else{
               i++;
           }
       }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                return false;
            }
        }
        return true;
    }
    public static int thirdMax(int[] nums) {
        long max=nums[0];
        long max2= Long.parseLong(null);
        long max3=Long.parseLong(null);
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                max3=max2;
                max2=max;
                max=nums[i];
            }else if(max2<nums[i]&&nums[i]<max){
                max3=max2;
                max2=nums[i];
            }else if(max3<nums[i]&&max2>nums[i]&&nums[i]<max){
                max3=nums[i];
            }
        }
       return -1;
    }

}
