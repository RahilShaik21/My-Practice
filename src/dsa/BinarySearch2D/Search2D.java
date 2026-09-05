package dsa.BinarySearch2D;

import java.util.Arrays;

public class Search2D {
    static void main(String[] args) {
        int[][] nums={{10,20,30,40},
                      {15,25,35,45},
                      {28,29,37,49},
                      {33,34,38,50},
        };
        int[][] num={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.toString(BinarySearch(nums,37)));
        System.out.println(Arrays.toString(SortedSearch(num,6)));

    }
    static  int[] BinarySearch(int[][] matrix,int target){
        int r=0;
        int c= matrix.length-1;
        while(r< matrix.length&& c>= 0){
            if(matrix[r][c]==target){
                return  new int[]{r,c};
            } else if (matrix[r][c]>target) {
                c--;
            }else{
                r++;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] BinarySearchNor(int[][] matrix , int row, int cStart, int cEnd, int target){
        while(cStart<cEnd){
            int mid=cStart+(cEnd-cStart)/2;
            if(matrix[row][mid]==target){
                return new int[]{row,mid};
            } else if (matrix[row][mid]<target) {
                cStart=mid+1;
            }else{
                cEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static  int[]  SortedSearch(int[][] matrix,int target){
        int rows=matrix.length;
        int cols=matrix[0].length;//be cautious,matrix may be empty
        if(rows==1){
            return BinarySearchNor(matrix,0,0,cols-1,target);
        }
        int rStart=0;
        int rEnd=rows-1;
        int cMid=cols/2;
        //run the loop till the 2 rows are remaining
        while(rStart<(rEnd-1)){//while this is true it will have more than 2 rows
            int mid=rStart+(rEnd-rStart)/2;
            if(matrix[mid][cMid]==target){
                return  new int[]{mid,cMid};
            }
            if(matrix[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        //now we have two rows
        //check whether the target is in the col of 2 rows
        if(matrix[rStart][cMid-1]==target){
            return  new int[]{rStart,cMid};
        } else if (matrix[rStart+1][cMid-1]==target){
            return  new int[]{rStart+1,cMid};
        }
        //search in 1 half
        if (target<=matrix[rStart][cMid-1]){
        return BinarySearchNor(matrix,rStart,0,cMid-1,target);}
        //search in second half
        else if(target<=matrix[rStart][cols-1]){
            return   BinarySearchNor(matrix,rStart,cMid+1,cols-1,target);}
        //search in 3 half
        else if(target<=matrix[rStart+1][cMid-1]){
            return BinarySearchNor(matrix,rStart+1,0,cMid-1,target);}
        //search in 4 half
        else{
            return BinarySearchNor(matrix,rStart+1,cMid+1,cols-1,target);}
    }
}
