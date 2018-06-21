package hackerRank;

import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class AngryChildren2 {
    static long angryChildren(int k, int[] packets) {
        ArrayList<Integer> mainset = toArrayList(packets);
        TreeMap<Long, Integer> tm = new TreeMap<>();
        for (int j = 0; j < mainset.size()-k+1; j++) {
            long temp=0;
            temp = Math.abs(mainset.get(j) - mainset.get(k+j-1));
            tm.put(temp,j);
        }

        Long key = tm.firstKey();
        int index = tm.get(key);
        long total = 0;
        for (int i = index; i<index+k;i++){
            for (int j = i+1; j<index+k;j++){
                total = total + Math.abs(mainset.get(j) - mainset.get(i));
            }
        }


        return total;
    }

    static ArrayList toArrayList(int[] array) {
        ArrayList arrayList = new ArrayList();
        for (int i : array) {
            arrayList.add(i);
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void main(String[] args) throws FileNotFoundException {

        int n = 6;
        //int[] sequence = {51, 36, 33, 97, 48, 22 };
        //int[] packets = {10, 100,300, 200,1000, 20,30};
        //int[] packets = {1,2,3,4,10,20,30,40,100,200};
        //int K = 3;

        File fl = new File("D:\\SOLeetCode\\data\\AngryChildrenTest2.txt");
        long testResult = 43481985364307L;//35581051898881688L;

        Scanner in = new Scanner(fl);
        n = in.nextInt();
        int K = in.nextInt();
        int[] packets = new int[n];
        for (int packets_i = 0; packets_i < n; packets_i++) {
            packets[packets_i] = in.nextInt();
        }

        long l = angryChildren(K, packets);
        System.out.println(l);
        //long res = solve(packets, n, K);
        //System.out.println(res);

/*        Arrays.sort(packets);
        int min = packets[K-1] - packets[0];
        for(int i=0;i<n-K-1;i++){
            if(packets[K+i]-packets[i+1]<min){
                //System.out.println(min);
                min  = packets[K+i] - packets[i+1];
            }
        }

        System.out.println(min);*/

    }


    private static long solve(int[] a, int n, int k) {
        Arrays.sort(a);

        // Compute prefix sum
        long[] prefixSum = new long[n];
        prefixSum[0] = a[0];
        for (int i = 1; i < n; i++) {
            prefixSum[i] = prefixSum[i - 1] + a[i];
        }


        long d = 0;
        long ans = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            if (i < k) {
                d = d + i * a[i] - prefixSum[i - 1];
                ans = d;
            } else {
                long x = (prefixSum[i - 1] - prefixSum[i - k]) - (k - 1) * a[i - k];
                long y = (k - 1) * a[i] - (prefixSum[i - 1] - prefixSum[i - k]);
                if (d - x + y > 0) {
                    ans = Math.min(ans, d);
                    d = d - x + y;
                }
            }
        }


        return ans;
    }


}
