package ArraygaOyidMasalalar;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4}; //7 6 5 4 3 2 1
        System.out.println(arr.length);
        System.out.println(Arrays.toString(rotate(arr, 5)));
    }
    public static int[] rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // Normalize k to handle rotations greater than array length

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        return nums;
    }
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    }

//    public static int[] rotate(int[] nums, int k) {
//        int count = 0;
//        int forChange = 0;
//        int duration = 0;
//        for (int i = 0; i < k; i++) {
//            if (k != nums.length) {
//                forChange = nums[i - count];
//                nums[i - count] = nums[nums.length - 1];
//
//                for (int j = 1; j < nums.length; j++) {
//                    if (count != k) {
//                        duration = nums[j];
//                        nums[j] = forChange;
//                    }
//                    forChange = duration;
//                }
//            }
//            count++;
//        }
//        return nums;
//    }

