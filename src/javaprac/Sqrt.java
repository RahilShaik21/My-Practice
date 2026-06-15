package dsa;

public class Sqrt {
    static void main(String[] args) {
        int num=2147395599;
        System.out.println(mySqrt(num));
    }
    public static int mySqrt(int x) {
        if (x < 2) {
            return x;
        }

        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return end;
    }
}