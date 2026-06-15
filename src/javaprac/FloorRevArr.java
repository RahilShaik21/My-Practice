package dsa;

public class FloorRevArr {
    static void main(String[] args) {
        int[] arr={7,7,6,6,6,6,5,4,4,4,3,3,2,2,1,1};
        int target=4;
        int a=getFloor(arr,target);

        System.out.println(a);
        if(a>=0){
        System.out.println(arr[a]);}

    }
    static int getFloor(int[] arr,int target){
        if(arr.length==1||arr[arr.length-1]<target){
            return -1;

        }        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]<target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
