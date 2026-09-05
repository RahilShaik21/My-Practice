package dsa.Arrays1;

import java.util.*;
import java.util.Arrays;

public class PrArrEasy{
    static void main(String[] args) {
        int[] arr=new int[]{1,2,2,3,4,4,4,4,5};
        int[] nums={1,1,1,2,2,2,3,4};
        int[] nums1={1,1,1,1,2,3,4};
        System.out.println(Arrays.toString((union(nums,nums1))));

//        System.out.println(removeDuplicates(arr));
//        rotateArrayByOne(nums);
//        rotateArray(nums,2);
//moveZeroes(nums);
        System.out.println(check(nums));
//        System.out.println(Arr.toString(nums));
    }
    public static int largestElement(int[] nums) {
        int max=nums[0];
        int secMax=Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]>max){
                secMax=max;
                max=nums[i];
            }else{
                if(nums[i]!=max && nums[i]>secMax){
                    secMax=nums[i];
                }
            }
        }
        return secMax;
    }
    public static boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        for (int i = 0; i < nums.size()-2; i++) {
            if(nums.get(i) <=nums.get(i+1)){
            }
            else{
                return false;
            }
        }
        return true;

    }
    public static int removeDuplicates(int[] nums) {
        int i=0;
        for (int j = 0; j < nums.length; j++) {
            if(nums[i]!=nums[j]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
    public static void rotateArrayByOne(int[] nums) {
        nums[nums.length-1]=nums[0];
        for (int i = 0; i < nums.length-1; i++) {
            nums[i]=nums[i+1];
        }

    }
    public static void revArr(int[] arr,int start,int end){
      while(start<end){
          int temp=arr[start];
          arr[start]=arr[end];
          arr[end]=temp;
          start++;
          end--;
      }
    }
    public  static void rotateArray(int[] nums, int k) {
        k=k%(nums.length);
        if(nums.length<1){
            return;
        }
        int n=nums.length;
        revArr(nums,0,n-1);
        revArr(nums,0,k-1);
        revArr(nums,k,n-1);
    }
    public static boolean check(int[] nums) {
        int count=0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i]>nums[(i+1)%nums.length]){
                count++;
            }
            if(count>1){
                return false;
            }
        }
        return true;
    }
    static void  moveZeroes(int[] nums){
        int p=0;
        int count =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[p]=nums[i];
                p++;
            }else{
                count++;
            }
        }
        for (int i = p; i < nums.length ; i++) {
            nums[i]=0;
        }
    }
    static int[] union(int[] nums1, int[] nums2){
        int p1=0;
        int p2=0;
        ArrayList<Integer> set=new ArrayList<>();
        while(p1<nums1.length&&p2<nums2.length){
            int val;
            if(nums1[p1]<nums2[p2]){
//                val=nums1[p1];
                p1++;}
            else if(nums1[p1]>nums2[p2]){
//                val=nums2[p2];
                p2++;
            }
            else {
                val=nums1[p1];
                set.add(val);
                p1++;
                p2++;
            }
//            if(set.size()==0||set.get(set.size()-1)!=val){
//                set.add(val);
//            }
        }
//        while(p1<nums1.length){
//            if(set.size()==0||set.get(set.size()-1)!=nums1[p1]){
//                set.add(nums1[p1]);
//            }
//            p1++;
//        }
//        while(p2<nums2.length){
//            if(set.size()==0||set.get(set.size()-1)!=nums2[p2]){
//                set.add(nums2[p2]);
//            }
//            p2++;
//        }
        int[] arr=new int[set.size()];
        for(int i=0;i<set.size();i++){
            arr[i]=set.get(i);
        }
        return arr;
    }
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int sum1=0;
        for (int i = 0; i < n; i++) {
            sum1^=i+1;
            sum^=nums[i];
        }
        sum1^=n;

        return sum1^sum;
    }
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> hash=new HashMap<>();
        int len=0;
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            if(sum==k){
                    int idx=hash.get(sum);
                    len=Math.max(len,i+1);
                }
            int rem=sum-k;
            if(hash.containsKey(rem)){
                int l=i-hash.get(rem);
                len=Math.max(l,len);
            }
            hash.put(sum,i);
            }
        return len;
    }
}