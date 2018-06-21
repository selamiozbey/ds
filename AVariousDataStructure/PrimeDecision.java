package AVariousDataStructure;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrimeDecision {
    public static void main(String[] args) throws FileNotFoundException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        File fl = new File("D:\\SOLeetCode\\data\\PrimeDecisonTest.txt");
        Scanner sc=new Scanner(fl);
        int T=sc.nextInt();

        while(T-->0){
            long ele=sc.nextInt();
            boolean b = IsPrime.isPrime(ele);
            String s = b ? "Prime" : "Not prime";
            System.out.println(s);

        }

    }

}
