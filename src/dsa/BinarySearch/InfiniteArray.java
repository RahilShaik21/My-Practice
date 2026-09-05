package dsa.BinarySearch;

public class InfiniteArray {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr1={1,2,4,5,9,8,7,4,1,0};


//        System.out.println(getPositionInfinte(arr, 9));
//        System.out.println(arr1[peakIndexInMountainArray(arr1)]);
        System.out.println(searchInMountainArray(arr1,9));

    }

    static int getPositionInfinte(int[] nums, int target) {//ignore the ArrayIndexOutOfBoundsException
        int start = 0;
        int end = 1;
        // condition for the target for lie in the range
        while (target > nums[end]) {
            int tempStart = end + 1;//using new cuz it may cause the end calculation for size of the box
            end = end + (end - start + 1) * 2;//double the chunk size and add to the end
            start = tempStart;
        }
        int ans = BinarySearch(nums, target, start, end);
        return ans;
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

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // you are at asc part of array look at right side of the array
                start = mid + 1;
            } else {
                //you are dec part of the array find at left for better solution
                //here we have check the mid also cuz it might ans too
                end = mid;
            }
        }
        return start;
    }

    static int searchInMountainArray(int[] arr,int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        int temp=start;
        start = 0;
        end = temp;
        if(arr[temp]==target){
            return temp;
        }
        if(target>=arr[start]&&arr[temp]>target){
            while(start<=end){
                int mid = start + (end - start) / 2;
                if(arr[mid]>target){
                    end=mid-1;
                }
                else if(arr[mid]<target){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
        }
       else{
            start = temp+1;
            end = arr.length-1;
            while(start<=end){
                int mid = start + (end - start) / 2;
                if(arr[mid]>target){
                    start=mid+1;
                }
                else if(arr[mid]<target){
                    end=mid-1;
                }
                else{
                    return mid;
                }
            }
        }
        return -1;
    }
}

