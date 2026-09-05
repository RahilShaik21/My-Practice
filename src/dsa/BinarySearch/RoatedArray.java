package dsa.BinarySearch;

public class RoatedArray {
    static void main(String[] args) {
        int[] nums={3,4,5,0,1,2};
        System.out.println(searchInRoatedArray(nums,5));
//        int [] arr1={2,2,9,1,2,2};
//        System.out.println(searchInRoatedArray(arr1,9));
//        System.out.println(PivotWithDup(arr1));
//        System.out.println(CountRotation(nums));
    }

    static  int searchPivotRotaedArray(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start<end){
            //4 cases
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start&&nums[mid-1]>nums[mid]){
                return mid-1;
            }

            else if(nums[mid]<=nums[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return 0;
    }
        static int BinarySearch(int[] nums, int target, int start, int end) {
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[mid] < target) {
                    start = mid + 1;
                } else if (nums[mid] > target) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }
            return -1;
        }
    static int searchInRoatedArray(int[] nums,int target) {
        int pivot = PivotWithDup(nums);
        if (pivot == -1) {
            return BinarySearch(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0]) {
            return BinarySearch(nums, target, 0, pivot);
        }

        return BinarySearch(nums, target, pivot + 1, nums.length - 1);
    }
    static  int PivotWithDup(int[] nums){
        int start = 0;
        int end = nums.length - 1;
        while(start<end){
            //4 cases
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            else if(mid>start&&nums[mid-1]>nums[mid]){
                return mid-1;
            }
            //if my middle ,end,start are equal then just skip the duplicates
            if(nums[mid]==nums[start] && nums[mid]==nums[end]){
                if(nums[start]>nums[start+1]){
                    return start;
                }
                //check the start is pivot
                start++;
                //check the end is pivot
                if(nums[end]<nums[end-1]){
                    return end;
                }
                end--;
            }
            //left side is sorted ,so pivot should be in right
            else if(nums[start]<nums[mid] || nums[start]==nums[mid]&& nums[mid]>nums[end]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return  -1;
    }

    static int CountRotation(int[] nums){
        return searchPivotRotaedArray(nums)+1;
    }

}
