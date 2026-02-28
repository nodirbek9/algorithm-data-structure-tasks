package StringTasks;

import java.util.Arrays;
import java.util.Objects;

public class PrefixLength {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));

    }
    public static String longestCommonPrefix(String[] strs) {
        String res = "";
        boolean b = true;
        Object[] min = Arrays.stream(strs).sorted().toArray();
        if (strs.length>0){
        String a =min[0].toString();
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < strs.length; j++) {
            if (strs[j].charAt(i)!=a.charAt(i)){
                b = false;
                return res;
            }
            }
            if (b){
                res += a.charAt(i);
            }else {
                break;
            }
        }}
        return res;
    }
}
