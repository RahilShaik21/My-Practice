package dsa.patterns;

public class Pat19 {
    static void main(String[] args) {
        pattern19(5);
    }

    public static void pattern19(int n) {

        for (int row = 1; row <= 2 * n; row++) {
            int totalstars=row>n?row-n:n+1 - row;
            int totalspaces=row>n?2*(n-(row-n)):2*(row-1);

                for (int j = 1; j <= totalstars; j++) {
                    System.out.print("*");
                }
                for (int k = 1; k <= totalspaces; k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < totalstars; j++) {
                    System.out.print("*");
                }

            System.out.println();
        }
    }
}
