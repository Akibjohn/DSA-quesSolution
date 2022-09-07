import java.util.Scanner;
public class max_input{
    public static Scanner input= new Scanner(System.in);
    public static void main(String[] args){
        int n=input.nextInt();
        int maxnum=Integer.MIN_VALUE;
        for(int i=1;i<=n;i++){
            int num=input.nextInt();
            maxnum=Math.max(maxnum,num);
        }
        System.out.println("maxnumber is: "+maxnum);
        
    }
}
