package hackerRank;

import AVariousDataStructure.ReadMatrixFromSource;

import java.util.*;

public class TwoDArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int drr[][] = new int[6][6];
/*        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }*/
        ReadMatrixFromSource readMatrix = new ReadMatrixFromSource(6, 6);
        int[][] arr = readMatrix.readFromFile("C:\\Users\\alpmer\\Desktop\\hackerRankMatrix.txt");
        hs = hourGlass(arr, 0, 0);

        TreeSet<Integer> ts = new TreeSet<>(hs);
        System.out.println(ts.last());
    }

    static int row = 6, col = 6;
    static List<Integer> hs = new ArrayList<>();
    public static List<Integer> hourGlass(int arr[][], int currentRow, int currentCol) {
        if (currentRow > row / 2) {
            return hs;
        }

        int total = 0;
        for (int i = 0; i < row / 2; i++) {
            total = total + arr[currentRow][i + currentCol];
            total = total + arr[currentRow + 2][i + currentCol];
        }
        total = total + arr[currentRow + 1][currentCol + 1];

        if (currentCol == col / 2) {
            currentCol = 0;
            currentRow++;
        } else {
            currentCol++;
        }
        hs.add(total);
        hourGlass(arr, currentRow, currentCol);

        return hs;

    }
}
