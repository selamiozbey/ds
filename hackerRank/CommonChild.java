package hackerRank;

import java.util.Arrays;
import java.util.List;

public class CommonChild {
    // Complete the commonChild function below.
    static int commonChild(String s1, String s2) {
        int matrix[] = new int[26];
        int matrix1[] = new int[26];
        char[] output = s1.toCharArray();
        List<char[]> s1List = Arrays.asList(output);
        output = s2.toCharArray();
        List<char[]> s2List = Arrays.asList(output);

        for (int i=0; i< s1List.size();i++){
            
        }

        for(int i=0; i< Math.max(s1.length(),s2.length()); i++){
            if(s1.length() >= i){
                matrix[s1.charAt(i)-65] ++;
            }
            if(s2.length() >= i){
                matrix1[s2.charAt(i)-65] ++;
            }
        }
        int total = 0;
        for (int i =0; i<26; i++){
            total = total + Math.min(matrix[i], matrix1[i]);
        }
        return total;
    }

    //private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = "ABCDEF";

        String s2 = "FBDAMN";

        int result = commonChild(s1, s2);
        System.out.println(result);


    }

}
