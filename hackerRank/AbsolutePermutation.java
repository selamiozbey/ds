package hackerRank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AbsolutePermutation {
    static int[] absolutePermutation(int n, int k) {

        int[] arr = new int[n];
        ArrayList nArr = new ArrayList();
        nArr.add(0);
        for (int i = 1; i <= n; i++) {
            nArr.add(i);
        }
        if (k==0){
            for (int i = 1; i <= n; i++) {
                arr[i-1] = i;
            }
        }
        int num = 1;
        for (int i = 1; i <= n; i++) {
            int find;
            if(i> k*num)
            {
                num++;
            }
            if(num %2 == 0){
                find = Math.abs(i - k);
            } else
                find = k + i;;

            if (!nArr.contains(find))
                return new int[]{-1};
            else {
                arr[i - 1] = find;
                nArr.remove(nArr.indexOf(find));
            }
        }
        if (arr.length != n)
            return new int[]{-1};

        return arr;
    }

    public static void main(String[] args) throws FileNotFoundException {
        File fl = new File("D:\\SOLeetCode\\data\\AbsolutePermutationsTest.txt");
        Scanner in = new Scanner(fl);
        int t = 1;//in.nextInt();


        for (int tItr = 0; tItr < t; tItr++) {
            //String f = in.next();
            //String[] nk = in.nextLine().split(" ");

            int n =4;// Integer.parseInt(in.next());

            int k = 2;//Integer.parseInt(in.next());
            int[] result = absolutePermutation(n, k);
            for (int i = 0; i < n; i++) {
                System.out.println(result[i] + " ");
            }

        }


    }


}
