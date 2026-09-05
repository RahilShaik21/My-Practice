package dsa.patterns;

public class Fifth {
    static void main(String[] args) {
        pattern(4);
    }
    public static void pattern(int n){
        for (int i = 1; i <2* n; i++) {
            int totalcols=i>n?(n-(i-n)):i;
            for (int j = 1; j <=totalcols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    }

