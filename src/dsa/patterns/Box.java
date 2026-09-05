package dsa.patterns;

public class Box {
    static void main(String[] args) {
        boxpattern(4);
        square(5);
    }
    public static void boxpattern(int n){
        int temp=n;
        n=2*n;
        for (int i = 1; i <n; i++) {
            for (int j = 1; j <n; j++) {
                int res=temp-Math.min(Math.min(i,j),Math.min(n-i,n-j))+1;
                if(j==n-1){
                    System.out.print(res);
                }else{
                    System.out.print(res+" ");
                }
            }
            System.out.println();
        }
    }
    public static void square(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
