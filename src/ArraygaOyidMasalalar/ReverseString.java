package ArraygaOyidMasalalar;

import java.util.Arrays;
import java.util.Collections;

public class ReverseString {
    public static void main(String[] args) {

    }
    public static String[] reverseString(String[] s) {
        int left = 0;
        int right = s.length-1;
        while (left < right){
            var temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
        return s;
    }
}
