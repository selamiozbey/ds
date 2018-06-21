package hackerRank;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class MaximumPalindromes {

    static String str;

    static void initialize(String s) {
        // This function is called once before all queries.
        str = s;
    }

    static int answerQuery(int l, int r) {
        int len = 0;
        ArrayList<String> middleCharArray = new ArrayList<>();
        ArrayList<Long> sameCharFactArray = new ArrayList<>();
        Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
        String subStr = str.substring(l-1, r);

        for (char c : subStr.toCharArray()) {
            String keyStr = new String(String.valueOf(c));
            if (ht.containsKey(keyStr)) {
                int value = ht.get(keyStr) + 1;
                ht.replace(keyStr, value);
            } else {
                ht.put(keyStr, 1);
            }
        }

        Set<String> keys = ht.keySet();
        Iterator<String> itr = keys.iterator();
        while (itr.hasNext()) {
            int itrNumber = 0;
            String cstr = itr.next();
            int value = ht.get(cstr);
            if (value % 2 == 0)
                itrNumber = value / 2;
            else {
                middleCharArray.add(cstr);
                itrNumber = value >= 3 ? ((value - 1) / 2) : 0;
            }
            if (itrNumber > 0) {
                long fact = getFactorial(itrNumber);
                sameCharFactArray.add(fact);
                len = len + itrNumber;
            }
        }

        int permutation = calculatePermutation(getFactorial(len), sameCharFactArray);
        if(permutation == 1)
        {
            if(!middleCharArray.isEmpty())
                permutation = middleCharArray.size();
        }
        else {
            permutation = permutation + middleCharArray.size();
        }
        len = middleCharArray.isEmpty() ? len*2 : (len*2) + 1;

        System.out.println("maximum length palindromes number = " + permutation);
        System.out.println("maximum length palindromes  = " + len);
        permutation = (permutation < 1000000007) ? permutation: permutation % 1000000007;
        return permutation;
    }

    static long getFactorial(int i) {
        if (i == 0)
            return 1;
        else
            return(i * getFactorial(i-1));

    }

    static int calculatePermutation(long nominator, ArrayList<Long> denominatorList) {

        long totalDenom = 1;
        for (long l: denominatorList) {
            totalDenom = totalDenom*l;
        }
        int result  = (int) (nominator/totalDenom);
        return result;

    }


    public static void main(String[] args) {
        String s = "week";
        initialize(s);
        int q = 2;
        if(q < 1 || q > 100000 || s.length() < 1 || s.length() > 100000)
            return;

        for(int a0 = 0; a0 < q; a0++){
            int l = 2;
            int r = 3;
            int result = answerQuery(l, r);
            System.out.println(result);
        }
    }
}
