package hackerRank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class BalancedChars {

 /*   public static boolean isBalanced(String expression) {
        boolean result=true;
        HashMap<Character, Character> hashMap = new HashMap();
        hashMap.put('<','>');

        Stack<Character> myStack = new Stack();
        for (Character c : expression.toCharArray()){
            if (hashMap.get(c) == null)
            {
                if(myStack.isEmpty() || c != myStack.pop()){
                    result = false;
                    break;
                }
            }else{
                myStack.push((Character) hashMap.get(c));
            }
        }
        return result;
    }*/

    public static int calculateExpNumber(String expression) {
        int expNeeded=0;
        HashMap<Character, Character> hashMap = new HashMap();
        hashMap.put('<','>');

        Stack<Character> myStack = new Stack();
        for (Character c : expression.toCharArray()){
            if (hashMap.get(c) == null)
            {
                if(myStack.isEmpty() || c != myStack.pop()){
                    expNeeded++;
                    continue;
                }
            }else{
                myStack.push((Character) hashMap.get(c));
            }
        }
        return expNeeded;
    }

    static int[] balancedOrNot(String[] expressions, int[] maxReplacements) {
        if(expressions.length<1 || expressions.length>100) return new int[]{};

        if(maxReplacements[0]<0 || maxReplacements[0] > 100000) return new int []{};

        int[] result = new int[expressions.length];
        ArrayList<Integer> numberArray = new ArrayList();
        int expLen = Integer.valueOf(expressions[0]);
                for(int i= 1 ; i<=expLen; i++) {
                    String str = expressions[i];
                    if(str.length() <1 || str.length()>100000) return new int[]{};
                    int r = calculateExpNumber(str);
                    if (r==0) {numberArray.add(1); continue;}

                    if(r == maxReplacements[i])  numberArray.add(1);
                    else numberArray.add(0);

                }
        result = numberArray.stream().mapToInt(i -> i).toArray();
        return result;
    }




    public static void main(String[] args) {
        String [] str = new String[]{"2","<>","<>><"};

        int [] rep = new int[]{2,1,0};
        int[] ints = balancedOrNot(str,rep);


        return;

    }


}
