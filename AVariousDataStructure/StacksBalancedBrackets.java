package AVariousDataStructure;

import java.util.HashMap;
import java.util.Stack;

public class StacksBalancedBrackets {



    public static boolean isBalanced(String expression) {
        boolean result=true;
        HashMap<Character, Character> hashMap = new HashMap();
        hashMap.put('(',')');
        hashMap.put('[',']');
        hashMap.put('{','}');




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
    }

    public static void main(String[] args) {
        String str = "{[(])}";
        isBalanced(str);
    }

}


/*    public enum allBrackets{squareBracket ("]"),
        roundBracket(")"),
        curlyBracket("}");
        private String bracket;

        allBrackets(String bracket) {
            this.bracket = bracket;
        }

        public String bracket() {
            return bracket;
        }

    }*/