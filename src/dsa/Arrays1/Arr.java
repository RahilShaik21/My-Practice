package dsa.Arrays1;
import java.util.*;

public class Arr {
    static void main(String[] args) {
//        int[] nums={0,1,2,3,4};
//        int[] index={0,1,2,2,1};
//        System.out.println(java.util.Arr.toString(createTargetArray(nums,index)));
//        System.out.println(checkIfPangram("Thequickbrownfoxjumpsoverthelazydog"));
//        ArrayList<ArrayList<String>> items=new ArrayList<ArrayList<>>;
        int[] gain={-5,1,5,0,-7};
        System.out.println(largestAltitude(gain)    );

    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> ans =new ArrayList<>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            ans.add(index[i],nums[i]);
        }
        int[] a=new  int[nums.length];
        for (int i=0;i<nums.length;i++) {
            a[i]=ans.get(i);
        }
        return a;
    }
    public static boolean checkIfPangram(String sentence) {
        boolean ans=true;
        sentence=sentence.toLowerCase();
        for (char i = 'a'; i <= 'z'; i++) {
            if(!sentence.contains(String.valueOf(i))){
                ans=false;
                break;
            }
        }
        return ans;
    }
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int row;
        int count=0;
        if(ruleKey.contentEquals("color")){
            row=1;
        }else if(ruleKey.contentEquals("type")){
            row=0;
        }else{
            row=2;
        }
        for (int i = 0; i < items.size(); i++) {
            if((items.get(i).get(row)).contentEquals(ruleValue)){
                count++;
            }
        }
        return count;
    }
    public static int largestAltitude(int[] gain) {
        int peak=0;
        int highPeak=0;
        for (int i = 0; i < gain.length; i++) {
            peak+=gain[i];
            if(highPeak<peak){
                highPeak=peak;
            }
        }
        return highPeak;
    }
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> arr=new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            int idx1=i;
            int idx2=0;
            int minRow=matrix[idx1][idx2];
            for (int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j]<minRow){
                    minRow=matrix[i][j];
                    idx1=i;
                    idx2=j;
                }
            }
            if(checkMaxINColumn(matrix,idx1,idx2)){
                arr.add(minRow);
            };
        }
        return arr;
    }
    public boolean checkMaxINColumn(int[][] matrix,int idx1,int idx2){
        for (int i = 0; i < matrix.length ; i++) {
            if(matrix[idx1][idx2]>matrix[i][idx2]){
                return false;
            }
        }
        return true;
    }
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if(mat.length*mat[0].length!=r*c){
            return mat;
        }
        int[][] newMat=new int[r][c];
        int i1=0;
        int j1=0;

        for (int k = 0; k < mat.length; k++) {
            for (int l = 0; l < mat[k].length; l++) {
                newMat[i1][j1]=mat[k][l];
                j1++;
                if(j1==c){
                    i1++;
                    j1=0;
                }
            }
        }

        return newMat;
    }
}
