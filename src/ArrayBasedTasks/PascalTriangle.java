package ArrayBasedTasks;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        System.out.println((generate(5)));

    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) return triangle;
        List<Integer> fistRow = new ArrayList<>();
        fistRow.add(1);
        triangle.add(fistRow);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> currentRow = new ArrayList<>();
            List<Integer> previosRow = triangle.get(rowNum-1);
            currentRow.add(1);

            for (int j = 1; j < rowNum; j++) {
                int sum = previosRow.get(j-1) + previosRow.get(j);
                currentRow.add(sum);
            }
            currentRow.add(1);
            triangle.add(currentRow);
        }
        return triangle;

    }
}
