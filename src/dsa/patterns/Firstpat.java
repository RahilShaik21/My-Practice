package dsa.patterns;

public class Firstpat{

    public void main(String[] args) {
        System.out.println("hello");
        pattern6(4);
    }
    public static void pattern3(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j<=n-i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern1(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern2(int n) {

        for (int rows = 1; rows <= n; rows++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        }
    public static void pattern6(int n){
        for (int row = 1; row <= n; row++) {
            int temp = row%2==0?0:1;
            for (int col = 1; col <= row; col++) {
                if(col==row){
                    System.out.print(temp);
                }
                else{
                    System.out.print(temp+" ");
                }
                temp=temp==0?1:0;
            }
            System.out.println();
        }
    }
    }


