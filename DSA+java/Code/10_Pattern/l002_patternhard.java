import java.util.Scanner;

public class l002_patternhard {
    public static Scanner input = new Scanner(System.in);

    public static void diamondNumber(int n) {
        if (n % 2 == 0) // if n is even make it odd
            n++;

        int nst = 1, nsp = n / 2;
        for (int r = 1; r <= n; r++) {
            for (int csp = 1; csp <= nsp; csp++)
                System.out.print("  ");

            int count = r;
            if (r > n / 2 + 1)
                count = n - r + 1;

            for (int cst = 1; cst <= nst; cst++) {
                System.out.print(count + " ");
                if (cst <= nst / 2) {

                    count++;

                } else {
                    count--;
                }
            }

            if (r <= n / 2) {
                nst += 2;
                nsp--;
            } else {
                nst -= 2;
                nsp++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        diamondNumber(n);
    }
}