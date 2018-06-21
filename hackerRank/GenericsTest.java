package hackerRank;

public class GenericsTest<T> {
    public static void main(String[] args) {
        String[] stringArray = {"wwww","eeee","eeeee"};

        Generics<String> stringPrinter = new Generics<>();
        stringPrinter.printArray( stringArray );
    }
}
