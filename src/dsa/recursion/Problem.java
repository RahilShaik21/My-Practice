package dsa.recursion;

public class Problem{

    static void main(String[] args) {
//        fun(5);
//        funRev(5);
//        funBoth(5);
//        double t=1;
//        for (int i = 1; i <= 99; i++) {
//            t*=i;
//        }
//        System.out.println(t);
        System.out.println(revInt(133));
    }

static void fun(int n){
    if(n==0){
        return;
    }
    System.out.println(n);
    fun(n-1);
}
    static void funRev(int n){
        if(n==0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
    static void funBoth(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);
    }
    static double fact(int n){
        if(n==1){
           return 1;
        }
        return n*fact(n-1);
    }
    static int sumofdigit(int n){
        if(n<=9){
            return n;
        }
        return n%10+sumofdigit(n/10);
    }
    static int revInt(int n){
        if(n<=9){
            return n;
        }
        int temp=n%10;
        int length=(int) Math.pow(10,(int)Math.log10(n));
        return (temp*length+revInt(n/10));
    }

}
