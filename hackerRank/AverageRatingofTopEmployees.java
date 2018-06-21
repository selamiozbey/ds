package hackerRank;

import AVariousDataStructure.ReadMatrixFromSource;

import java.util.*;

import static jdk.nashorn.internal.objects.NativeMath.round;

public class AverageRatingofTopEmployees {
    // Complete the averageOfTopEmployees function below.
   /* static void averageOfTopEmployees(int[] rating) {

        ArrayList arr = new ArrayList();
        long total=0;
        for (int i = 0; i < rating.length; i++) {
            if (rating[i] >= 90 && rating[i] <= 100) {
                arr.add(rating[i]);
                total = total + rating[i];
            }
        }


        double avg = (double) total / arr.size();
        if(String.valueOf((int)(avg*100)).length()>4) {
            int rd = (int) (avg * 1000);
            int tempRd = (int) (avg * 100);
            int remainder = rd % 5;
            tempRd = (remainder == 0) ? tempRd + 1 : tempRd;
            avg = (double) tempRd / 100;
        }
        System.out.printf("%.2f", avg);


    }*/

    static void averageOfTopEmployees(int[] rating) {
        double avg = 0.0;
        int count = 0;
        for(int i : rating) {
            if(i >= 90) {
                avg += i;
                count++;
            }
        }
        avg /= count;
        System.out.printf(String.format("%.2f", avg));
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 10;//scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] rating = new int[n];

/*        for (int ratingItr = 0; ratingItr < n; ratingItr++) {
            int ratingItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            rating[ratingItr] = ratingItem;
        }*/
/*        rating[0] = 84;
        rating[1] = 92;
        rating[2] = 61;
        rating[3] = 50;
        rating[4] = 95;*/
/*        rating[6] = 96;
        rating[7] = 99;*/


        rating[0] = 64;
        rating[1] = 86;
        rating[2] = 74;
        rating[3] = 95;
        rating[4] = 65;
        rating[5] = 84;
        rating[6] = 89;
        rating[7] = 94;
        rating[8] = 85;
        rating[9] = 91;

/*        ReadMatrixFromSource rm = new ReadMatrixFromSource();
        ArrayList list = (ArrayList) rm.readListFromFile("D:\\SOLeetCode\\data\\avgRatingsofTopEmp.txt");
        rating = new int[(int) list.get(0)];
        //list.remove(0);
        for (int i=0; i<(int)list.get(0);i++){
            rating[i] = (int) list.get(i+1);
        }*/


        averageOfTopEmployees(rating);

        scanner.close();
    }
}
