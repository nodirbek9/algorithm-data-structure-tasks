package ArraygaOyidMasalalar;

public class MoveZero {
    public static void main(String[] args) {

    }
    public static int[] moveZeroes(int[] nums) {
        int count = 0;
        int forChange = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                forChange = nums[i];
                nums[i] = nums[i-count];
                nums[i-count] = forChange;
            }
        }
        return nums;
    }

}
//public static int[] moveZeroes(int[] nums) {
//        int forSave = 0;
//        int i = 0;
//        int j = 1;
//        if (nums.length == 1 && nums[0] == 0) {
//            return nums;
//        } else {
//            while (i != nums.length) {
//                if (nums[j - 1] == 0 && j != nums.length && nums[j] != 0) {
//                    forSave = nums[j - 1];
//                    nums[j - 1] = nums[j];
//                    nums[j] = forSave;
//                    j++;
//                } else if (j == nums.length) {
//                    j = 1;
//                    i=1;
//                } else {
//                   i++;
//                   j++;
//                }
//            }
//            return nums;
//        }
//    }


