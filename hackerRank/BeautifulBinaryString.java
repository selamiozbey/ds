package hackerRank;

import java.util.Arrays;
import java.util.List;

public class BeautifulBinaryString {
    final static String str = "010";
    final static String strNew = "011";
    static int beautifulBinaryString(String b) {
        // Complete this function
        int count = 0;
        char[] chars = b.toCharArray();

        for (int i=0; i< b.length();i++){
            if(chars[i]=='0'){
                continue;
            }
            if(i+1>=b.length())continue;
            if(chars[i-1]=='0' && chars[i+1] == '0')
            {
                chars[i+1] = '1';
                count++;
                i++;
            }

        }
        return count;
    }

    static int count = 0;

    static int beautifulBinaryString1(char[] chars, int startIndex) {
        // Complete this function
        if(startIndex >= chars.length -2)
            return 0;
        if (chars[startIndex] == '0' && chars[startIndex + 1] == '1' && chars[startIndex+2]=='0') {
            count++;
            startIndex+=3;
        }else {
            startIndex++;
        }
         beautifulBinaryString1(chars,startIndex);
        return count;
    }
    public static void main(String[] args) {

        String b = "01001010100101110110100101";
        int result = beautifulBinaryString1(b.toCharArray(),0);
        //int result = beautifulBinaryString(b);
        System.out.println(result);

    }
}
