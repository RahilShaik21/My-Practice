package dsa.BinarySearch;

import java.util.Arrays;

public class Floor {
    static void main(String[] args) {
        int[] a={3, 4, 4, 7, 8, 10};
        int target=6;
        System.out.println(floor(a,target));
        if(floor(a,target)>=0){
            System.out.println(a[floor(a,target)]);
        }
        System.out.println(Arrays.toString(getFloorAndCeil(a,8)));
    }
    public static int floor(int[] nums,int target){
        if(nums.length==1|| target<nums[0]){
            return -1;
        }
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
    public static int[] getFloorAndCeil(int[] nums, int x) {
            return new int[]{floor1(nums,x),ceil(nums,x)};
        }
        public static int ceil(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;
            if (nums.length == 0) {
                return -1;
            }

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if(nums[mid]==target){
                    return mid;
                }
                if (nums[mid] < target) {
                    start = mid + 1;
                } else  {
                    end = mid - 1;
                }
            }
            return start;
        }
        public static int floor1(int[] nums,int target){
            if(nums.length==1|| target<nums[0]){
                return -1;
            }
            int start=0;
            int end=nums.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(nums[mid]==target){
                    return mid;
                }
                if(nums[mid]<target){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
            return end;
        }

}
