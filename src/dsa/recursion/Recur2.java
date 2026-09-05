package dsa.recursion;
import java.util.ArrayList;
import java.util.Arrays;

public class Recur2 {
    static void main(String[] args) {
//        System.out.println(isSorted(new int[]{1,2,7,3},0));
//        System.out.println(linearSearch(new int[]{1,2,7,3},2,0));
//        System.out.println(allIndex(new int[]{1,2,2,7,3},2,0));
        int[] arr={5,6,7,1,2,3};
        System.out.println(binarySearchinRoatedarray(arr,0,arr.length-1,0));
    }
    static boolean isSorted(int[] nums,int i){
        if(i==nums.length-1){
            return true;
        }
        return (nums[i]<nums[i+1])&&isSorted(nums,i+1);
    }
    static int linearSearch(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if (arr[index]==target){
            return index;
        }
        return linearSearch(arr,target,++index);
    }
//   static ArrayList<Integer> list=new ArrayList<>();
    static ArrayList allIndex(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if (arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls=allIndex(arr,target,index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
    static int binarySearchinRoatedarray(int[] arr,int s,int e,int t) {
        if (s > e) {
            return -1;
        }
        int mid = s + (e - s) / 2;
        if (arr[mid] == t) {
            return mid;
        }
        if (arr[mid] >= arr[s]) {
            if (t <= arr[mid] && arr[s] <= t) {
                return binarySearchinRoatedarray(arr, s, mid - 1, t);
            } else {
                return binarySearchinRoatedarray(arr, mid + 1, e, t);
            }
        }
        if (t >= arr[mid] && t <= arr[e]) {
            return binarySearchinRoatedarray(arr, mid + 1, e, t);
        }
        return binarySearchinRoatedarray(arr, s, mid - 1, t);
    }
    static void recursiveInsertionSort(int[] arr,int i,int n){//here n should be arr.length
        if(i==n) return;
        int j=i;
        while(j>0&&arr[j-1]>arr[j]){
            int temp=arr[j-1];
            arr[j-1]=arr[j];
            arr[j]=temp;
            j--;
        }
        recursiveInsertionSort(arr,i+=1,n);
    }
}












