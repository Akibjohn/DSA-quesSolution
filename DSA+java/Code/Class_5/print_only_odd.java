import java.util.*;
public class print_only_odd {
    public static Scanner input=new Scanner(System.in);
    public static void main(String[] args){
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i+": is odd");
            }
        }
    }
    
}