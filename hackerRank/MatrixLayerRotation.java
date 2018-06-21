package hackerRank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MatrixLayerRotation {

    public void matrixRotation(int[][] matrix) {
        // Complete this function

        int row = matrix[0][0];
        int col = matrix[0][1];
        int rot = matrix[0][2];

        if( Math.min(row,col) %2 !=0)
            return;

        List<LinkedList> lofLL = new ArrayList<>();


    }

    static List<LinkedList> matrixToListOfLinkedList(int[][] matrix){
        List<LinkedList> lofLL = new ArrayList<>();
        int row = matrix[0][0];
        int col = matrix[0][1];


        return lofLL;
    }
}
