package dsa.patterns;

public class Pattern31 {
    static void main(String[] args) {
pattern31(4);
    }
    public static void pattern31(int n){
        for (int row = 1; row <2*n; row++) {
            int temp=n;

            if(row<=n){
                int temp2=n+1-row;
                for (int i = 1; i <row ; i++) {
                    System.out.print(temp);
                    temp--;
                }
                for (int j = 0; j <2*(n-row); j++) {
                    System.out.print(temp);
                }
                for (int i = 1; i <=row ; i++) {
                    System.out.print(temp2);
                    temp2++;
                }
            }
            else{

            }
            System.out.println();
        }

    }
}
