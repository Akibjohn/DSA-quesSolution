import java.util.*;
public class l001_pattern {
    public static Scanner input=new Scanner(System.in);

    public static void pattern_1(int n){
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void pattern_2(int n){
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                if(i+j==n-1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void pattern_3(int n){
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    System.out.print("* ");
                }else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void pattern_4(int n){
        for(int i=0; i<n; i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    System.out.print("* ");
                }
                
                else System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args) {
        int n=input.nextInt();
        pattern_1(n);
        pattern_2(n);
        pattern_3(n);
        pattern_4(n);
        
    }
    
}
