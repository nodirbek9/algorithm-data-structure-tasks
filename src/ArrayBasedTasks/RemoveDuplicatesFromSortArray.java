package ArrayBasedTasks;

public class RemoveDuplicatesFromSortArray {

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));

    }
    public static int removeDuplicates(int[] nums) {
        int k = 2;
        if (nums.length > 2) {
            for (int i = 2; i < nums.length; i++) {
                if (nums[i] != nums[k - 2]) {
                    nums[k] = nums[i];
                    k++;
                }
            }
        }
        return k;
    }
}
