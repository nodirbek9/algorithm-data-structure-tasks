package ArraygaOyidMasalalar;

import java.util.Arrays;

public class SquaresSortArr {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[] {-7,-3,2,3,11})));
    }
    public static int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) Math.pow(nums[i], 2);
        }
        Arrays.sort(nums);
        return nums;

    }
}
