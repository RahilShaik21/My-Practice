package dsa.Arrays1;

import dsa.patterns.Pat19;

import java.util.*;


public class PrArrMed {
    static void main(String[] args) {
        int[] arr={1, 6, 2, 10, 3};
        System.out.println(Arrays.toString(twoSum(arr,7)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]) continue;
                if(nums[i]+nums[j]==target) return new int[]{i,j};
            }
        }
//        better
        HashMap<Integer,Integer> h=new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(h.containsKey(target-nums[i])){
                int idx=h.get(target-nums[i]);
                return new int[]{i,idx};
            }
            else{
                h.put(nums[i],i);
            }
        }
        //optimal
        int n=nums.length;
        int[][] ar=new int[n][2];
        for (int i = 0; i < nums.length; i++) {
            ar[i][0]=nums[i];
            ar[i][1]=i;
        }
        Arrays.sort(ar,(a,b)->Integer.compare(a[0],b[0]));
        int l=0;
        int r=nums.length-1;

        while (l<r){
            int s=ar[l][0]+ar[r][0];
            if(s<target){
                l++;
            }
            else if(s>target){
                r--;
            }else{
                return new int[]{ar[l][1],ar[r][1]};
            }

        }
        return new int[]{-1,-1};
    }
    public void sortZeroOneTwo(int[] nums) {

    int low=0,mid=0,high=nums.length-1;
       while(mid<=high){
           if(nums[mid]==0){
               swaap(nums,mid,low);
               low++;
               mid++;
           } else if (nums[mid]==1) {
               mid++;
           }else{
               swaap(nums,high,mid);
               high--;
           }
       }
    }
    void swaap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public int majorityElement(int[] nums) {
        int n=nums.length;
//    HashMap<Integer,Integer> map=new HashMap<>();
//    for(int num:nums){
//        map.put(num,(map.getOrDefault(num,0))+1);
//    }
//    for(Map.Entry<Integer,Integer> en:map.entrySet()){
//        if(en.getValue()>n/2){
//            return en.getKey();
//        }
//    }
        int el=0;
        int count=0;
        for (int i = 0; i < n; i++) {
            if(count==0){
                el=nums[i];
                count++;
            }else if(nums[i]==el){
                count++;
            }else{
                count--;
            }
        }
        int c1=0;
        for (int i = 0; i <n; i++) {
            if(el== nums[i]){
                c1++;
            }
        }

    return c1>n/2?el:-1;
    }
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int sum=0;
        int ansStart=-1,ansEnd=-1;
        for (int i = 0; i < nums.length; i++) {
            int s=-1;
            if(sum==0){
                s=i;
            }
            sum+=nums[i];
            if(max<sum){
                max=sum;
                ansStart=s;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;
            }

        }
        return max;
    }
    public int[] rearrangeArray(int[] nums) {
        int l=nums.length;
        int[] pos=new int[l/2];
        int[] neg=new int[l/2];
        int n=0,p=0;
        for (int i = 0; i < l; i++) {
            if(nums[i]<0){
                neg[n]=nums[i];
                n++;
            }else{
                neg[p]=nums[i];
                p++;
            }
        }
        p=0;
    n=0;
        for (int i = 0; i < l; i++) {
            if(i%2==0){
                nums[i]=neg[n];
                n++;
            }
            else{
                nums[i]=pos[p];
                p++;
            }
        }
        return nums;
    }
    public void nextPermutation(int[] nums) {
        int idx=-1;
        int n=nums.length;
        for (int i = n-2; i >=0 ; i--) {
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }
        if(idx==-1) {
           int l=0,r=n-1;
           while(l<r){

                   int temp=nums[l];
                   nums[l]=nums[r];
                   nums[r]=temp;
               l++;
               r--;
           }
        }
        for (int i = n-1; i >=0; i--) {
            if(nums[i]<nums[idx]){
                int temp=nums[idx];
                nums[idx]=nums[i];
                nums[i]=temp;
               break;
            }
        }
       int left =idx+1,right=n-1;
        while(left<right){

                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
            left++;
            right--;
        }
    }
    public List<Integer> leaders(int[] nums) {
        int n=nums.length;
        int max=nums[n-1];
        List<Integer> list=new ArrayList<>();
        list.add(max);
        for(int i=n-1;i>=0;i--){
            if(nums[i]>max){
                list.add(nums[i]);
                max=nums[i];
            }
        }
        return list.reversed();
    }
    boolean Search(int[] n,int t){
        for (int i = 0; i < n.length; i++) {
            if(n[i]==t){
                return true;
            }
        }
        return false;
    }
    public int longestConsecutive(int[] nums) {
//        int mC=1;
//        int c=1;
//        for (int i = 0; i < nums.length; i++) {
//            int x=nums[i];
//            while(Search(nums,x+1)){
//                x++;
//                c++;
//            }
//            mC=Math.max(c,mC);
//        }
//        return mC;

//        Arrays.sort(nums);
//        int c=0;
//        int mc=0;
//        int preVal=nums[0];
//        for (int i = 1; i < nums.length; i++) {
//            if(nums[i]==preVal+1) c++;
//            else if(nums[i]==preVal) continue;
//            else{
//                mc=Math.max(c,mc);
//                c=1;
//                preVal=nums[i];
//            }
//            mc=Math.max(c,mc);
//        }
//        return mc;
        HashSet<Integer> set=new HashSet<>();
        int mc=1;
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        for(int num:set){
            if(!set.contains(num-1)){
                int val=num;
                int c=1;
                while(set.contains(num+1)){
                    num++;
                    c++;
                }
                mc=Math.max(mc,c);
            }
        }
        return mc;
    }
    public void rotateMatrix(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = i+1; j < n; j++) {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i = 0; i < m; i++) {
           int start=0,end=n-1;
           while (start<end){
               int temp=matrix[i][end-start];
               matrix[i][end-start]=matrix[i][start];
               matrix[i][start]=temp;
           }

        }
    }
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0,right=n-1,top=0,bottom=m-1;
        List<Integer> arr=new ArrayList<>();
        //top
       while (left<=right&&top<=bottom){
           for (int i = left; i <= right; i++) {
               arr.add(matrix[top][i]);
           }
           top++;
           //right
           for (int i = top; i <= bottom; i++) {
               arr.add(matrix[i][right]);
           }
           right--;
           //bottom
          if(top<=bottom){
              for (int i = right; i >=left ; i--) {
                  arr.add(matrix[bottom][i]);
              }
              bottom--;
          }
           //left
           if(left<=right){
           for (int i = bottom; i >=top ; i--) {
               arr.add(matrix[i][left]);
           }}
       }

        return arr;
    }
    public int subarraySum(int[] nums, int k) {
    int c=0;
    HashMap<Integer,Integer> h=new HashMap<>();
    int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            int rem=sum-k;
            if(h.containsKey(sum-k)){
                c+=h.get(rem);
            }
            h.put(sum,h.getOrDefault(sum,1)+1);
        }
        return c;
    }
}
