import java.util.Scanner;
public class print_evenodd_according_to_user{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int n=input.nextInt();
        boolean isEven=input.nextBoolean();
        for(int i=1;i<=n;i++){
            if(isEven){
                if(i%2==0){
                System.out.println(i+": even");
                }
            
            }
            else{
                if(i%2!=0)
                { System.out.println(i+": odd");
                }
               
            }
        }
    }
}