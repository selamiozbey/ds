package AVariousDataStructure;

import java.util.*;

public class binarycalculate {




    public static int hammingWeight(int n) {
        int bits = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }

    public static void main(String[] args) {/*
        int t = hammingWeight(5);//                101
        int g = bitCount(5);
        System.out.println(g);

        System.out.println("Binary = " + Integer.toBinaryString(5));*/


        int[] element = new int[]{3, 1, 2, 3};
        int[] element1 = new int[]{5, 5, 3, 7, 10,14};
        if (element[0] <1  || element[0] > 100000) return;
        rearrange(element1);


    }
    public static int bitCount(int i) {
        i = i - ((i >>> 1) & 0x55555555);
        i = (i & 0x33333333) + ((i >>> 2) & 0x33333333);
        i = (i + (i >>> 4)) & 0x0f0f0f0f;
        i = i + (i >>> 8);
        i = i + (i >>> 16);
        return i & 0x3f;
    }

    static int[] rearrange(int[] elements) {
        HashMap<Integer, ArrayList> hm = new HashMap();


        for (int i = 1; i <= elements[0]; i++) {

            int bitCount = bitCount(elements[i]);
            if (hm.containsKey(bitCount)) {
                ArrayList bitCountList = hm.get(bitCount);
                if(bitCountList.contains(elements[i])) continue;

                bitCountList.add(Integer.valueOf(elements[i]));
                Collections.sort(bitCountList);
                hm.put(bitCount, bitCountList);
            } else {
                ArrayList temp = new ArrayList();
                temp.add(elements[i]);
                hm.put(bitCount, temp);
            }
        }

        TreeMap<Integer, ArrayList> sorted = new TreeMap<>();
        sorted.putAll(hm);

        Set entrySet = hm.entrySet();

        ArrayList<Integer> numberArray = new ArrayList();
        Iterator it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry me = (Map.Entry) it.next();
            ArrayList<Integer> temp = (ArrayList) me.getValue();

            for (int i : temp){
                numberArray.add(i);

            }

        }
        return numberArray.stream().mapToInt(i -> i).toArray();


    }


}
