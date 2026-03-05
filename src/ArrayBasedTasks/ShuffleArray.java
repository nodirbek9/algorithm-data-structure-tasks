package ArrayBasedTasks;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(shuffle(new int[]{1,2,3,4,4,3,2,1}, 4)));

    }

    public static int[] shuffle(int[] nums, int n) {
        int[] res = new int[nums.length];
        int count = 0;
        for (int i = 0; i < n; i++) {
            res[count++] = nums[i];
            res[count++] = nums[n + i];
        }
        return res;
    }
}
