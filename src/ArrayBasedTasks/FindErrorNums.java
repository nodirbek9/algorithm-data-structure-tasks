package ArrayBasedTasks;

import java.util.Arrays;

public class FindErrorNums {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1,2,2,3})));

    }
    public static int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] count = new int[n + 1]; // считаем вхождения

        // Считаем, сколько раз встречается каждое число
        for (int num : nums) {
            count[num]++;
        }

        int duplicate = 0;
        int missing = 0;

        // Ищем дубликат (count = 2) и пропущенное (count = 0)
        for (int i = 1; i <= n; i++) {
            if (count[i] == 2) duplicate = i;
            if (count[i] == 0) missing = i;
        }

        return new int[]{duplicate, missing};
    }
}
