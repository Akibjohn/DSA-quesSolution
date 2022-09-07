import java.util.*;
public class l002_gcd {
    public static Scanner input=new Scanner(System.in);

    public static int gcd(int a, int b){
        //swap the value
        if(a>b){
            int temp=a;
            a=b;
            b=temp;

        }
        
        while(a!=0){
            int rem=b%a;
            b=a;
            a=rem;
        }return b;
    }

    public static int lcm(int a, int b){
        int ans;
        int gcd =gcd(a, b);
        ans=(a/gcd)*b;
    return ans;
    }


    public static void main(String[] args){
        int a=input.nextInt();
        int b=input.nextInt();
        // System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));

        
    }
    
}

