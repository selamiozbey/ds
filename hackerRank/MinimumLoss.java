package hackerRank;

import java.util.HashSet;
import java.util.TreeSet;

public class MinimumLoss {

    static int minimumLoss(long[] price) {
        long y = price.length;
        long min = 100000000;

        for (int j = 0; j < y-1; j++) {
            for (int i = j + 1; i < y; i++) {
                if(price[i]>price[j] || price[i] == price[j]) continue;
                //min = (price[j] - price[i]) < min ? (price[j] - price[i]) : min;
                min = Math.min((price[j] - price[i]),min);
                if (min == 1) return (int)min;}
        }

        return (int)min;
    }

    public static void main(String[] args) {

        int n = 6;
        long[] price = new long[n+1];
       // price[0]=n; price[1] = 5; price[2]=10;price[3] = 3;price[4] = 4;

        price[0]=40;price[1]=20 ;price[2]=7 ;price[3]=8 ;price[4]=2;price[5]= 5;
        int result = minimumLoss(price);
        System.out.println(result);

    }

}
