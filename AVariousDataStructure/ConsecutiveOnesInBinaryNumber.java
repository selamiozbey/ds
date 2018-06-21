package AVariousDataStructure;

public class ConsecutiveOnesInBinaryNumber {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        // Scanner sc = new Scanner(System.in);

        int dec = 5;
        int remainder;
        int ones = 0;
        int tempOnes = 0;
        while (true) {
            if (dec == 0) break;
            remainder = dec % 2;
            dec = dec / 2;
            if (remainder == 1) {
                tempOnes++;
            } else {
                tempOnes = 0;
            }
            ones = tempOnes > ones ? tempOnes : ones;
        }
        System.out.println(ones);
    }
}
