package dsa.Arrays1;

import java.util.*;

public class ArrPracHard {
    static void main(String[] args) {
        pascalTriangleI(6,8);
    }
    public static int pascalTriangleI(int r, int c) {
        //print any row or column element
//        int n=r-1;
//        int R=c-1;
//        int rem=1;
//        for (int i = 0; i < R; i++) {
//            rem*=(n-i);
//            rem/=(i+1);
//        }
//        return rem;

        // print any row
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<r;i++){
            l.addAll(genRow(i));
        }
    return 1;
    }
    static List<Integer> genRow(int row){
        List<Integer> l=new ArrayList<>();
        int ans=1;
        l.add(ans);
        for (int i = 1; i < row; i++) {
            ans*=(row-i);
            ans/=i;
            l.add(ans);
        }
        return l;
    }
    public List<Integer> majorityElementTwo(int[] nums) {
        int n=nums.length;
    int el1 = Integer.MIN_VALUE,el2=Integer.MIN_VALUE,c1=0,c2=0;
        for (int i = 0; i < nums.length; i++) {
            if(c1==0&&nums[i]!=el2){
                c1=1;
                el1=nums[i];
            } else if (c2==0&&nums[i]!=el1) {
                c2=1;
                el2=nums[i];
            }else if(nums[i]==el1){
                c1++;}
            else if(nums[i]==el2) {c2++;}
            else{
                c1--;
                c2--;
            }
        }
        int c11=0,c22=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==el1){
                c11++;
            }if(nums[i]==el2){
                c22++;
            }
        }
        ArrayList<Integer> arr=new ArrayList<>();
    if(c11>=n/3){
       arr.add(el1);
    }if(c22>=n/3){
        arr.add(el2);
        }
    return arr;
    }
    public List<List<Integer>> threeSum(int[] nums) {
//        HashSet<List<Integer>> set=new HashSet<>();
//        List<List<Integer>> list=new ArrayList<>();
//        int n=nums.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = i+1; j < n; j++) {
//                for (int k = j+1; k < n; k++) {
//                    if(nums[i]+nums[j]+nums[k]==0){
//                        List<Integer> l=new ArrayList<>(List.of(nums[i],nums[j],nums[k]));
//                        l.sort((x,y)->x-y);
//                        set.add(l);
//                    }
//                }
//            }
//        }
//        list.addAll(set);
//        return list;
//        int n=nums.length;
//        HashSet <List<Integer>> Hash=new HashSet<>();
//        for (int i = 0; i < n; i++) {
//            HashSet<Integer> set=new HashSet<>();
//            for (int j = i+1; j < n; j++) {
//                int sum=nums[i]+nums[j];
//                if(set.contains(-sum)){
//                    List<Integer> list=new ArrayList<>(List.of(nums[i],nums[j],-sum));
//                    list.sort((x,y)->(x-y));
//                    Hash.add(list);
//                }
//                set.add(nums[j]);
//            }
//
//        }
//        return new ArrayList<>(Hash);
        int n= nums.length;
        ArrayList<List<Integer>> list=new ArrayList<>();

        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if(i>0&&nums[i]==nums[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];

                if(sum<0) j++;
                else if(sum>0) k--;
                else{
                    list.add(List.of(nums[i],nums[j],nums[k]));
                    j++;
                    while(j<k&&nums[j]==nums[j-1]) j++;
                    while(j<k&&nums[k]==nums[k-1]) k--;
                }

            }
        }
        return list;
    }
    public List<List<Integer>> fourSum(int[] nums, int tar) {
        long target=tar;
                List< List<Integer>> list=new ArrayList<>();
                Arrays.sort(nums);
                for (int i = 0; i < nums.length; i++) {
                    if(i>0&&nums[i]==nums[i-1]) continue;
                    for (int j = i+1; j < nums.length; j++) {
                        if(j>i+1&&nums[j]==nums[j-1]) continue;
                        int k=j+1;
                        int l= nums.length-1;
                        while (k<l){
                            long sum=(long) nums[i]+nums[j]+nums[k]+nums[l];
                            if(sum==target){
                                list.add(List.of(nums[i],nums[j],nums[k],nums[l]));
                                k++;
                                while (k<l&&nums[k]==nums[k-1]) k++;
                                while(k<l&&nums[l]==nums[l-1]) l--;
                            } else if (sum<target) {
                                k++;
                            }else{
                                l--;
                            }
                        }
                    }
                }
                return list;
            }
    public int subarraysWithXorK(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count = 0;
        int sum=0;
        map.put(1,0);
        for (int i = 0; i < nums.length; i++) {
            sum^=nums[i];
            int rem=k^sum;
            if (map.containsKey(rem)){
                count+= map.get(sum);
                }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
        }

