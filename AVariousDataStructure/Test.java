package AVariousDataStructure;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class Test {
    public static void add(int a){
        loop:
        for(int i = 1; i< 3 ; i++){
            for(int j=1;j<3;j++) {
                if (a == 5) {
                    break loop;
                }
                System.out.println(i*j);
            }
        }
    }

    public static void main(String[] args) {

            String s = "abcdefgh";
            int stringLength = s.length();
            char chars[] = new char[stringLength];
            s.getChars(0, stringLength, chars, 0);
            CharArrayReader reader1 = new CharArrayReader(chars);
            CharArrayReader reader2 = new CharArrayReader(chars, 1, 4);
            int i;
            int j;
            try {
                while ((i = reader1.read()) == (j = reader2.read())) {
                    System.out.print((char) i);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        public void test1(String year){
        String nameofSeason;
        switch (year){
            case "March":
            case "May":
                nameofSeason = "Spring";
                        break;
                        default:
                            throw new IllegalArgumentException("dfdfdf0" + year);
        }

        }


        public void ff(){
            final Collection<? extends Number> foo = new ArrayList<Number>();
/*

            foo.add(new Integer(4));
            foo.add(new Object());
            foo.add(null);
            foo = null;
            */
/*the code will not compile
            none of these are illegal*//*


*/

        }
}
