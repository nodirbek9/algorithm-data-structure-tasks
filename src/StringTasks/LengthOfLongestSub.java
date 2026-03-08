package StringTasks;

public class LengthOfLongestSub {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(""));
    }

    public static int lengthOfLongestSubstring(String s) {
        int maxlen = 0;
        if (s.length()>0){
        StringBuilder sub = new StringBuilder();

        String letter = "";
            for (int i = 0; i < s.length(); i++) {
                letter += s.charAt(i);
                if (sub.toString().contains(letter)){
                    sub = new StringBuilder();
                }
                if (!sub.toString().contains(letter)) {
                    sub.append(letter);
                }
                if (maxlen < sub.length()){
                    maxlen = sub.length();
                }
                letter = "";
            }
        }
        return maxlen;
    }
}
