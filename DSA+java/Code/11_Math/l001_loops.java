import java.util.*;

public class l001_loops {
    public static Scanner input = new Scanner(System.in);

    public static int power(int a, int b) {
        int ans = 1;
        for (int i = 1; i <= b; i++) {
            ans *= a;

        }
        return ans;

    }

    public static int fact(int n) {
        int ans = 1;
        while (n > 0) {
            ans *= n;
            n--;

        }
        return ans;

    }

    public static int ncr(int n, int r) {
        int a = fact(n);
        int b = fact(n - r);
        int c = fact(r);
        return a / (b * c);
    }

    public static int npr(int n, int r) {
        int a = fact(n);
        int b = fact(n - r);
        return a / b;

    }

    public static void main(String[] args) {
        // power:
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println(power(a, b));

        // factorial:
        // int n = input.nextInt();
        // System.out.println(fact(n));

        // ncr:
        // int n=input.nextInt();
        // int r=input.nextInt();
        // System.out.println(ncr(n, r));

        // npr:
        // int n=input.nextInt();
        // int n=input.nextInt();
        // System.out.println(npr(n, r));

    }
}