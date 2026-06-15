package dsa;

public class CeilRevArr {
    static void main(String[] args) {
        int[] arr={7,7,6,6,6,6,5,4,4,4,3,3,2,2,1,1};
        int target=4;
        int a=getCeil(arr,target);

        System.out.println(a);
        if(a>=0){
            System.out.println(arr[a]);}
    }
    public static int getCeil(int[] arr,int target) {
        if (arr.length == 1 || arr[0] < target) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return end;
    }
    }

