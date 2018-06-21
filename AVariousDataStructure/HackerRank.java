package AVariousDataStructure;

import java.util.ArrayList;

public class HackerRank {
    public static void main(String[] args) {
        int [] a = new int[]{1,2,3};
        ArrayList<Integer> arrayA = new ArrayList<>();

        int [] b = new int[]{1,2,3};
        ArrayList<Integer> arrayB = new ArrayList<>();

        arrayA.add(a[0]);
        arrayA.add(a[1]);
        arrayA.add(a[2]);

        arrayB.add(b[0]);
        arrayB.add(b[1]);
        arrayB.add(b[2]);

        int []resultpA = new int[]{0,0};

        resultpA[0]++;


        int pA = 0, pB=0;

        for(int i =0; i<arrayA.size(); i++){
            if (arrayA.get(i) < 1){// || (int)arrayA.get(i)>100 || (int)arrayB.get(i)<1 ||(int)arrayB.get(i)>100) {
                System.out.println(pA + " " + pB);
                return;
            }
            Integer o = arrayA.get(1);
            if((int)arrayA.get(i) > (int)arrayB.get(i)) pA++;
            if((int)arrayA.get(i) < (int)arrayB.get(i)) pB++;


        }

        System.out.println(pA + " " + pB);







    }

    public void test(){
        // create an empty array list with an initial capacity
        ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

        // use add() method to add elements in the list
        arrlist.add(15);
        arrlist.add(22);
        arrlist.add(30);
        arrlist.add(40);

        // let us print all the elements available in list
        for (Integer number : arrlist) {
            System.out.println("Number = " + number);
        }

        // retrieves element at 4th postion
        int retval = arrlist.get(3);
        System.out.println("Retrieved element is = " + retval);
    }

}
