package dsa.Basic_Math;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Binary_operators {
    static void main(String[] args) {
        System.out.println(EvenOrOdd(3));
        int[] arr={1,1,2,3,4,4,2,5,5};
        System.out.println(UniqueNum(arr));
        System.out.println(findIthBit(12,2));
        System.out.println(SetNthBit(6,1));
        System.out.println(ResetNthBit(7,2));
        System.out.println(RightSetBit(4));
        int[] num={2,2,2,7};
        System.out.println(getUniqueIn3(num));
        System.out.println(nthMagicNum(5));
        System.out.println(NoOfBits(8));
        System.out.println(is2Power(6));
        System.out.println(getaB(3,2));
        System.out.println(findNoSetBits(14));
        System.out.println(getXor0ToA(8));
        System.out.println(getRangeXor(3,8));
        int[][] arr1={{1,1,1,0},{0,1,0,0},{1,0,1,1},{1,0,1,1}};
        System.out.println(Arrays.deepToString(flipAndInvertImage(arr1)));

    }
    public static String EvenOrOdd(int n){
        return (n&1)==1?"odd":"even";
    }
    public static int UniqueNum(int[] arr){
        int unique=0;
        for(int i:arr) {
            unique^=i;
        }
        return unique;
    }
    public static int findIthBit(int num,int position){
        int ans=num&(1<<(position-1));
        return ans>>(position-1);
    }
    public static int SetNthBit(int num,int position){
        int ans=num|(1<<(position-1));
        return ans;
    }
    public static int ResetNthBit(int num,int position){
        int ans=num&(~(1<<(position-1)));
        return ans;
    }
    public static int RightSetBit(int n){
        int ans =(n)&(-n);
        ans=Integer.numberOfTrailingZeros(n);
        return ans;
    }
    public static int getUniqueIn3(int[] arr){
        int res=0;
        for (int bit = 0; bit < 32; bit++) {
            int count=0;
            for(int i:arr){
                if(((i>>bit)&1)==1){
                    count++;
                }
            }
           if(count%3!=0){
               res=res|(1<<bit);
           }
        }
        return res;
    }
    public static int nthMagicNum(int num){
        int res=0;
//        for (int i = 0; i < 32; i++) {
//            res+=((num>>i)&1)*(Math.pow(5,i+1));
//
//        }
        int base=5;
        while(num>0){
            int last=num&1;
            num=num>>1;
            res+=last*base;
            base*=5;
        }
        return res;
    }
    public static int NoOfBits(int num){
        int res=0;
        res=(int)(Math.log(num)/Math.log(2))+1;;
        return res;
    }
    public static int is2Power(int num){
        int count=0;//when n=0 return -1;
//       while(num>0){
//           int last=num&1;
//           num=num>>1;
//           if(last==1){
//               count++;
//           }
//        }

        if((num&(num-1))==0){
            return 1;
        }
        return -1;
    }
    public static int getaB(int base,int power){
        int res=1;
        while(power>0){
            if((power&1)==1) {
                res *= base;
            }
            base*=base;
            power=power>>1;
        }
        return res;
    }
    public static int findNoSetBits(int n){
        int count=0;
//        System.out.println(Integer.toBinaryString(n));
        while(n>0){
//            if((n&1)==1){
//                count++;
//            }
//            n=n>>1;
//            n&-n gives right most set bit
//            count++;
//            n=n-(n&(-n));
            count++;
            n=n&n-1;
        }
       return count;
    }
    public static int getXor0ToA(int n){
        if(n%4==0){
            return n;
        } else if (n%4==1) {
            return 1;
        } else if (n%4==2) {
            return n+1;
        }else if(n%4==3){
            return 0;
        }
        return -1;
    }
    public static int getRangeXor(int a,int b){
        // only for check ,will time excluded for bigger numbers
        int ans = 0;
        for (int i = a; i <=b ; i++) {
            ans^=i;
        }
        System.out.println(ans);
        return getXor0ToA(b)^getXor0ToA(a-1);
    }
    public static int[][] flipAndInvertImage(int[][] image) {
        for(int[] row: image){
            for (int i = 0; i < (image[0].length+1)/2; i++) {
                int temp=row[i];
                row[i] = row[image[0].length-i-1]^1;
                row[image[0].length-i-1]=temp^1;
            }
        }
        return image;
    }
}
















