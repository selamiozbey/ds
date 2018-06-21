package hackerRank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class FindtheRunningMedianWithPriorityQueue {

    public static void main(String[] args) throws FileNotFoundException {
        File fl = new File("D:\\SOLeetCode\\data\\findTheRunningMedianTest.txt");
        Scanner in = new Scanner(fl);
        int n = in.nextInt();
        int[] a = new int[n];
        //int[] arr = {12, 4, 5, 3, 8, 7};

        PriorityQueue<Integer> pq = new PriorityQueue<Integer> (
                new Comparator<Integer>() {
                    public int compare(Integer a, Integer b) {
                        return a.compareTo(b);
                    }
                }
        );
        for (int a_i = 0; a_i < n; a_i++) {
            Integer i = in.nextInt();

           pq.add(i);
           // System.out.println(getMedian());
        }


    }

    private static boolean getMedian() {
        return false;
    }



}
