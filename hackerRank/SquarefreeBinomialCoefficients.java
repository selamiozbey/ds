package hackerRank;

import org.w3c.dom.ls.LSException;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class SquarefreeBinomialCoefficients {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        ArrayList arr = new ArrayList();

        arr.add(1L);
        listOfList.add(arr);
        func(arr);
        BigInteger modulus = new BigInteger("1000000007");
        total = total.mod(modulus);

        System.out.println(total);
    }

    static BigInteger total = new BigInteger("1");
    static int row = 8;
    static ArrayList<ArrayList> listOfList = new ArrayList<>();
    static ArrayList lst = new ArrayList();


    public static void func(ArrayList arr) {
        ArrayList tempArr = new ArrayList();

        if (arr.size() == row)
            return;
        tempArr.add(1);
        for (int i = 1; i < arr.size() + 1; i++) {
            if (arr.get(i - 1) != null && (i + 1) <= arr.size()) {
                long sum = Integer.toUnsignedLong((int) arr.get(i - 1)) + Integer.toUnsignedLong((int) arr.get(i));
                tempArr.add(sum);
                if (!lst.contains(sum) && testNumber(sum)) {
                    System.out.println(sum);
                    total = total.add(new BigInteger(String.valueOf(sum)));
                    lst.add(sum);
                }

            }
        }
        tempArr.add(1);
        listOfList.add(tempArr);
        func(tempArr);
    }

    static TreeSet<Long> primeset = new TreeSet();

    static boolean testNumber(long number) {
        int root = (int) Math.sqrt(number);
        if (primeset.isEmpty()) isPrime(number);
        else if (root > (long) primeset.last()) {
            for (long i = (long) primeset.last(); i < root; i++) {
                if (isPrime(i) && !primeset.contains(i)) {
                    primeset.add(i);

                }
            }
        }
        for (long num : primeset) {
            if (number % Math.pow(num, 2) == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrime(long i) {
        for (int t = 2; t <= i / 2; t++) {
            if (i % t == 0) {
                return false;
            }
        }
        primeset.add(i);
        return true;
    }
}
