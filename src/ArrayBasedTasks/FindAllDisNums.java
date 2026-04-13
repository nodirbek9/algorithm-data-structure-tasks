package ArrayBasedTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDisNums {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1}));

    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        System.out.println(Arrays.toString(nums));
        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0) {
                nums[nums[i]-1] = nums[nums[i]-1]*(-1);
            }else {
                nums[Math.abs(nums[i])-1] = nums[Math.abs(nums[i])-1]*(-1);
            }
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]>0){
                result.add(i+1);
            }
        }
        return result;
    }
}
