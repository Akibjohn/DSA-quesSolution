import java.util.Scanner;

public class l001_pattern{
    public static Scanner input =new Scanner(System.in);

    public static void pattern(int n){
        int nst=1,nsp=n-1;
        
        for(int r=1;r<=n;r++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }int count=nst;
            for(int cst=1;cst<=nst;cst++){
                System.out.print(count+" ");
                count--;
            }
            System.out.println();
            nst++;
            nsp--;
        }
    }


    public static void pattern_01(int n){
        int nst=2*n-1,nsp=0;
        
        for(int r=1;r<=n;r++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }int count=1;
            for(int cst=1;cst<=nst;cst++){
                System.out.print(count+" ");
                count++;
                
            }
            System.out.println();
            nst-=2;
            nsp++;
        }
    }

    public static void pattern_02(int n){
        int nst=2*n-1,nsp=0;
        
        for(int r=1;r<=n;r++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }int count=nst;
            for(int cst=1;cst<=nst;cst++){
                System.out.print(count--+" ");
                
                
            }
            System.out.println();
            nst-=2;
            nsp++;
        }
    }

    public static void pattern_03(int n){
        int nst1=2*n-1,nsp1=0;
        for(int r=1;r<=n;r++){
            
            for(int csp1=1;csp1<=nsp1;csp1++){
                System.out.print("  ");
            }
            for(int cst1=1;cst1<=nst1;cst1++){
                System.out.print("* ");  
            }
            
            System.out.println();
            nst1-=2;
            nsp1++;
            
        }
        int nst2=1,nsp2=n-1;
        for(int r=1;r<=n;r++){
            
           
            for(int csp2=1;csp2<=nsp2;csp2++){
                System.out.print("  ");
            }
            for(int cst2=1;cst2<=nst2;cst2++){
                System.out.print("* ");  
            }
            System.out.println();
            nst2+=2;
            nsp2--;
            
        }
    }

    public static void pattern_04(int n){
        int nst1=2*n-1,nsp1=0;
        for(int r=1;r<=n;r++){
            
            for(int csp1=1;csp1<=nsp1;csp1++){
                System.out.print("  ");
            }
            for(int cst1=1;cst1<=nst1;cst1++){
                if(nst1==1) break;
                System.out.print("* ");
                  
            }
            if(r!=n)System.out.println();
            
            nst1-=2;
            nsp1++;
            
        }
        int nst2=1,nsp2=n-1;
        for(int r=1;r<=n;r++){
            

            for(int csp2=1;csp2<=nsp2;csp2++){
                System.out.print("  ");
            }
            for(int cst2=1;cst2<=nst2;cst2++){
                System.out.print("* ");  
            }
            System.out.println();
            nst2+=2;
            nsp2--;
            
        }
    }

    


    public static void main(String[] args) {
        int n=input.nextInt();
        pattern(n);
        pattern_01(n);
        pattern_02(n);
        pattern_03(n);
        pattern_04(n);
    }
}