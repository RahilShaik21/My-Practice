package dsa.Arrays1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hasing{
    static void main(String[] args) {
        int[] arr={1,2,1,3,2};
        int[] hash=new int[12];
        int[] values={5,1,4,2,3};
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]+=1;
        }
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]+" "+hash[values[i]]);
        }
    }
    public static int countFrequencies(int[] nums) {
        // Your code goes here
        Map<Integer,Integer> map=new HashMap();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int key=map.get(nums[i]);
                map.put(nums[i],key+1);
            }else{
                map.put(nums[i],1);
            }
        }
       int maxKey=0;
        int maxvlaue=0;
       for ( Map.Entry<Integer,Integer> ma:map.entrySet()){
          if(ma.getValue()>maxvlaue){
              maxKey=ma.getKey();
              maxvlaue=ma.getValue();
          }
       }
return maxKey;
    }
}