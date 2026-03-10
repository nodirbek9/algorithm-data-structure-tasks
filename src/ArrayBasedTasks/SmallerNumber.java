package ArrayBasedTasks;

import java.util.Arrays;

public class SmallerNumber {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{7,7,7,7}))); //Output: [4,0,1,1,3]

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j] && i != j) {
                    count++;
                }
            }
            res[i] = count;
        }
        return res;
    }
}
