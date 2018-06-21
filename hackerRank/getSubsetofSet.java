package hackerRank;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

public class getSubsetofSet {
    public static void main(String args[]) throws FileNotFoundException {
        //int arrLen = 6;
        //int[] packets = {51, 36, 33, 97, 48, 22 };
        //int[] packets = {10, 100,300, 200,1000, 20,30};
        //int[] packets = {1,2,3,4,10,20,30,40,100,200};
/*        int[] packets = {7165, 7432, 7454, 7539, 7762, 7775, 7897, 7991};
        int K =8;*/
        File fl = new File("D:\\SOLeetCode\\data\\AngryChildrenTest.txt");

        Scanner in = new Scanner(fl);
        int arrLen = in.nextInt();
        int K = in.nextInt();
        int[] packets = new int[arrLen];
        for(int packets_i = 0; packets_i < arrLen; packets_i++){
            packets[packets_i] = in.nextInt();
        }
        angryChildren(K,packets);


    }

    static long angryChildren(int n, int[] packets) {
        ArrayList<Integer> mainset = toArrayList(packets);

        ArrayList<List> mainSubSet = getSubset(packets.length,mainset,n);
        ArrayList<List> subsetofSet = new ArrayList();
        for (List l : mainSubSet){
            ArrayList<List> ss = getSubset(n,l, 2);
            subsetofSet.add(ss);

        }

        long totalPrice = 999999999L;
        for(List l : subsetofSet){
            int temp = 0;
            for(Object i : l){
                temp = temp + Math.abs((Integer)((ArrayList)i).get(0) - (Integer)((ArrayList)i).get(1));
            }
            totalPrice = temp < totalPrice ? temp : totalPrice;
        }

        System.out.println("total price = " + totalPrice);
        return totalPrice;
    }
     static ArrayList toArrayList(int [] array){
        ArrayList arrayList = new ArrayList();
        for (int i : array){
            arrayList.add(i);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

     static ArrayList<List> getSubset(int arrLen,List arrayList, int subsetsize) {
        long[] binary = new long[(int) Math.pow(2, arrLen)];
        ArrayList<List> subset = new ArrayList<>();

        for (int i = 0; i < Math.pow(2, arrLen); i++)
        {
            int number = i, countOnes=0;
            int bin=0, b = 1;

            while (number !=0){
                if(number % 2 == 1){
                    countOnes++;
                    bin = bin + b;
                }
                number /= 2;
                b = b*10;


            }
            binary[i] = bin;

            ArrayList arr = new ArrayList();
            if(countOnes == subsetsize){
                for (int j = 0; j< arrLen; j++){
                    if(binary[i] % 10 == 1){
                        arr.add(arrayList.get(j));
                        System.out.print(arrayList.get(j) + " ");
                    }
                    binary[i] /= 10;
                    if (binary[i] == 0){
                        break;
                    }
                }
                System.out.println();
            }
            if (!arr.isEmpty())
                subset.add(arr);
        }
        return subset;
    }


}
