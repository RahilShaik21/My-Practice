package dsa.BinarySearch;

import java.util.Arrays;

public class SplitArrayLargestSum {
    static void main(String[] args) {
//        int[] nums={7,2,5,10,8};
//        System.out.println(splitArray(nums,2));
        int[] nums1 = {1, 100, 50};
        int[] nums2 = {2, 60, 49};
        System.out.println(getAbsSum(nums1, nums2));
    }

    private static int splitArray(int[] nums, int m) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < nums.length; i++) {
            //in the end it contain the max element of the array
            start = Math.max(start, nums[i]);
            end += nums[i];
        }
        //binary search
        while (start < end) {
            //try for the middle as potential ans
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;//atleast you dic=vide into one piece
            for (int num : nums) {
                if (sum + num > mid) {
                    //you cannot add this in this sub array make in the new one
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }
            if (pieces > m) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;//start==end
    }
//    public static int minAbsoluteSumDiff(int[] nums1, int[] nums2) {
//
//    }

    public static int getAbsSum(int[] nums1, int[] num2) {
        int sum = 0;
        int peak = 0;
        int peakIdx = 0;
        int[] temp = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            temp[i] = nums1[i];
            if (peak < Math.abs(nums1[i] - num2[i])) {
                peakIdx = i;
                peak = Math.abs(nums1[i] - num2[i]);
            }
            sum += Math.abs(nums1[i] - num2[i]);
        }
        //sorting by insertion sort
        for (int i = 0; i < nums1.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (temp[j] < temp[j - 1]) {
                    int tem = temp[j - 1];
                    temp[j - 1] = temp[j];
                    temp[j] = tem;
                } else {
                    break;
                }

            }
        }
        int target = num2[peakIdx];
        int com = num2[peakIdx];
        int ans=bin(temp,target,com);
        sum =sum-(Math.abs(nums1[peakIdx]-num2[peakIdx]))+Math.abs(ans-num2[peakIdx]);
        return sum;
    }

            public static int bin(int[] temp, int target, int com) {
                int start = 0;
                int end = temp.length - 1;
                int ans = 0;
                while (start <= end) {
                    int mid = start + (end - start) / 2;
                    if (target == temp[mid]) {
                        return temp[mid];
                    }
                    if (temp[mid] < target) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
                if (Math.abs(temp[start] - com) < Math.abs(temp[end] - com)) {
                    if(temp[start]>target){
                        return start;
                    }
                    return temp[start];
                } else {
                    if(temp[end]<target){
                        return end;
                    }
                    return temp[end];
                }
            }
//            public static int cows(int Nostalls,int cows ,int[] stalls){
//            int start=1;
//            int end=Nostalls;
//            while(start<end){
//                int mid=start+(end-start)/2;
//
//            }
//            }
//            public static boolean cowsfit(int n,int nums[],int cows){
//                if(nums[nums.length-1]/cows<=n){
//                    return true;
//                }
//                return false;
//            }
public int maximumCandies(int[] candies, long k) {
    int start=1;
   int end=candies[0];
    for (int i = 0; i < candies.length; i++) {
        if(candies[i]>end){
            end=candies[i];
        }
    }
   while(start<=end){
       int mid=start+(end-start)/2;
       if(isPossible(candies,mid,k)){
           start=mid+1;
       }
       else{
           end=mid-1;
       }
   }
   return end;
}
public  boolean isPossible(int[] nums,long sol,long k){
    long ans=0;
    for (int i = 0; i < nums.length; i++) {

        if(nums[i]/sol<1){
         continue;
        }
        else{
            ans=ans+ nums[i]/sol;
        }
    }
    return ans>=k;
}
}


