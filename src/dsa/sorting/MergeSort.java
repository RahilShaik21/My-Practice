package dsa.sorting;

import java.util.Arrays;

public class MergeSort {
    static void main(String[] args) {
        int[] arr={2,3,1,5};
//        int[] ans=mergesort(arr,0, arr.length-1);
        mergeInSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length-1));
        return merge(left,right);
    }
    static int[] merge(int[] first,int[] second){
        int i=0;
        int j=0;
        int[] arr=new int[first.length+second.length];
        int k=0;
        while(i<first.length&&j<second.length){
            if(first[i]<second[j]){
                arr[k]=first[i];
                i++;
                k++;
            }
            else{
                arr[k]=second[j];
                j++;
                k++;
            }
        }
        while(i<first.length){
            arr[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            arr[k]=second[j];
            j++;
            k++;
        }
            return arr;
    }
    static void mergeInSort(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid=s+(e-s)/2;
        mergeInSort(arr,s,mid);
        mergeInSort(arr,mid,e);
        mergeIN(arr,s,mid,e);
    }

    private static void mergeIN(int[] arr, int s, int mid, int e) {
        int[] mix=new int[e-s];
        int i=s;
        int j=mid;
        int k=0;
        while(i<mid&&j<e){
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<mid){
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length; l++) {
            arr[s+l]=mix[l];
        }
    }


}
