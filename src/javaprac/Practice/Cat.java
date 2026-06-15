package Practice;

import java.util.Arrays;

public class Cat extends Animal{
    @Override
    String makeSound() {
        return "meow..";
    }

    public static class Calculatar {
        public int add(int a, int b) {
            return a + b;
        }

        public int add(int a, int b, int c) {
            return a + b + c;
        }
        public double add(double a, double b) {
            return a + b;
        }

        public String add(String a, String b) {
            return a + b;
        }
        public String add(String a, int c) {
            return a + c;
        }

        static void main(String[] args) {
            Calculatar c = new Calculatar();
            System.out.println(c.add("rahil",""));
        }
    }

    public static class Temp{
        static void main(String[] args) {
            int[] nums={1,2,3,4,5,6};
            int n=3;
            System.out.println(Arrays.toString(shuffle(nums,n)));
        }
        public static int[] shuffle(int[] nums, int n) {
            int[] res=new int[2*n];
            for(int i=0;i<n;i++){
                res[2*i+1]=nums[n+i];
                res[2*i]=nums[i];
            }
            return res;
        }
    }
}
