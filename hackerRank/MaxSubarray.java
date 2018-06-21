package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class MaxSubarray {

    public static void main(String[] args) {

        int[] arr = {2, -1, 2, 3, 4, -5};
        //int[] arr = {-1, -2, -3, -4, -5, -6};
        int[] result = maxSubarray1(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


    }


    public static int[] maxSubarray1(int [] arr)
    {
        int currentMax=arr[0];
        int [] ret = {arr[0], arr[0]};

        for(int i = 1; i < arr.length; i++) {
            currentMax = Math.max(arr[i],currentMax+arr[i]);
            ret[0] = Math.max(ret[0],currentMax);
            ret[1] = Math.max(Math.max(arr[i],ret[1]),ret[1]+arr[i]);
        }

        return ret;
    }

}
