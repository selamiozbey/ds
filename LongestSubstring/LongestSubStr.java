package LongestSubstring;

import java.util.HashSet;

public class LongestSubStr {
    public int lengthOfLongestSubstring(String s) { 
        HashSet<Character> hashSet = new HashSet<>();
        for (char c:s.toCharArray()) {
            hashSet.add(new Character(c));
        }


        return hashSet.size();
    }
}
