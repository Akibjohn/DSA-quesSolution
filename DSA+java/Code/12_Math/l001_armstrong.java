import java.util.*;
public class l001_armstrong {
    public static Scanner input=new Scanner(System.in);

    public static int digitcount(int num) {
        int count=0;
        while(num!=0){
            num/=10;
            count++;
        }return count;
        
    }

    public static String armStrong(int n){
        int digitcount=digitcount(n);
        int res=0, num=n;
        while(num!=0){
            int rem=num%10;
            num/=10;
            res+=Math.pow(rem,digitcount);

        }return res==n? "yes":"no";
    }

    

    public static void main(String[] args){
        int num=input.nextInt();
        System.out.println(armStrong(num));
    }
    
}

