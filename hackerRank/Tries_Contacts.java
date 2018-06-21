package hackerRank;

import sun.reflect.generics.tree.Tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Tries_Contacts {

    public static String OP_FIND = "find";
    public static String OP_ADD = "add";
    static HashMap<Character, TreeSet<String>> hm = new HashMap<>();

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList cont = new ArrayList();
        ArrayList ops = new ArrayList();
        cont.add("hackerrank");
        cont.add("hack");
        cont.add("hacker");
        cont.add("soccer");
        cont.add("hac");
        cont.add("ha");
        cont.add("hackerrank");

        ops.add("add");
        ops.add("add");
        ops.add("add");
        ops.add("add");
        ops.add("find");
        ops.add("find");
        ops.add("find");
/*        String op = null;
        String contact = null;
        for (int i = 0; i < cont.size(); i++) {
            contact = (String) cont.get(i);
            op = (String) ops.get(i);
            trieTest(contact, op);
        }*/

        File fl = new File("D:\\SOLeetCode\\data\\triedictTest.txt");
        Scanner in = new Scanner(fl);
        int n = in.nextInt();
        for (int a0 = 0; a0 < n; a0++) {
            String op = in.next();
            String contact = in.next();
            if (a0 == 3340) {
                int t = 0;
            }
            System.out.println(op + " = " + a0);
            trieTest(contact, op);

        }
        in.close();
    }

    private static void trieTest(String contact, String op) {

        contact = contact.toLowerCase();
        op = op.toLowerCase();
        if (op.equals(OP_ADD)) {
            addContact(contact);
        } else if (op.equals(OP_FIND)) {
            int n = findTheContact(contact);
            System.out.println(n);
        }
    }

    private static void addContact(String contact) {
        Character c = contact.charAt(0);
        if (!hm.containsKey(c)) {
            TreeSet ts = new TreeSet();
            ts.add(contact);
            hm.put(c, ts);
        } else {
            TreeSet<String> strings = hm.get(c);
            strings.add(contact);
            hm.replace(c, strings);
        }

    }

    private static int findTheContact(String contact) {
        int result = 0;
        Character c = contact.charAt(0);
        if (!hm.containsKey(c))
            return 0;

        TreeSet<String> ts = hm.get(c);
        for (String s : ts) {
            if (s.length() < contact.length())
                continue;
            if (s.substring(0, contact.length()).equals(contact)) {
                result++;
            }
        }
        if (result != 0) {
            int t = 1;
        }
        return result;
    }

}
