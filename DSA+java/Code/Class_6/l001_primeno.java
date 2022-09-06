import java.util.*;
public class l001_primeno{
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int n=input.nextInt();
        boolean flag=true;
        for(int i=2;i<n;i++){
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