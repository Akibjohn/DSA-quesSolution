import java.util.*;
public class l001_newprime{
    public static Scanner input=new Scanner(System.in);

    public static boolean isprime(int n){
        if(n==0 || n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0)
                return false;
            }
        return true;   
    } 


    public static void printprimenumbers(int a,int b){
        for(int i=a;i<=b;i++){
            if(isprime(i)==true)
                System.out.print(i+",");
        }
    }

    public static void main(String[] args) {
        int a=input.nextInt();
        int b=input.nextInt();
        printprimenumbers(a,b);
        
        
    }
}  
