
import java.util.*;

public class l003_binomial_expression  {
    public static Scanner input = new Scanner(System.in);

   
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

    public static void binomialExpression(int n, int b){
        for(int r=0;r<=n;r++){
            Double power=Math.pow(b, r);
            double sol=ncr(n, r)*power;
            System.out.print(n+"c"+r+"*"+b+"^"+r+"="+sol+" + ");

        }

    }

    

    public static void main(String[] args) {
        int n=input.nextInt();
        int b=input.nextInt();
        binomialExpression(n, b);

        // int n=input.nextInt();
        // int r=input.nextInt();
        // System.out.println(ncr(n, r));
        

    }
}