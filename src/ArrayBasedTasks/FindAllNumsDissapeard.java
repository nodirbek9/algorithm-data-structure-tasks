package ArrayBasedTasks;

import java.util.*;

public class FindAllNumsDissapeard {
    public static void main(String[] args) {
        System.out.println(findDisappearedNumbers(new int[]{1,1,1}));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> res = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (var num : nums){
            res.add(num);
        }

        int count = 1;
        for (int i = 0; i < nums.length; i++) {
            if(!res.contains(count)){
                result.add(count);
            }
            count++;
        }
        return result;
    }
}
