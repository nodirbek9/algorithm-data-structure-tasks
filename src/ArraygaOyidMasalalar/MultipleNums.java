package ArraygaOyidMasalalar;

import java.util.Arrays;

public class MultipleNums {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(productExceptSelf(new int[] {-1,1,0,-3,3})));

    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 1;
        for (int i = 0; i < n; i++) {
            result[i] = left;
            left *= nums[i];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= right;
            right *= nums[i];
        }

        return result;
    }

}
