import java.util.*;

public class l001_multiplication {
    public static Scanner input = new Scanner(System.in);

    public static void input2d(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = input.nextInt();
            }
        }
    }

    public static void print2d(int[][] arr) {
        for (int r = 0; r < arr.length; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] matrixMultiplication(int[][] A, int[][] B) {
        int n = A.length, m = A[0].length, p = B.length, q = B[0].length;
        if (m != p)
            return null;

        int[][] ans = new int[n][q];
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                int res = 0;
                for (int k = 0; k < m; k++) {
                    res += A[i][k] * B[k][j];
                }
                ans[i][j] = res;
            }
        }

        return ans;
    }
    

    public static void main(String[] args) {
        int n=input.nextInt();
        int m=input.nextInt();
        int[][] arr1=new int[n][m];
        input2d(arr1);

        int n1=input.nextInt();
        int m1=input.nextInt();
        int[][] arr2=new int[n1][m1];
        input2d(arr2);

        
       print2d( matrixMultiplication(arr1, arr2));
       
        

    }
}