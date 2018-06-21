package hackerRank;

public class getSubsetwithElement {
    public static void main(String args[])
    {

        System.out.println("Enter the number of elements in the set: ");
        int N = 6;
        int[] sequence = {51, 36, 33, 97, 48, 22 };


        System.out.println("The elements in the set : ");
        for (int i = 0; i < N; i++)
            System.out.print(sequence[i] + " ");

        System.out.println("\nEnter the number of elements in the subsets: ");
        int n = 3;

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

    }
}
