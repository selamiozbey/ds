package hackerRank;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class NonDivisibleSubset {
    static int nonDivisibleSubset(int k, int[] S) {

        int remainderNum[] = new int[k];

        for (int i = 0; i < S.length; i++)
            remainderNum[S[i] % k]++;

        if (k % 2 == 0)
            remainderNum[k/2] = Math.min(remainderNum[k/2], 1);

        int res = Math.min(remainderNum[0], 1);

       for (int i = 1; i <= k/2; i++)
            res += Math.max(remainderNum[i], remainderNum[k-i]);

        return res;
    }



    public static void main(String[] args) throws IOException {
        File fl = new File("D:\\SOLeetCode\\data\\NonDivisibleSubsetTest.txt");

        Scanner scanner = new Scanner(fl);


        TreeSet hs = new TreeSet();
        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0].trim());

        int k = Integer.parseInt(nk[1].trim());

        int[] S = new int[n];
        int[] remainder = new int[n];

        String[] SItems = scanner.nextLine().split(" ");
        ArrayList arr = new ArrayList();
        ArrayList remArray = new ArrayList();
        for (int SItr = 0; SItr < n; SItr++) {
            int SItem = Integer.parseInt(SItems[SItr].trim());
            S[SItr] = SItem;
        }

        //subsetPairNotDivisibleByK(S,n,k);


        int result =nonDivisibleSubset(k, S);


        //System.out.println(hs.size());


    }

    static int subsetPairNotDivisibleByK(int arr[],
                                         int N, int K)
    {

        HashSet hs = new HashSet();


        // Array for storing frequency of modulo
        // values
        int f[] = new int[K];
        //Arrays.fill(f, 0);

        // Fill frequency array with values modulo K
        for (int i = 0; i < N; i++)
            f[arr[i] % K]++;

        // if K is even, then update f[K/2]
        if (K % 2 == 0)
            f[K/2] = Math.min(f[K/2], 1);

        // Initialize result by minimum of 1 or
        // count of numbers giving remainder 0
        int res = Math.min(f[0], 1);

        // Choose maximum of count of numbers
        // giving remainder i or K-i
        for (int i = 1; i <= K/2; i++)
            res += Math.max(f[i], f[K-i]);

        return res;
    }
}
