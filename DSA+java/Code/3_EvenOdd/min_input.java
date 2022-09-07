import java.util.Scanner;
public class min_input{
    public static Scanner input= new Scanner(System.in);
    public static void main(String[] args){
        int n=input.nextInt();
        int minnum=Integer.MAX_VALUE;
        for(int i=1;i<=n;i++){
            int num=input.nextInt();
            minnum=Math.min(minnum,num);
        }
        System.out.println("minnumber is: "+minnum);
        
    }
}
