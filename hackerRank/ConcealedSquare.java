package hackerRank;

import sun.misc.GC;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class ConcealedSquare {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = 3;//scan.nextInt(); // length of the set

        target = new StringBuilder();

/*        for (int i = 0; i < n; i++) {
            arr.add(scan.next());
        }*/


        target = new StringBuilder("68435443593");
        String s =                 "999999999999999";
        end = new BigInteger(s.substring(0, target.length() - 1));
        padd = new StringBuilder();
        for (int i = 0; i < target.length() - 1; i++) {
            padd.append("0");

        }

        for (long i=0; i<Long.valueOf(end.toString());i++) {
            boolean st = calculate(new StringBuilder(String.valueOf(i)));
            if (st)
                break;
        }

    }

    static BigInteger end;
    static StringBuilder target;
    static StringBuilder padd;

    public static boolean calculate(StringBuilder sb_orjin) {
/*        if (sb_orjin.toString().equals("9998")){
            int g = 3;
        }*/
        if(new BigInteger(sb_orjin.toString()).subtract(end).equals(new BigInteger("1")))
            return true;
        sb_orjin = new StringBuilder(padd.substring(0, padd.length() - sb_orjin.length()) + sb_orjin);

        StringBuilder sb_TempTarget = new StringBuilder(target.substring(0, 1));
        if (new BigInteger(sb_orjin.toString()).longValue() > end.longValue())
            return false;

        for (int i = 0; i < sb_orjin.length(); i++) {
            sb_TempTarget.append(sb_orjin.charAt(i));
            sb_TempTarget.append(target.charAt(i + 1));
        }


        BigInteger tempBigInt = new BigInteger(sb_TempTarget.toString());
        long root = (long) Math.sqrt(tempBigInt.longValue());
        if (tempBigInt.doubleValue() == Math.pow(root, 2)) {
            /* BigInteger rootBi = new BigInteger(String.valueOf(root));
        if (tempBigInt == rootBi.multiply(rootBi)) {*/
            //BigInteger bb = new BigInteger(sb_orjin.toString()).add(new BigInteger("1"));
            //calculate(new StringBuilder(bb.toString()));

            System.out.println(root);
            return true;
        }


        return false;

    }


}
