package AVariousDataStructure;

import java.util.Scanner;

public class BitwiseAND {
    public static void main(String[] args) {

        //Scanner scan = new Scanner(System.in);

        int t = 1;//scan.nextInt();
        for (int i = 0; i < t; i++) {
            int n = 8;//scan.nextInt();
            int k = 5;//scan.nextInt();
            int max = 0;
            for (int j=1;j<n;j++){
                for (int m = j+1; m<=n;m++){
                    max = ((j&m)<k && (j&m) > max ) ? (j&m) : max;

                }
            }
            System.out.println(max);
        }


    }
}
