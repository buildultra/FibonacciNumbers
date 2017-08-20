public class fibonacci {
    public static void main(String args[]) {
        int n1 = 0, n2 = 1, n3, i, display = 10;
        System.out.print(n1 + " " + n2);//printing 0 and 1

        for (i = 1; i <= display; i++)//loop starts
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }

    }
}
