package dsa.patterns;

public class Pattern5 {
    static void main(String[] args) {
        pattern5(5);
    }
    public static void pattern5(int n) {

        for (int rows = 1; rows <= 2*n; rows++) {
            int totalcols=rows>n?(n-(rows-n)):rows;
            for (int j = 1; j <= totalcols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
