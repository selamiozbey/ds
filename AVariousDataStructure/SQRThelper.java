package AVariousDataStructure;

public class SQRThelper {


    public static void main(String[] args) {
        int res = getSqrt(100, 1, 100);
        System.out.println(res);
    }

    private static int getSqrt(int n, int min, int max) {
        if (max < min) return -1;
        int guess = (min + max) / 2;

        if (guess * guess == n) {
            return guess;
        } else if (guess * guess < n) {
            return getSqrt(n, guess + 1, max);
        } else {
            return getSqrt(n, min, guess - 1);
        }

    }
}
