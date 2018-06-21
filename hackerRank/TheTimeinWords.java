package hackerRank;

import java.util.HashMap;

public class TheTimeinWords {
    static String timeInWords(int h, int m) {
        // Complete this function
        String result = "";
        HashMap timeMap = new HashMap();
        timeMap.put("0", "o' clock");
        timeMap.put("1", "one minute past");
        timeMap.put("15", "quarter past");
        timeMap.put("30", "half past");
        timeMap.put("45", "quarter to");
        timeMap.put("59", "one minute to");

        String minute;
        if (m >= 0 && m < 31) {
            minute = (String) timeMap.get(String.valueOf(m));
            if(minute.contains((CharSequence) timeMap.get("0"))){
                result = numberToWord(h) + " " +minute;
            }
            else if (minute == null) {
                result = numberToWord(m) + " minutes past " + numberToWord(h);
            } else if (minute != null) {
                result = minute + " " + numberToWord(h);
            }
        }
        if (m >= 31 && m < 60) {
            minute = (String) timeMap.get(String.valueOf(m));

            if (minute != null) {
                result = minute + " " + numberToWord(h+1);
            } else {
                minute = (timeMap.get(m) == null) ? numberToWord(60 - m) : (String) timeMap.get(m);
                result = minute + " minutes to " + numberToWord(h + 1);
            }
        }


        return result;

    }

    static String numberToWord(int number) {
        String result = "";
        HashMap hm = new HashMap();
        hm.put(1, "one");
        hm.put(2, "two");
        hm.put(3, "three");
        hm.put(4, "four");
        hm.put(5, "five");
        hm.put(6, "six");
        hm.put(7, "seven");
        hm.put(8, "eight");
        hm.put(9, "nine");
        hm.put(10, "ten");
        hm.put(11, "eleven");
        hm.put(12, "twelve");
        hm.put(13, "thirteen");
        hm.put(14, "fourteen");
        hm.put(15, "fifteen");
        hm.put(16, "sixteen");
        hm.put(17, "seventeen");
        hm.put(18, "eighteen");
        hm.put(19, "nineteen");
        hm.put(20, "twenty");

        result = (String) hm.get(number);
        if (result == null) {
            if (number > 20 && number < 29)
                result = numberToWord(20) + " " + numberToWord(number - 20);
        }

        return result;
    }

    public static void main(String[] args) {

        int h = 3;
        int m = 59;
        if (h < 1 || h >= 12 || m < 0 || m >= 60) return;

        String result = timeInWords(h, m);
        System.out.println(result);

    }

}
