package dsa.BinarySearch;

import java.util.Arrays;

public class Sqrt {

    static void main(String[] args) {
//        int num=2147395600;
//        int[] arr={2,7,11,15};
//        System.out.println(mySqrt(num));
//        System.out.println(Arr.toString(twoSum(arr,9)));
//        System.out.println(isPerfectSquare(2147395600));
//        int[] nums={1,1,2,2,3,3,4,4,8,8};
//        System.out.println(singleNonDuplicate(nums));
//        int[] piles={805306368,805306368,805306368};
//        System.out.println(minEatingSpeed(piles,1000000000));
        int[] arr={5,25,75};
        System.out.println(Arrays.toString(twoSum(arr,9)));
    }
    public static int mySqrt(int x) {
        int start=0;
        int end=x/2;
        while(start<=end){
            int mid = start + (end - start) / 2;
            long square = (long)(mid*mid);
            if (square == x) {
                return mid ;
            }
            if (square < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return end;
    }
//    public static int[] twoSum(int[] arr, int target) {
//        int[] ans={-1,0};
//        int start=0;
//        int end=arr.length-1;
//        while(start<end){
//            int mid=start+(end-start)/2;
//            if(mid-1>start&& (arr[mid-1]+arr[mid])==target){
//                ans[0]=mid-1;
//                ans[1]=mid;
//                return ans;
//            }else if(mid+1<end&& (arr[mid+1]+arr[mid])==target){
//                ans[0]=mid;
//                ans[1]=mid+1;
//                return ans;
//            }else if(mid-1>start&& (arr[mid-1]+arr[mid])>target){
//                end=mid-1;
//            }
//            else if(mid-1>start&& (arr[mid-1]+arr[mid])<target){
//                start=mid+1;
//            }
//        }
//        return ans;
//    }
    public static boolean isPerfectSquare(int num) {
        int start=0;
        int end=num;
        while(start<=end){
            int mid = start + (end - start) / 2;
            long square = (long)(mid*mid);
            if (square == num) {
                return true ;
            }
            if (square < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }
    public static int singleNonDuplicate(int[] nums) {

        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(mid%2==1){
                mid--;
            }
            if((nums[mid]^nums[mid+1])==0){
                start=mid+2;
            }
            else if((nums[mid]^nums[mid+1])!=0){
                end=mid;
            }
        }
        return nums[end];

    }
    public static  int minEatingSpeed(int[] piles, int h) {
        int start=1;
        int end=maxPiles(piles);

        while(start<=end){
            long speed=(long) start+(end-start)/2;
            int mid=(int) speed;
            if(canFinish(piles,mid,h)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }

    public static int maxPiles(int[] piles) {
        int max=piles[0];
        for(int pile:piles){
            if(max<pile){
                max=pile;
            }
        }
        return max;
    }
    public static boolean canFinish(int[] piles,int speed,int h){
        long hourCount=0;
        for (int i = 0; i < piles.length; i++) {
            hourCount+=(long) (piles[i]+speed-1)/speed;
        }
        return hourCount<=h;
    }
    public static int[] twoSum(int[] nums, int target) {
        int start=0;
        int end= nums.length-1;
        int[] ans=new int[2];
        while(start<end){
            int ans1=target-nums[start];
            int ans2=binarySearch(nums,ans1,start+1,end);
            if(ans2<0){
                start++;
            }else{
                ans[0]=start+1;
                ans[1]=ans2+1;
                break;
            }
        }
        return ans;
    }
    public static int binarySearch(int[] nums,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]<target){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
