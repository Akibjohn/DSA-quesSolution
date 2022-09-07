import java.util.Scanner;

public class l001_java {
    public static Scanner input = new Scanner(System.in);

    public static void pattern(int n) {
        int nst = 1, nsp = (n / 2) ;
        if (n % 2 != 0) {
            for (int r = 1; r <= n; r++) {
                for (int csp = 1; csp <= nsp; csp++) {
                    System.out.print("  ");
                }
                for (int cst = 1; cst <= nst; cst++) {
                    System.out.print("* ");
                }
                if (r <= n / 2) {
                    nst += 2;
                    nsp--;

                } else if (r > n / 2) {
                    nst -= 2;
                    nsp++;

                }
                System.out.println();

            }
        }else{System.out.println("enter only odd number... try again");}
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        pattern(n);
    }
}