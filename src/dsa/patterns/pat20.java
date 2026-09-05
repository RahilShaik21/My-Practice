package dsa.patterns;

public class pat20 {
    static void main(String[] args) {
        pattern21(5);
    }
    public static void pattern21(int n) {
        for (int row = 1; row < 2 * n; row++) {

            int stars = row <= n ? row : 2 * n - row;
            int spaces = 2 * (n - stars);

            for (int i = 1; i <= stars; i++) {
                System.out.print("*");
            }

            for (int i = 0; i < spaces; i++) {
                System.out.print(" ");
            }

            for (int i = 1; i <= stars; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
    public static void pattern20(int n){
        for (int row = 1; row < 2*n; row++) {
            if(row<=n){
                for (int j = 1; j<=row; j++) {
                    System.out.print("*");
                }
                for (int k = 0; k < 2*(n-row); k++) {
                    System.out.print(" ");
                }
                for (int j = 1; j<=row; j++) {
                    System.out.print("*");
                }
            }
            else{
                for (int i = 1; i <= (n-(row-n)); i++) {
                    System.out.print("*");
                }
                for (int spaces = 0; spaces <2*(row-n) ; spaces++) {
                    System.out.print(" ");
                }
                for (int i = 1; i <= (n-(row-n)); i++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
