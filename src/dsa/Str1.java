package dsa;

public class Str1 {
    static void main(String[] args) {
//        String a="rahil";
//        String b="rahil";
//        int[] num1={1};
//        int[] num2={1};
//        System.out.println(num1==num2);
//        System.out.println(a==b);
//        a="kunal";
//        System.out.println(a);
//        String str1=new String("kunal");
//        String str2=new String("kunal");
//        System.out.println(str1==str2);
//        System.out.println(str1.equals(str2));
//        System.out.println(str1.charAt(4));
//        [---Place Holders--]
        int[] a={4,5,6,7,0,2,1,3};
//        System.out.println("011010",2,3));

    }
    public static String defangIPaddr(String address) {
    StringBuilder str=new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if(address.charAt(i)=='.'){
                str.append("[.]");
            }else{
                str.append(address.charAt(i));
            }
        }
        return str.toString();
    }
    public static String restoreString(String s, int[] indices) {
        StringBuilder str=new StringBuilder(s);
        for (int i = 0; i < indices.length; i++) {
            str.setCharAt(indices[i],s.charAt(i));
        }
        return str.toString();
    }
    public static String interpret(String command) {
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i)=='G'){
                str.append('G');
            }else if(command.charAt(i)=='('&&command.charAt(i+1)==')'){
                str.append('o');
            }else if(command.charAt(i)=='('&&command.charAt(i+1)=='a'){
                str.append("al");
            }else{
                continue;
            }
        }
        return str.toString();
    }
    public boolean checkPalindromeFormation(String a, String b) {
        if(a.length()==1){
            return true;
        }
        int len=a.length()-1;
        boolean ans=false;
        for (int i = 0; i < a.length(); i++) {
            if(a.charAt(i)==b.charAt(len-i)||a.charAt(len-i)==b.charAt(i)){
                if(i>=1){
                return true;}
            }else{
                return false;
            }
        }
        return false;
    }
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        int[] idx=new int[9];
        StringBuilder str=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            int digit=arr[i].charAt(arr[i].length()-1)-'0';
            idx[digit-1]=i;
        }
        for (int i = 0; i < arr.length; i++) {
            String temp=arr[idx[i]].substring(0,arr[idx[i]].length()-1);
            str.append(temp);
            if(i<arr.length-1){
                str.append(" ");
            }
        }
        return str.toString();
    }
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder str1=new StringBuilder();
        StringBuilder str2=new StringBuilder();
        for (int i = 0; i < word1.length; i++) {
            str1.append(word1[i]);
        }
        for (int i = 0; i < word2.length; i++) {
            str2.append(word2[i]);
        }
        return str1.toString().equals(str2.toString());
    }
}
