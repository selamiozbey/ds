package hackerRank;

import java.util.*;

public class SubsetWithUniqueSum {
    static ArrayList arr = new ArrayList();
    static int n = 6, m = 3;

    public static void main(String[] args) {
        //  Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        Scanner scan = new Scanner(System.in);
        //int n ;//scan.nextInt(); // length of the set
        //int m ;//scan.nextInt(); //lenght of the sub set

/*        for(int i = 0; i<n ; i++){
            arr.add(scan.nextInt());
        }*/
        arr.add(1);
        arr.add(3);
        arr.add(6);
        arr.add(8);
        arr.add(10);
        arr.add(11);//arr.add( 12);
        //arr.add(1); arr.add(1); arr.add( 5);
        //arr.add(2); arr.add(3); arr.add( 7);arr.add(8);
        //int K_SubsetNumber=0;
        if (m == 0) {
            System.out.println(0);
            return;
        }
        if (m < 1 || m > n || n < 1 || n > 100) {
            System.out.println(0);
            return;
        }
        ;


        System.out.println(calculate((int) Math.pow(2, n)));

    }

    static List<Integer> intList = new ArrayList();
    public static int calculate(int number) {

        int  total = 0;
        if (number == 0) return total;
        if (Integer.toString(number, 2).chars().filter(ch -> ch == '1').count() != m){
            return calculate(number - 1);
        }
        int currentNum = number;
        int index = 0;
        int tempTotal = 0;
        while (currentNum > 0) {
            int remainder = currentNum % 2;
            tempTotal = tempTotal + ((int) arr.get(index) * remainder);
            currentNum = currentNum >> 1;
            index++;
        }
        if (intList.contains(tempTotal))
            total = total - tempTotal;
        else {
            total = total + tempTotal;
            intList.add(tempTotal);
        }


        return total+calculate(number - 1);

    }
  /*  static void printSubsets(char set[])
    {
        int n = set.length;

        // Run a loop for printing all 2^n
        // subsets one by obe
        for (int i = 0; i < (1<<n); i++)
        {
            System.out.print("{ ");

            // Print current subset
            for (int j = 0; j < n; j++)

                // (1<<j) is a number with jth bit 1
                // so when we 'and' them with the
                // subset number we get which numbers
                // are present in the subset and which
                // are not
                if ((i & (1 << j)) > 0)
                    System.out.print(set[j] + " ");

            System.out.println("}");
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        char set[] = {'a', 'b', 'c'};
        printSubsets(set);
    }*/

/*    public static void main(String args[])
    {
        int t = 1<<6;
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the set: ");
        int N = sc.nextInt();
        int[] sequence = new int[N];
        for (int i = 0; i < N; i++)
            sequence[i] = Math.abs(random.nextInt(100));

        System.out.println("The elements in the set : ");
        for (int i = 0; i < N; i++)
            System.out.print(sequence[i] + " ");

        System.out.println("\nEnter the number of elements in the subsets: ");
        int n = sc.nextInt();

        int[] binary = new int[(int) Math.pow(2, N)];
        for (int i = 0; i < Math.pow(2, N); i++)
        {
            int b = 1;
            binary[i] = 0;
            int num = i, count = 0;
            while (num > 0)
            {
                if (num % 2 == 1)
                    count++;
                binary[i] += (num % 2) * b;
                num /= 2;
                b = b * 10;
            }
            if (count == n)
            {
                System.out.print("{ ");
                for (int j = 0; j < N; j++)
                {
                    if (binary[i] % 10 == 1)
                        System.out.print(sequence[j] + " ");
                    binary[i] /= 10;
                }
                System.out.println("}");
            }
        }
        sc.close();
    }*/
}

/*

    public static void main(String[] args) {
        //  Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        Scanner scan = new Scanner(System.in);
        int n = 4;//scan.nextInt(); // length of the set
        int k = 2;//scan.nextInt(); //lenght of the sub set
        ArrayList arr = new ArrayList();
*/
/*        for(int i = 0; i<n ; i++){
            arr.add(scan.nextInt());
        }*//*

        //arr.add(1); arr.add(3); arr.add( 6); arr.add( 8); arr.add( 10); arr.add( 11);arr.add( 12);
        //arr.add(1); arr.add(1); arr.add( 5);
        arr.add(2); arr.add(3); arr.add( 7);arr.add(8);
        //int K_SubsetNumber=0;
        if(k==0) {
            System.out.println(0);
            return;
        };
        HashMap uniqueArr = new HashMap();
        for (int i = 0; i< (1<<n) ; i++){

            int currentNum = i;
            ArrayList<Integer> tempArr = new ArrayList();
            int onesInTheCurrentNum=0;

            int index=0;
            while (currentNum>0){
                int remainder = currentNum %2;
                if(remainder==1){
                    onesInTheCurrentNum++;
                    tempArr.add(1);
                }else {
                    tempArr.add(0);
                }
                currentNum = currentNum>> 1;
                if (onesInTheCurrentNum > k)
                    break;
            }
            if(onesInTheCurrentNum == k){
                int total_K_SubsetNumber=0;
                for (int t=0; t < tempArr.size() ; t++){
                    if(tempArr.get(t) == 1)
                    {
                        total_K_SubsetNumber = total_K_SubsetNumber + (int)arr.get(t);

                    }

                }
                if(uniqueArr.get(total_K_SubsetNumber)==null){
                    uniqueArr.put(total_K_SubsetNumber,1);
                }else {
                    int val = (int)uniqueArr.get(total_K_SubsetNumber);
                    uniqueArr.put(total_K_SubsetNumber,val+1);

                }
            }
        }
        int total=0;

        Set<Integer> keys = uniqueArr.keySet();
        for(int key: keys){
            if((Integer)uniqueArr.get(key) == 1){
                total = total + key;
            }
        }
        System.out.println(total);

    }*/
