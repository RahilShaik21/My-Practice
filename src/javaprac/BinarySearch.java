package dsa;
public class BinarySearch {
    public static void main(String[] args) {
    int[] arr={5,4,3,2,1};
    int target=4;
        System.out.println(search(arr,target));
    }
    static int  search(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        if(nums.length==0){
            return -1;
        }
        if (nums[0]<nums[end]){ //ascending order
            while(start<=end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] < target) {
                    start = mid + 1;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }}
        else {
                while(start<=end){ // decesding order
                    int mid=start+(end-start)/2;
                    if(nums[mid]<target){
                        end=mid-1;
                    }else if(nums[mid]>target){
                        start=mid+1;
                    }else {
                        return mid;
                    }

            }
        }
        return -1;
    }
}
