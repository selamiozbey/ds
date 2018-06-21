package hackerRank;

import java.util.ArrayList;
import java.util.HashSet;

public class AlmostSorted1 {


    static void almostSorted(int[] arr) {

        ArrayList<int[]> sindexArray = new ArrayList<>();
        ArrayList<int[]> rindexArray = new ArrayList<>();


        for (int i = 0; i < arr.length - 1; i++) {
            int pivotIndex = -1;
            int secondpivot = -1;

            if (arr[i] < arr[i + 1]) {
                continue;
            }
            //if second pivot exist
            if(!sindexArray.isEmpty() || !rindexArray.isEmpty()){
                System.out.println("no");
                return;
            }
            int sindex[] = {-1, -1};
            int rindex[] = {-1, -1};

            pivotIndex = i;

            if (pivotIndex + 2 >= arr.length) {
                sindex[0] = pivotIndex + 1;
                sindex[1] = pivotIndex + 2;
                sindexArray.add(sindex);
                break;
            }

            //find next pivot
            for (int j = pivotIndex + 1; j < arr.length; j++) {
                if (arr[pivotIndex] > arr[j]) {
                    continue;
                } else {
                    secondpivot = j - 1;
                    break;
                }
            }
            if (secondpivot == -1) {
                secondpivot = arr.length - 1; //last element
            }

            boolean isSwap = false;

            if (arr[pivotIndex + 1] < arr[pivotIndex + 2]) {
                if (arr[secondpivot - 1] < arr[secondpivot]) {
                    System.out.println("no");
                    return;
                }
                isSwap = true;
            }

            if (isSwap) {
                for (int t = pivotIndex + 1; t < secondpivot-1; t++) {
                    if (arr[t] < arr[t + 1]) {
                        continue;
                    } else {
                        System.out.println("no");
                        return;
                    }
                }
                sindex[0] = pivotIndex + 1;
                sindex[1] = secondpivot + 1;
                sindexArray.add(sindex);
            } else {
                for (int t = pivotIndex + 1; t < secondpivot; t++) {
                    if (arr[t] > arr[t + 1]) {
                        continue;
                    } else {
                        System.out.println("no");
                        return;
                    }
                }
                rindex[0] = pivotIndex + 1;
                rindex[1] = secondpivot + 1;
                rindexArray.add(rindex);
            }
            i = secondpivot;


        }

        if (sindexArray.size() == 1 && sindexArray.get(0)[0] != -1 && sindexArray.get(0)[1] != -1) {
            System.out.println("yes");
            System.out.println("swap " + sindexArray.get(0)[0] + " " + sindexArray.get(0)[1]);
            return;
        } else if (rindexArray.size() == 1 && rindexArray.get(0)[0] != -1 && rindexArray.get(0)[1] != -1) {
            System.out.println("yes");
            System.out.println("reverse " + rindexArray.get(0)[0] + " " + rindexArray.get(0)[1]);
            return;
        } else {
            System.out.println("no");
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 2};
        int[] arr1 = {1, 5, 4, 3, 2, 6};
        int[] arr2 = {1, 5, 3, 4, 2, 7, 11};//, 8, 9, 10, 7, 12};

        int[] arr3 = {3, 1, 2};
        int[] arr4 = {1, 5, 3, 4, 2, 7, 11, 9, 10, 8, 12};
        int[] arr5 = {1, 5, 4, 3, 2, 6, 7, 8, 15, 9, 10, 16, 17, 18};
        int[] arr6 = {1, 5, 4, 3, 2};
        int[] arr7 = {1, 2};
        almostSorted(arr7);

    }

    /*static void almostSorted47Puanlik(int[] arr) {

        ArrayList<int[]> sindexArray = new ArrayList<>();
        ArrayList<int[]> rindexArray = new ArrayList<>();


        for (int i = 0; i < arr.length - 1; i++) {
            int pivotIndex = -1;
            int secondpivot = -1;

            if (arr[i] < arr[i + 1]) {
                continue;
            }
            //if second pivot exist
            if(!sindexArray.isEmpty() || !rindexArray.isEmpty()){
                System.out.println("no");
                return;
            }
            int sindex[] = {-1, -1};
            int rindex[] = {-1, -1};

            pivotIndex = i;

            if (pivotIndex + 2 >= arr.length) {
                sindex[0] = pivotIndex + 1;
                sindex[1] = pivotIndex + 2;
                sindexArray.add(sindex);
                break;
            }

            //find next pivot
            for (int j = pivotIndex + 1; j < arr.length; j++) {
                if (arr[pivotIndex] > arr[j]) {
                    continue;
                } else {
                    secondpivot = j - 1;
                    break;
                }
            }
            if (secondpivot == -1) {
                secondpivot = arr.length - 1; //last element
            }

            boolean isSwap = false;

            if (arr[pivotIndex + 1] < arr[pivotIndex + 2]) {
                if (arr[secondpivot - 1] < arr[secondpivot]) {
                    System.out.println("no");
                    return;
                }
                isSwap = true;
            }

            if (isSwap) {
                for (int t = pivotIndex + 1; t < secondpivot-1; t++) {
                    if (arr[t] < arr[t + 1]) {
                        continue;
                    } else {
                        System.out.println("no");
                        return;
                    }
                }
                sindex[0] = pivotIndex + 1;
                sindex[1] = secondpivot + 1;
                sindexArray.add(sindex);
            } else {
                for (int t = pivotIndex + 1; t < secondpivot; t++) {
                    if (arr[t] > arr[t + 1]) {
                        continue;
                    } else {
                        System.out.println("no");
                        return;
                    }
                }
                rindex[0] = pivotIndex + 1;
                rindex[1] = secondpivot + 1;
                rindexArray.add(rindex);
            }
            i = secondpivot;


        }

        if (sindexArray.size() == 1 && sindexArray.get(0)[0] != -1 && sindexArray.get(0)[1] != -1) {
            System.out.println("yes");
            System.out.println("swap " + sindexArray.get(0)[0] + " " + sindexArray.get(0)[1]);
            return;
        } else if (rindexArray.size() == 1 && rindexArray.get(0)[0] != -1 && rindexArray.get(0)[1] != -1) {
            System.out.println("yes");
            System.out.println("reverse " + rindexArray.get(0)[0] + " " + rindexArray.get(0)[1]);
            return;
        } else {
            System.out.println("no");
        }
    }*/
}