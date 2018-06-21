package hackerRank;

public class PowersOf2 {
    public static void main(String[] args) {
        //samplePowersof();
        sample2Powersof(50);
    }

    private static int sample2Powersof(int numPowersOf2) {

       // System.out.println(numPowersOf2 + " powers of 2 will be printed!");

        if (numPowersOf2 < 1) {
            return 0;
        }
        else if ( numPowersOf2 == 1){
            return 1;
        }
        else {
            int prev = sample2Powersof(numPowersOf2/2);
            int curr = prev*2;
            System.out.println(curr);
            return curr;
        }

    }

    private static void samplePowersof() {
        int numPowersOf2;        //How many powers of 2 to compute
        int nextPowerOf2 = 1;    //Current power of  2
        int exponent;            //Exponent for current power of 2 -- this
        //also serves as a counter for the loop

        System.out.println("How many powers of 2 would you like printed?");
        numPowersOf2 = 50;

        // add code below each comment to carry out the action
        // listed in the comment; more than one statement may be needed
        // in some cases

        // print a message saying how many powers of 2 will be printed
        System.out.println(numPowersOf2 + " powers of 2 will be printed!");

        // initialize exponent -- the first thing printed is 2 to the what?
        exponent = 0;

        while (exponent < numPowersOf2) {
            //print out current power of 2
            System.out.println("2^" + exponent + " = " + nextPowerOf2);
            //find next power of 2 -- how do you get this from the last one?
            nextPowerOf2 = nextPowerOf2 * 2;
            //increment exponent
            exponent++;
        }
    }
}