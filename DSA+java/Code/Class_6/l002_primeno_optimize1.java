import java.util.*;
public class l002_primeno_optimize1{
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int n=input.nextInt();
        boolean flag=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println(n+": is a prime number");
        }else{
            System.out.println(n+": is not a prime number");
        }
        
    }
} 