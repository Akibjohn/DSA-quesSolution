import java.util.*;
public class l002_pattern {
    public static Scanner input=new Scanner(System.in);

    public static void binomialPattern(int N) {

        for (int n = 0; n < N; n++) {
            int val=1;
            for(int r = 0; r <= n;r++){
                System.out.print(val+" ");
                val= (n-r) * val /(r+1);
            }System.out.println();

        }

    }

    public static void main(String[] args){
        int N=input.nextInt();
        binomialPattern(N);
    }
    
}
