package StringTasks;

public class DetectCapital {

    public static void main(String[] args) {
        String a= "adsfsdfasdfasdfasdfasdf";
        String b = "Qirikki";
        String c = "A";
        String d = "bA";


        System.out.println(detectCapitalUse(a));
        System.out.println(detectCapitalUse(b));
        System.out.println(detectCapitalUse(c));
        System.out.println(detectCapitalUse(d));

    }

    public static boolean detectCapitalUse(String word) {
        int n = word.length();
        String upp = word.toUpperCase();
        String low = word.toLowerCase();
        if (word.equals(upp) || word.equals(low)) {
            return true;
        }
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            for (int i = 1; i < n; i++) {
                if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z') {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
