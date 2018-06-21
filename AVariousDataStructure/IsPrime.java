package AVariousDataStructure;

public class IsPrime {
    public static boolean isPrime(long num) {
        if(num<2) return false;
        if(num==2) return true;
        if (num % 2 == 0) return false;
        for (int i = 3; i * i <= num; i += 2)
            if (num % i == 0) return false;
        return true;
    }
}
