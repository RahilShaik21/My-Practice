package dsa;

public class Ceil {
    public static void main(String[] args) {//smallest element greater than or equal to target
        int[] arr = {1,2,2,3,4,4,4,5,6,7,7,7,7,34,34};
        int target =2;

        System.out.println(search(arr,target));
        if(search(arr,target)>=0){
            System.out.println(arr[search(arr,target)]);
        }
    }

    static int search(int[] nums, int target) {
//here we are checking that the target should not be greater than last element of the array
  if (nums.length==1 || nums[nums.length-1]<target){
      return -1;
  }
        int start=0;
        int end=nums.length-1;

  while(start<=end){
      int mid =end+(start-end)/2;
      //here mid element checking that greater than or equal to the target so that we can get the requeried element
      if(nums[mid]<=target){
          start=mid+1;
      }
      else{
          end=mid-1;
      }
  }
  //here were are checking that start element should within the length
  return start<nums.length?start:-1;
}
}
