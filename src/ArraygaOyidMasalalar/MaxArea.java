package ArraygaOyidMasalalar;

public class MaxArea {
    public static void main(String[] args) {
        int[] arr = new int[]{2,0};
        System.out.println(maxArea(arr));

    }
    public static int maxArea(int[] height) {
        int i = 0, j = height.length-1;
        int result = 0;
        while (i != j) {
            int dist = (j-i);
            if (height[i] <= height[j] && height[i] != 0 && height[j] != 0) {
                if (dist*height[i] > result) {
                    result = height[i] * dist;
                }
                i++;
            } else if (height[i] >= height[j] && height[i] != 0 && height[j] != 0) {
                if (dist * height[j] > result) {
                    result = height[j] * dist;
                }
                j--;
            }else if (height[i] == 0) {
                i++;
            } else {
                j--;
            }
        }
        return result;
    }
}
