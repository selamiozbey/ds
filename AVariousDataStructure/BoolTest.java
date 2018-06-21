package AVariousDataStructure;

public class BoolTest
{
    public static void main(String [] args)
    {

        test2();
        //test1();

    }

    private static void test1() {
        int result = 0;

        Boolean b1 = new Boolean("TRUE");
        Boolean b2 = new Boolean("true");
        Boolean b3 = new Boolean("tRuE");
        Boolean b4 = new Boolean("false");

        if (b1 == b2)  /* Line 10 */
            result = 1;
        if (b1.equals(b2) ) /* Line 12 */
            result = result + 10;
        if (b2 == b4)  /* Line 14 */
            result = result + 100;
        if (b2.equals(b4) ) /* Line 16 */
            result = result + 1000;
        if (b2.equals(b3) ) /* Line 18 */
            result = result + 10000;

        System.out.println("result = " + result);

        try
        {
            Float f1 = new Float("3.0");
            int x = f1.intValue();
            byte b = f1.byteValue();
            double d = f1.doubleValue();
            System.out.println(x + b + d);
        }
        catch (NumberFormatException e) /* Line 9 */
        {
            System.out.println("bad number"); /* Line 11 */
        }
    }

    public static void test2()
        {
            float f1[ ], f2[ ];
            f1 = new float[10];
            f2 = f1;
            System.out.println("f2[0] = " + f2[0]);
        }

}