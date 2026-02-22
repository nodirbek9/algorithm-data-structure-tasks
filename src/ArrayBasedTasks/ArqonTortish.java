package ArrayBasedTasks;

import java.util.Arrays;

public class ArqonTortish {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(leftRightDifference(new int[]{1,2,3,4})));

    }

    public static int[] leftRightDifference(int[] nums) {
        int[] result = new int[nums.length];
        int left = 0;
        int right = Arrays.stream(nums).sum();
        for (int i = 0; i < nums.length; i++) {
            right = right-nums[i];
            if (left > right) {
                result[i]=-1;
            }else if (left < right){
                result[i] = 1;
            }else {
                result[i] = 0;
            }
            left+=nums[i];
        }
        return result;
    }
}
