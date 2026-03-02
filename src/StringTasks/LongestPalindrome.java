package StringTasks;

public class LongestPalindrome {
    public static void main(String[] args) {
        String a = "aabbff";
        System.out.println(longestPalindrome("cbbd"));

    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            String len1 = checkPalindrome(s, i, i);
            String len2 = checkPalindrome(s, i, i + 1);

            if (answer.length() < len1.length()) {
                answer = len1;
            }
            if (answer.length() < len2.length()) {
                answer = len2;
            }
        }

        return answer;
    }
    public static String checkPalindrome(String s, int i, int j){
        while (i>=0 && j<s.length() && s.charAt(i) == s.charAt(j)){
            i--;
            j++;
        }
        return s.substring(i+1, j);
    }
}
