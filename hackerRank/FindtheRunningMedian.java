package hackerRank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FindtheRunningMedian {

    public static void main(String[] args) throws FileNotFoundException {
        File fl = new File("D:\\SOLeetCode\\data\\findTheRunningMedianTest.txt");
        Scanner in = new Scanner(fl);
        int n = in.nextInt();
        int[] a = new int[n];
        //int[] arr = {12, 4, 5, 3, 8, 7};

        NumberArrayMedianFinder medianFinder = new NumberArrayMedianFinder();
        for (int a_i = 0; a_i < n; a_i++) {
            Integer i = in.nextInt();

            medianFinder.addElement(i);
            System.out.println(medianFinder.getMedian());
        }


    }


    class Calculator{
        public int power(int a, int b) throws Exception {
            if(a < 0 || b < 0){
                throw new Exception("n and p should be non-negative");
            }
            return (int)Math.pow(a,b);
        }
    }

    static class NumberArrayMedianFinder {
        ArrayList<Integer> arr = new ArrayList<>();

        LinkedList<Character> stck = new LinkedList<>();

        public void addElement(int element) {

            int minIndex = 0;
            int maxIndex = arr.size();
            while (minIndex < maxIndex) {
                int medianIndex = (minIndex + maxIndex) / 2;

                if (element <= arr.get(medianIndex)) {
                    maxIndex = medianIndex;
                    if(maxIndex > 0 && element >= arr.get(medianIndex-1))
                        minIndex = medianIndex;
                } else {

                    minIndex = medianIndex + 1;
                    if(medianIndex+1 < arr.size() && element < arr.get(medianIndex+1))
                        maxIndex = medianIndex+1;


                }
            }
            arr.add(minIndex, element);
        }


        public double getMedian() {
            if (arr.isEmpty()) {
                return 0;
            }
            if (arr.size() % 2 == 1) {
                return (double)arr.get((arr.size()) / 2);
            } else {
                return ((double)arr.get(arr.size() / 2 - 1) + (double)arr.get(arr.size() / 2)) / 2;
            }
        }
    }
}
