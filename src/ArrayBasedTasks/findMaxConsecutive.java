package ArrayBasedTasks;

public class findMaxConsecutive {
    public static void main(String[] args) {
        System.out.println();
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int res = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i]==1) {
                count++;
            }
            if(nums[i]==0){
                count = 0;
            }
            if(res<count){
                res = count;
            }
        }
        return res;
    }
}
