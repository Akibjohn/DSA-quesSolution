import java.util.Scanner;

public class l001_patterns{
    public static Scanner input =new Scanner(System.in);

    // 1. Always look at the first row try to figure out its pattern in terms of
    // (space) and (star).
    // 2. count star and space W.R.T. n only for row 1.
    // 3. write loop to print star and space
    // 4. figure out relation in between row 1 and row2 for nst and nsp for doing
    // this use table.
    // 5. enclose above loop into another loop for printing multiple rows.

    public static void pattern_01(int n){
        int nst=1,nsp=n-1;
        int count=1;
        for(int r=1;r<=n;r++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print(count+" ");
            }
            System.out.println();
            nst++;
            nsp--;
        }
    }

    public static void pattern_02(int n){
        int nst=1,nsp=n-1;
        for(int r=1;r<=n;r++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print(cst+" ");
            }
            System.out.println();
            nst++;
            nsp--;
        }
    }

    public static void pattern_03(int n){
        int nst=1,nsp=n-1;
        for(int r=1;r<=n;r++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("* ");
                
            }
            System.out.println();
            nst=nst+2;
            nsp--;
        }
    }

    public static void pattern_04(int n){
        int nst=(2*n)-1,nsp=0;
        for(int r=1;r<=n;r++){
            for(int csp=1;csp<=nsp;csp++){
                System.out.print("  ");
            }
            for(int cst=1;cst<=nst;cst++){
                System.out.print("* ");
            }
            
            System.out.println();
            nsp++;
            nst=nst-2;
        }
    }


    public static void main(String[] args) {
        int n=input.nextInt();
        pattern_04(n);
    }
}