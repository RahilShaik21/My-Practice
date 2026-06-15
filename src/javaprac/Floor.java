package dsa;

public class Floor {
    static void main(String[] args) {
        int[] a={2,4,4,4,6,6,8,10};
        int target=6;
        System.out.println(floor(a,target));
        if(floor(a,target)>=0){
            System.out.println(a[floor(a,target)]);
        }
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
}
