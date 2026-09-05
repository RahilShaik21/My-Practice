package dsa.Basic_Math;

public class Prime {
    static void main(String[] args) {
        int n=40;
        boolean[] res=new boolean[n+1];
//        primeForRange(n,res);
//        System.out.println(getSqrt(40,10));
//        System.out.printf("%.3f",getSqrt(40,10));
        System.out.println(newtonSqrt(40));
    }
    static void primeForRange(int n,boolean[] res){
        res[0]=true;
        res[1]=true;
        for (int i = 2; i*i <= n ; i++) {
            if(!res[i]){
                for (int j = i*2; j <=n ; j+=i) {
                    res[j]=true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if(res[i]==false){
                System.out.print(i+" ");
            }
        }
    }
    static double getSqrt(int n,int p){
        int start=0;
        int end=n;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(mid*mid==n){
                return mid;
            }
            if(mid*mid<n){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }

        double ans=0;
        ans+=end;
        double inc=0.1;
        for (int i = 0; i < p; i++) {
            while(ans*ans<=n){
                ans+=inc;
            }
            ans-=inc;
            inc/=10;
        }
        return ans;
    }
    static double newtonSqrt(double n){
        double x=n;
        double root;
        while(true){
            root=0.5*(x+(n/x));
            if(Math.abs(root-x)<1){
                break;
            }
            x=root;
        }
        return root;
    }
}
