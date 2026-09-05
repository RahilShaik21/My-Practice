package dsa.sorting;

import javaprac.ArrayLst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelectionSort {
    static void main(String[] args) {
        int[] nums={5,3,1,5,-1};
//        selectionSort(nums);
//        System.out.println(Arr.toString(nums));
        int[] num={4,3,2,7,8,2,3,1};
//        CyclicSort(num);
//        System.out.println(Arr.toString(num));
//        System.out.println(missingNumber(num));
        System.out.println((findDisappearedNumbers(num)));
    }
    public static void selectionSort(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int temp=0;
            int max=0;
            for (int j = 0; j < nums.length-i; j++) {
                if(nums[j]>nums[max]){
                    max=j;
                }
            }
            temp=nums[nums.length-i-1];
            nums[nums.length-i-1]=nums[max];
            nums[max]=temp;
        }
    }
    static void CyclicSort(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
    }
    public static int missingNumber(int[] nums) {
        int i=0;
        while (i< nums.length){
            int correct=nums[i];
           if(nums[i]<=nums.length&&nums[i]!=nums[correct]){
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(j!=nums[j]){
                return j;
            }
        }
        return nums.length;
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        ArrayList<Integer> arr1=new ArrayList<>(4);
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                arr1.add(j+1);
            }
        }
        return arr1;
    }
    public int findDuplicate(int[] nums) {
        int i=0;
        while (i<nums.length){
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
                return nums[j];
            }
        }
        return nums.length;
    }
    public List<Integer> findDuplicates(int[] nums) {
            int i=0;
            while (i<nums.length){
                int correct=nums[i]-1;
                if(nums[i]!=nums[correct]){
                    int temp=nums[i];
                    nums[i]=nums[correct];
                    nums[correct]=temp;
                }else{
                    i++;
                }
            }
            ArrayList<Integer> arr1=new ArrayList<>(4);
            for (int j = 0; j < nums.length; j++) {
                if(nums[j]!=j+1){
                    arr1.add(nums[j]);
                }
            }
            return arr1;
    }
    public int[] findErrorNums(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }
        int[] ans=new int[2];
        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                ans[0]=nums[j];
                ans[1]=j+1;
            }
        }
        return ans;
    }
    public int firstMissingPositive(int[] nums) {
        int i=0;
        while (i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]>0&&nums[i]<nums.length&&nums[i]!=nums[correct]){
                int temp=nums[i];
                nums[i]=nums[correct];
                nums[correct]=temp;
            }else{
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if(nums[j]!=j+1){
                return j+1;
            }
        }
        return nums.length;
    }

}
