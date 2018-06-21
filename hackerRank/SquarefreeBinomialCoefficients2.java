package hackerRank;

import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

import java.math.BigInteger;
import java.util.*;

public class SquarefreeBinomialCoefficients2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
/*        Scanner scanner = new Scanner(System.in);
        int queryNum = scanner.nextInt();
        int[] rowNum = new int[queryNum];

        for (int i = 0; i < queryNum; i++) {
            int t = scanner.nextInt();
            rowNum[i] = t;
        }
    }*/

        int rowNum = 8;
        ArrayList<BigInteger> longList = new ArrayList<>();
        longList.add(new BigInteger("1"));
        pascalTriangle.add(longList);
        for (int i = 0; i < rowNum; i++) {
            func(pascalTriangle);
        }

    }

    public static ArrayList<ArrayList<BigInteger>> pascalTriangle = new ArrayList<>();
    public static BigInteger total = new BigInteger("1");
    static ArrayList<BigInteger> lst = new ArrayList();


    public static void func(ArrayList<ArrayList<BigInteger>> longList) {
        ArrayList<BigInteger> tempList = new ArrayList<>();
        tempList.add(new BigInteger("1"));
        int lastArraySize = longList.get(longList.size() - 1).size();
        ArrayList<BigInteger> lastArray = longList.get(longList.size() - 1);

        for (int i = 1; i < lastArraySize; i++) {
            if (lastArray.get(i - 1) != null && lastArray.get(i) != null && (i + 1) <= lastArraySize + 1) {
                BigInteger sum = new BigInteger("0");
                sum = sum.add(lastArray.get(i));
                sum = sum.add(lastArray.get(i - 1));
                tempList.add(sum);
                primeset = (TreeSet<Long>) primeset.descendingSet();
                if (!lst.contains(sum) && testNumber(sum)) {
                    System.out.println(sum);
                    total = total.add(new BigInteger(String.valueOf(sum)));
                    lst.add(sum);
                }
            }


        }
        tempList.add(new BigInteger("1"));
        pascalTriangle.add(tempList);

        int [] elements = new int[0];
        List list = Arrays.asList(elements);
        Set< Integer > set = new TreeSet< Integer >(list);

    }


    private static boolean testNumber(BigInteger number) {
        BigInteger d = number.divide(new BigInteger("2"));
        BigInteger root = sqrt(d);
        if (primeset.isEmpty()) isPrime(root.longValue());
        else if (root.longValue() > (long) primeset.first()) {
            for (long i = (long) primeset.last(); i < root.longValue(); i++) {
                if (isPrime(i) && !primeset.contains(i)) {
                    primeset.add(i);

                }
            }
        }
        for (long num : primeset) {
            long sqr = (long) Math.pow(num,2);
            BigInteger mod = number.mod(new BigInteger(String.valueOf(sqr)));
            if (mod.equals(0)) {
                return false;
            }
        }
        return true;


    }
    public static BigInteger sqrt(BigInteger bi) {
        BigInteger div = BigInteger.ZERO.setBit(bi.bitLength()/2);
        BigInteger div2 = div;
         for(;;) {
            BigInteger root = div.add(bi.divide(div)).shiftRight(1);
            if (root.equals(div) || root.equals(div2))
                return root;
            div2 = div;
            div = root;
        }
    }
    static TreeSet<Long> primeset = new TreeSet();

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
