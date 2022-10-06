//    15   19  22  24  25
//    10   14  18  21  23
//     6   9   13  17  20
//     3   5   8   12  16
//     1   2   4   7   11


import java.util.*;
public class pattern{
    public static Scanner sc = new Scanner(System.in);
    public static int[][] GetDiagnolMatrix(int n){
        int[][] mat = new int[n][n];
        int r = 0,c=n-1;
        int val = n*n;
        while(c >= 0){
            r = 0;
            int copycol = c;
            while(r < mat.length && copycol < mat.length){
                mat[r][copycol] = val;
                val--;
                r++;
                copycol++;
            }
            c--;
        }
        r = 1;c = 0;
        while(r < mat.length){
            c = 0;
            int copyrow = r;
            while(copyrow < mat.length && c < mat.length){
                mat[copyrow][c] = val;
                val--;
                copyrow++;
                c++;
            }
            r++;
        }
        return mat;
    }
    // public static void solveinRow(int[][] mat,int r,int c,int val){
    //     while(r < mat.length){
    //         c = 0;
    //         int copyrow = r;
    //         while(copyrow < mat.length && c < mat.length){
    //             mat[copyrow][c] = val;
    //             val--;
    //             copyrow++;
    //             c++;
    //         }
    //         r++;
    //     }
    // }
    // public static void solveincolumn(int[][] mat,int r,int c,int val){
    //     while(c >= 0){
    //         r = 0;
    //         int copycol = c;
    //         while(r < mat.length && copycol < mat.length){
    //             mat[r][copycol] = val;
    //             val--;
    //             r++;
    //             copycol++;
    //         }
    //         c--;
    //     }
    // }
    public static void display(int[][] mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = sc.nextInt();
        int[][] ans = GetDiagnolMatrix(n);
        display(ans);
    }
}
