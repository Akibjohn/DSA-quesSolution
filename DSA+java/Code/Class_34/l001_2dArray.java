import java.util.*;

public class l001_2dArray {

    public static Scanner scn = new Scanner(System.in);

    public static boolean find(int[][] arr, int data) {
        int n = arr.length, m = arr[0].length;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (arr[r][c] == data) {
                    return true;
                }

            }
        }
        return false;

    }

    public static int maximum(int[][] arr) {
        int n = arr.length, m = arr[0].length, max = Integer.MIN_VALUE;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                max = Math.max(max, arr[r][c]);

            }
        }
        return max;

    }

    public static int minimum(int[][] arr) {
        int n = arr.length, m = arr[0].length, min = Integer.MAX_VALUE;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                min = Math.min(min, arr[r][c]);

            }
        }
        return min;

    }

    public static int sumOfAllElements(int[][] arr) {
        int n = arr.length, m = arr[0].length, sum = 0;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                sum += arr[r][c];

            }

        }
        return sum;

    }

    public static void input2d(int[][] arr) {
        int n = arr.length, m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
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

    // min(n,m)
    public static void printDiagonal(int[][] matrix) {
        int r = 0, c = 0;
        while (r < matrix.length && c < matrix[r].length) {
            System.out.print(matrix[r++][c++] + " ");
        }
        System.out.println();
    }

    public static void sumOfTwoMtrix(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length, m = matrix1[0].length;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                matrix1[r][c] += matrix2[r][c];

            }
        }

    }

    {
        String s = "Hello how are you WhAt is this";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u'
                    || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O'
                    || s.charAt(i) == 'U') {
                System.out.println("Found vowel " + s.charAt(i) + " at position " + i);
            }

        }
    }

    public static void diffOfTwoMtrix(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length, m = matrix1[0].length;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                matrix1[r][c] -= matrix2[r][c];
            }
        }

    }

    public static void main(String[] args) {
        System.out.println("enter first matrix");
        int n = scn.nextInt(), m = scn.nextInt();
        int[][] arr1 = new int[n][m];
        input2d(arr1);

        System.out.println("enter second matrix");
        // int n1 = scn.nextInt(), m2 = scn.nextInt();
        int[][] arr2 = new int[n][m];
        input2d(arr2);

        // System.out.println(find(arr, scn.nextInt()));
        // System.out.println(maximum(arr));
        // System.out.println(minimum(arr));
        // System.out.println(sumOfAllElements(arr));
        // printDiagonal(arr);
        System.out.println("sum ");
        sumOfTwoMtrix(arr1, arr2);
        print2d(arr1);
        System.out.println("diff ");
        diffOfTwoMtrix(arr1, arr2);
        print2d(arr1);
    }

}