package AVariousDataStructure;

import java.util.*;

public class QueensAttack2 {

    static int queensAttack(int n, int k, int r_q, int c_q, int[][] obstacles) {
        // Complete this function
        int total = 0;
        Hashtable ht = new Hashtable<Integer, Integer>();
        boolean[] b = {true, true, true, true, true, true, true, true};
        HashMap<Integer, ArrayList<Integer>> oht = new HashMap();
        for (int i = 0; i < k; i++) {
            if (oht.containsKey(obstacles[i][0]))
            {
                ArrayList<Integer> arr = oht.get(obstacles[i][0]);
                arr.add(obstacles[i][1]);
                oht.put(obstacles[i][0], arr);
            }else{
                ArrayList<Integer> arr = new ArrayList<>();
                arr.add(obstacles[i][1]);
                oht.put(obstacles[i][0], arr);
            }
        }
        /*orjin to right b[0]
        orjin to left b[1]
        orjin to top b[2]
        orjin to bottom b[3]
        orjin to cross right b[4]
        orjin to cross left b[5]
        orjin to cross left b[6]
        orjin to cross right b[7]
        * */
        for (int i = 1; i <= n; i++) {

            //orjin to right
            if (c_q + i <= n && b[0]) {
                b[0] = checkPoint(r_q, c_q + i, oht);
                if (b[0]) {
                    ht.put(r_q, c_q + i);
                    total++;
                }

            }
            //orjin to left
            if (c_q - i >= 1 && b[1]) {
                b[1] = checkPoint(r_q, c_q - i, oht);
                if (b[1]) {
                    ht.put(r_q, c_q - i);
                    total++;
                }
            }
            ///////

            //orjin to top
            if (r_q + i <= n && b[2]) {
                b[2] = checkPoint(r_q + i, c_q, oht);
                if (b[2]) {
                    ht.put(r_q + i, c_q);
                    total++;
                }

            }
            //orjin to bottom
            if (r_q - i >= 1 && b[3]) {
                b[3] = checkPoint(r_q - i, c_q, oht);
                if (b[3]) {
                    ht.put(r_q - i, c_q);
                    total++;
                }
            }
            //orjin to right top cross
            if (r_q + i <= n && c_q + i <= n && b[4]) {
                b[4] = checkPoint(r_q + i, c_q + i, oht);
                if (b[4]) {
                    ht.put(r_q + i, c_q + i);
                    total++;
                }
            }
            //orjin to left bottom cross
            if (r_q - i >= 1 && c_q - i >= 1 && b[5]) {
                b[5] = checkPoint(r_q - i, c_q - i, oht);
                if (b[5]) {
                    ht.put(r_q - i, c_q - i);
                    total++;
                }
            }
            //orjin to left top cross
            if (r_q - i >= 1 && c_q + i <= n && b[6]) {
                b[6] = checkPoint(r_q - i, c_q + i, oht);
                if (b[6]) {
                    ht.put(r_q - i, c_q + i);
                    total++;
                }
            }
            //orjin to right bottom cross
            if (r_q + i <= n && c_q - i >= 1 && b[7]) {
                b[7] = checkPoint(r_q + i, c_q - i, oht);
                if (b[7]) {
                    ht.put(r_q + i, c_q - i);
                    total++;
                }
            }

        }

        return total;
    }

    private static boolean checkPoint(int row, int col, HashMap oht) {
        if (oht.containsKey(row)) {
            ArrayList arr = (ArrayList) oht.get(row);

            if (arr.contains(col))
                return false;
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 5;//in.nextInt();
        int k = 4;//in.nextInt();
        int r_q = 4;//in.nextInt();
        int c_q = 3;//in.nextInt();
        int[][] obstacles = new int[k][2];
        obstacles[0][0] = 5;
        obstacles[0][1] = 5;
        obstacles[1][0] = 4;
        obstacles[1][1] = 2;
        obstacles[2][0] = 2;
        obstacles[2][1] = 4;
        obstacles[3][0] = 4;
        obstacles[3][1] = 4;
/*5 3
4 3
5 5
4 2
2 4
4 4*/
/*        for (int obstacles_i = 0; obstacles_i < k; obstacles_i++) {
            for (int obstacles_j = 0; obstacles_j < 2; obstacles_j++) {
                obstacles[obstacles_i][obstacles_j] = in.nextInt();
            }
        }*/
        int result = queensAttack(n, k, r_q, c_q, obstacles);
        System.out.println(result);
        in.close();
    }
}

