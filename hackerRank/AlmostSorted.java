package hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.TreeSet;

public class AlmostSorted {


    public static void main(String[] args) {

        int[] arr = {1, 5, 4, 3, 2, 6};
        int[] arr1 = {1, 2,5, 3, 4, 2, 6, 11, 8, 9, 10, 7, 12};
        int[] arr2 = {4, 2};
        int [] arr4 = {1, 7, 2, 4};


        ArrayList array = new ArrayList();
        ArrayList remArray = new ArrayList();
        TreeSet hs = new TreeSet();
        for (int i=0; i< arr4.length; i++){
            int num = arr4[i];
            array.add(num);
            remArray.add(num%3);


            for(int t = 0; t< i ; t++){

                int arrNum = (int) array.get(t);
                int rem = (arrNum + num) % 3;
                if(((arrNum + num) % 3) != 0){
                    hs.add(array.get(t));hs.add(num);}
            }
        }



        return;
    }

}
