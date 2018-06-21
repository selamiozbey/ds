package hackerRank;

import java.util.*;

public class ArraysLeftRotation {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        ArrayList list = new ArrayList<>();
        for (int i=0; i<a.length; i++)
        {
            list.add(a[i]);
        }
        LinkedList ll = new LinkedList();
        ll.addAll(list);

        while(k!=0){
            Object first = ll.removeFirst();
            ll.addLast(first);
            --k;
        }
        int[] primitives = toArray(ll);
        return primitives;
    }

    static int[] toArray(LinkedList<Integer> list) {
        int[] ret = new int[ list.size() ];
        int i = 0;
        for(Iterator<Integer> it = list.iterator();
            it.hasNext();
            ret[i++] = it.next() );
        return ret;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5};
        int[] ints = arrayLeftRotation(arr, arr.length, 4);
        return;

    }
}
