package dsa.BinarySearch;

public class Leetcode441 {
    static void main(String[] args) {
//        System.out.println(arrangeCoins(1804289383));
//        int[] arr={1,3,5,6};
//        System.out.println(findKthPositive(arr,1));
        int[] nums={1,3,5,6};
        System.out.println(searchInsert(nums,8));

    }

    public static int arrangeCoins(int n) {
        int start=0;
        int end=n;
        while(start<=end){
            int mid=start+(end-start)/2;
            long coins= (long) mid*(mid+1)/2;
            if(coins==n){
                return mid;
            } else if (coins<n) {
                start=mid+1;
            }else if(coins>n){
                end=mid-1;
            }
        }
        return end;
    }
    public static int findKthPositive(int[] arr, int k) {
        int missingVal=0;
        int start=0;
        int end=arr.length-1;
        //here we are finding that where missing values are greater than the give k
        while (start<=end){
            int mid=start+(end-start)/2;
            missingVal=arr[mid]-(mid+1);//here we finding the mising values that exists
            // by subtarcting the actual value in the arr - the value that should exists there ie.index+1
            if(missingVal>=k){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start+k;
    }
    public static int searchInsert(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return end+1;
    }
}
