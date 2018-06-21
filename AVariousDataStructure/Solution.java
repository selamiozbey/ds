package AVariousDataStructure;

import java.io.*;
import java.util.*;

public class Solution {

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
        /*
         * Write your code here.
         */
        int sz = a[0][0];
        int d1 = 0, d2=0;
        for(int i = 1 ; i< sz+1; i++){
            //1. diagonal
            int a1=a[i][i],a2=a[i][sz+1-i];

            if(a1 > -100 && a1 < 100)
                d1= d1 + a1;
            //2. diagonal
            if(a2 > -100 && a2 < 100)
                d2= d2 + a2;

        }
        return Math.abs(d1-d2);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String str = new String("3 11 2 4 4 5 6  10 8 -12");
        String [] strArray = str.split(" ");







        //int n = Integer.parseInt(scan.nextLine().trim());

        int[][] a = new int[4][4];
        a[0][0] = 3;
        a[1][1] = 11;a[1][2] = 2;a[1][3] = 4;
        a[2][1] = 4;a[2][2] = 5;a[2][3] = 6;
        a[3][1] = 10;a[3][2] = 8;a[3][3] = -12;



        int result = diagonalDifference(a);

        System.out.println(result);
    }
}
