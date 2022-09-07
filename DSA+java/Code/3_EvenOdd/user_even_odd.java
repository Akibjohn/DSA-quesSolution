import java.util.*;
public class user_even_odd {
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args){
        int count=input.nextInt();
        for(int i=1;i<=count;i++){
            int n=input.nextInt();
            if(n%2==0){
                System.out.println(n+"="+"Even");
            }else{
                System.out.println(n+"= Odd");
            }
        }
    }
    
}
