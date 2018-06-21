package AVariousDataStructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadMatrixFromSource {
    int row, col;
    public ReadMatrixFromSource(int row, int col){
        this.row = row;
        this.col = col;
    }
    public ReadMatrixFromSource(){

    }
    public  int [][] readFromFile(String fileNameWithPath){

        int arr[][] = new int[row][col];
        File file = new File(fileNameWithPath);
        ArrayList<String[]> stringArrayList = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            int currRow = 0, currCol = 0;
            while (sc.hasNextLine()) {
               arr[currRow][currCol] = Integer.valueOf(sc.next());
               currCol = currCol >=col-1 ? 0 : ++currCol;
               currRow = currCol == 0 ? ++currRow : currRow;
            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return arr;
    }

    public List readListFromFile(String fileNameWithPath){
        ArrayList arr = new ArrayList();
        File file = new File(fileNameWithPath);
        ArrayList<String[]> stringArrayList = new ArrayList<>();
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                arr.add(Integer.valueOf(sc.next()));

            }
            sc.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return arr;
    }
}
