package dsa.Arrays1;
import java.util.Arrays;

class Solution {
    static void main(String[] args) {
        int[][] nn = {
                {1,2,3},
                {4,5,6},

        };
        int[] nums={12,345,2,6,7896};

//        System.out.println((oddCells(2,3,nn)));
//        System.out.println(diagonalSum(nn));
        System.out.println(Arrays.deepToString(transpose(nn)));
    }
    public static int oddCells(int m, int n, int[][] indices) {
//        int[][] nums=new int[m][n];
//        int sum=0;
//        for (int k= 0; k < indices.length; k++) {
//            sum(nums,indices[i],m,n);
//            for (int i = 0; i < m; i++) {
//
//                for (int j = 0; j <n; j++) {
//                    if(indices[k][0]==i){
//                        nums[i][j]+=1;
//                    }
//                    if(indices[k][1]==j) {
//                        nums[i][j] += 1;
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                if(nums[i][j]%2==1){
//                    sum+=1;
//                }
//            }
//
//        }
//        return sum;
        int[] rows=new int[m];
        int[] cols=new int[n];
        int count=0;
        for (int i = 0; i < indices.length; i++) {
           rows[indices[i][0]]+=1;
           cols[indices[i][1]]+=1;
        }
        for (int i = 0; i < rows.length; i++) {
            for (int j = 0; j < cols.length; j++) {
                int value=rows[i]+cols[j];
                if(value%2==1){
                    count++;
                }
            }
        }
    return count;
    }
    public static int[][] transpose(int[][] matrix) {
        int[][] newMat=new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                newMat[j][i]=matrix[i][j];
            }
        }
        return newMat;
    }

}