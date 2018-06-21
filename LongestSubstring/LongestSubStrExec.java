package LongestSubstring;

import net.Util.TestData;

public class LongestSubStrExec {

    public static void main(String[] args) {
        net.LongestSubstring.LongestSubStr func = new net.LongestSubstring.LongestSubStr();
        int len = func.lengthOfLongestSubstring(TestData.longestsubstr);
        System.out.println("The lenght of the unrepeatable array is = " + len);
    }
}
