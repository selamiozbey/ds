package hackerRank;

import java.util.*;

public class MakingAnagrams {

    public static int numberNeeded(String first, String second) {
        int result = 0;
        HashMap map = new HashMap();
        int len = first.length() >= second.length() ? first.length() : second.length();

        for (int i = 0; i < len; i++) {
            if (i < first.length()) {
                if (map.containsKey(first.charAt(i))) {
                    int t = (int) map.get(first.charAt(i)) + 1;
                    map.replace(first.charAt(i), t);
                } else {
                    map.put(first.charAt(i), 1);
                }
            }
            if (i < second.length()) {
                if (map.containsKey(second.charAt(i))) {
                    int t = (int) map.get(second.charAt(i)) - 1;
                    map.replace(second.charAt(i), t);
                } else {
                    map.put(second.charAt(i), -1);
                }
            }
        }
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            result = result + Math.abs((int) pair.getValue());
            it.remove();
        }
        return result;
    }

    public static void main(String[] args) {
        String a = "cdedhffghdflkghfghdfkhglkhdfghdljgkhdlgh";
        String b = "abckjgkjdfhgdhglkdhlhgdljhdgklhlgdlkjhgdlkhg";
        System.out.println(numberNeeded(a, b));

    }


}
