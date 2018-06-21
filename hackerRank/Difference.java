package hackerRank;

import java.util.*;

public class Difference {
    private static int[] elements;
    static public int maximumDifference;

     public  Difference(int [] elements){
        this.elements = elements;
    }
    static public void computeDifference(){



        Arrays.sort(elements);

        int t = Math.abs(elements[0] - elements[elements.length-1]);
        System.out.println(t);
    }

    public static void main(String[] args) {
        int [] element = {1,5,6};
        elements = element;
        computeDifference();
    }
}
