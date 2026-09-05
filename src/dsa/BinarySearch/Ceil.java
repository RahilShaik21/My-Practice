package dsa.BinarySearch;

import java.util.Arrays;

public class Ceil {
    public static void main(String[] args) {//smallest element greater than or equal to target
        int[] arr = {1, 2, 2, 3, 4, 4, 4, 5, 6, 7, 7, 7, 7, 34, 34};
        int target = 7;

        System.out.println(search(arr, target));
        if (search(arr, target) >= 0) {
            System.out.println(arr[search(arr, target)]);
        }
        System.out.println(arr[ceil(arr, target)]);
        char[] arr1 = {'c', 'c', 'f', 'j'};
        System.out.println(nextGreatestLetter(arr1, 'j'));
        System.out.println(Arrays.toString((searchRange(arr, 8))));
    }

    static int ceil(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length == 0) {
            return -1;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return start;
    }

    static int search(int[] nums, int target) {
//here we are checking that the target should not be greater than last element of the array
        if (nums.length == 1 || nums[nums.length - 1] < target) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = end + (start - end) / 2;
            //here mid element checking that greater than or equal to the target so that we can get the requeried element
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        //here were are checking that start element should within the length
        return start < nums.length ? start : -1;
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;
        if (letters[end] < target) {
            return letters[0];
        }
        while (start <= end) {
            int mid = start + ((end - start) / 2);
            if (target < letters[mid]) {
                end = mid - 1;
            } else if (target >= letters[mid]) {
                start = mid + 1;
            }
        }
        return start % (letters.length) == 0 ? letters[0] : letters[start];
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = search(nums, target, true);
        res[1] = search(nums, target, false);
//        int start = 0;
//        int end = nums.length - 1;
//        //first occurance
//        while (start <= end) {
//
//            int mid = start + (end - start) / 2;
//            if (nums[mid] < target) {
//                start = mid + 1;
//            } else if (nums[mid] > target) {
//                end = mid - 1;
//            } else {
//                res[0] = mid;
//                end = mid - 1;
//            }
//        }
//        start = 0;
//        end = nums.length - 1;
//last occurance
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            if (nums[mid] < target) {
//                start = mid + 1;
//            } else if (nums[mid] > target) {
//                end = mid - 1;
//            } else {
//                res[1] = mid;
//                start = mid + 1;
//            }
//        }
        return res;
    }

    static int search(int[] nums, int target, boolean StartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (StartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
            return ans;
        }
}