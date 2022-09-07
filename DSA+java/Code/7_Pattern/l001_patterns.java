import java.util.*;

public class l001_patterns{
    public static Scanner input=new Scanner(System.in);

    public static void pattern_01(int n){
        int nst=1,nsp=n-1;
        for(int r=1;r<=n;r++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("* ");
            }
            System.out.println();
            nst++;
            nsp--;
        }
    }

    public static void pattern_02(int n){
        int nst=n,nsp=0;
        for(int r=1;r<=n;r++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("* ");
            }
            System.out.println();
            nst--;
            nsp++;
        }
    }

    public static void pattern_03(int n){
        int nst=1;
        for(int r=1;r<=n;r++){
            
            for(int cst=1;cst<=nst;cst++){
                System.out.print("* ");
            }
            System.out.println();
            nst++;
            
        }
    }

    public static void pattern_04(int n){
        int nst=n;
        for(int r=1;r<=n;r++){
            for(int cst=1;cst<=nst;cst++){
                System.out.print("* ");
            }
            System.out.println();
            nst--;
        }
    }

    public static void pattern_05(int n){
        int nst=1;
        for(int r=1;r<=n;r++){
            for(int cst=1;cst<=nst;cst++){
                System.out.print(cst+" ");
            }
            System.out.println();
            nst++;
        }
    }

    public static void pattern_06(int n){
        int nst=1;
        int c=1;
        for(int r=1;r<=n;r++){
            for(int cst=1;cst<=nst;cst++){
                System.out.print((c++)+" ");
                
            }
            System.out.println();
            nst++;
        }
    }

    public static void pattern_07_01(int n){
        int nst1=1,nst2=1;
        int nsp1=n-1,nsp2=n-1;

        for(int r=1;r<=n;r++){
            for(int cst=1;cst<=nst1;cst++){
                System.out.print("* ");
            }
            for(int csp=1;csp<=nsp1;csp++){
                System.out.print("  ");
            }
            for(int csp=1;csp<=nsp2;csp++){
                System.out.print("  ");
            }
            for(int cst=1;cst<=nst2;cst++){
                System.out.print("* ");
            }

            
            System.out.println();
            nst1++;
            nst2++;
            nsp1--;
            nsp2--;
        }


    }

    public static void pattern_08(int n){
        int nst=n;
        for(int r=1;r<=n;r++){
            for(int cst=1;cst<=nst;cst++){
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }

    public static void pattern_07_02(int n){
        int nst=1;
        int nsp=2*n-1;

        for(int r=1;r<=n;r++){
            for(int cst=1;cst<=nst;cst++){
                System.out.print("* ");
            }
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
                }
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("* ");
            }

            
            System.out.println();
            nst++;
            
            nsp--;
        }


    }

    public static void main(String[] args){
        int n=input.nextInt();
        pattern_08(n);

    }
}