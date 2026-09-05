package dsa.patterns;

public class pat12 {
    static void main(String[] args) {
        pattern(4);
        pattern17(4);
        pattern18(5);
    }
    public static void pattern(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j);
            }
            for (int space = 1; space <=2*(n-i); space++) {
                System.out.print(" ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
    public static void pattern13(int n) {

        for (int i = 0; i < n; i++) {
            char temp='A';
            for (int j = 1; j <= n-i; j++) {
                if(j==i){
                    System.out.print(temp);
                }else{
                    System.out.print(temp+" ");
                }
                temp++;
            }
            System.out.println();
        }
    }
    public void pattern14(int n) {
        for (int i = 1; i <= n; i++) {
            char temp='A';
            for (int j = 1; j <= i; j++) {

                System.out.print(temp);

                temp++;
            }
            System.out.println();
        }
    }
    public void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            char temp='A';
            for (int j = 1; j <= n-i; j++) {
                System.out.print(temp);

                temp++;
            }
            System.out.println();
        }
    }
    public void pattern16(int n) {
        char temp='A';
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
            }
            System.out.println();
            temp++;
        }
    }

    public static void pattern17(int n) {

        for (int row = 1; row <= n; row++) {
            char temp='A';
            for (int space = 0; space < n-row  ; space++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) {
                System.out.print(temp);
                temp++;
            }
            temp-=2;
            for (int k = 1; k < row; k++) {
                System.out.print(temp);
                temp--;
            }
            System.out.println();
        }
    }
    public static void pattern18(int n) {
        for (int i = 1; i <= n; i++) {
            char temp=(char)('A'+n-i);
            for (int j = 1; j <= i; j++) {
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }
    }
}
