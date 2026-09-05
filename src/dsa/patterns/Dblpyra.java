package dsa.patterns;

public class Dblpyra {
    static void main(String[] args) {
pattern(4);
    }
    public static void pattern(int n) {

        for (int rows = 1; rows <=2*n; rows++) {
            int totalSpaces=rows>n?rows-n-1:n-rows;
            for (int spaces = 1; spaces <=totalSpaces; spaces++) {
                System.out.print(" ");
            }
            int totalcols=rows>n?(2*n-2*totalSpaces-1):2*rows-1;
            for (int j = 1; j <=totalcols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
