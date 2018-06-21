package hackerRank;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

class countSetBits
{
    /* Function to get no of set
    bits in binary representation
    of positive integer n */
    static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0)
        {
            count += n & 1;
            n >>= 1;
        }
        return count;
    }

    // driver program
    public static void main(String args[])
    {
        /*int d = 64;
        System.out.println(countSetBits(d));*/




        //stringrefilling();

        ExtraLongFactorials(50);
        System.out.println(bigInteger.toString());

    }

    private static void stringrefilling() {
        int n = 9;
        String s = String.format("%0" + n + "d", 0);


        for (int i=1; i<=n; i++){
            char[] chars = new char[n];
            Arrays.fill(chars, ' ');
            Arrays.fill(chars,n-i,n,'#');
            String text = new String(chars);

          System.out.println(text);


        }
    }

    private static void minmaxAddition(int [] arr) {
        int min=arr[0], max=arr[0], total=0;

        for (int i = 0; i<arr.length; i++)
        {
            total = total + arr[i];
            max = arr[i] > max ? arr[i] : max;
            min = arr[i] < min ? arr[i] : min;

        }
        System.out.println((total-min) + " " + (total-max));
    }

    private static  BigInteger bigInteger = new BigInteger("1");
    private static void ExtraLongFactorials(int n){
        if(n==1)
            return ;
        bigInteger = bigInteger.multiply(BigInteger.valueOf(n));
        ExtraLongFactorials(n-1);
    }
}
