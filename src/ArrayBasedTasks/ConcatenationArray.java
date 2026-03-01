package ArrayBasedTasks;

import java.util.Arrays;

public class ConcatenationArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,3})));

    }
    public static int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] res = Arrays.copyOf(nums, len * 2);
        for (int i = 0; i < len; i++) {
            res[len + i] = nums[i];
        }
        return res;
    }
}
