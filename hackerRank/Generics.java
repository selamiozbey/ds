package hackerRank;

public class Generics<T> {
    public void printArray(T[] trr){
        for(T t : trr){
            System.out.println(t);
        }
    }
}
