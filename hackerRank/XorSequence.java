package hackerRank;

import java.util.ArrayList;

public class XorSequence {
    static ArrayList<Long> arr = new ArrayList();
    // Complete the xorSequence function below.
    static long xorSequence(long l, long r) {
        if(arr.size() <= r){
            for(long i = arr.size();i <= r ;i++){
                arr.add((long)arr.get(arr.size()-1) ^ i);
            }
        }
        long total=0;
        for(int i = (int) l; i <= r; i++){
            total = total ^ (long)arr.get(i);
        }

        return total;
    }
}
