import java.util.*;

public class l001_2darrayQuestion {
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

    public static void swap(int[][] arr, int i_1, int j_1, int i_2, int j_2) {
        // int temp = arr[i_1][j_1];
        // arr[i_1][j_1] = arr[i_2][j_2];
        // arr[i_2][j_2] = temp;

        int temp = arr[i_2][j_2];
        arr[i_2][j_2] = arr[i_1][j_1];
        arr[i_1][j_1] = temp;

    }

    public static int[][] transpose(int[][] arr) {
        // for(int r=0;r<arr.length;r++){
        // for(int c=0;c<arr[0].length;c++){
        // if(r<c){
        // swap(arr, r, c, c, r);
        // }
        // }
        // }print2d(arr);

        for (int r = 0; r < arr.length; r++) {
            for (int c = r + 1; c < arr[0].length; c++) {
                swap(arr, r, c, c, r);
            }
        }
        return arr;

    }

    public static void swapCol(int[][] arr, int c1, int c2) {
        for (int r = 0; r < arr.length; r++) {
            swap(arr, r, c1, r, c2);
        }
    }

    public static void swapRow(int[][] arr, int r1, int r2) {
        int[] temp = arr[r1];
        arr[r1] = arr[r2];
        arr[r2] = temp;
    }

    // o(n*m) ; n=row ,m=col
    public static void reverseMatrixCol(int[][] arr) {
        int n = arr.length, i = 0, j = n - 1;
        while (i < j) {
            swapCol(arr, i++, j--);
        }
    }

    public static void reverseMatrixRow(int[][] arr) {
        int n = arr.length, i = 0, j = n - 1;
        while (i < j) {
            swapRow(arr, i++, j--);
        }
    }

    public static void rotatematrixclock(int[][] arr) {
        transpose(arr);
        reverseMatrixCol(arr);

    }

    public static void rotatematrixanticlock(int[][] arr) {
        transpose(arr);
        reverseMatrixRow(arr);

    }

    public static boolean sameMatrix(int[][] m1, int[][] m2) {
        if (m1.length != m2.length || m1[0].length != m2[0].length)
            return false;
        int n = m1.length, m = m1[0].length;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                if (m1[r][c] != m2[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int sumOfRow(int[][] matrix, int r) {
        int sum = 0;
        for (int c = 0; c < matrix[0].length; c++) {
            sum += matrix[r][c];
        }
        return sum;

    }

    public static boolean equalSum(int[][] matrix) {
        if (matrix.length == 0)
            return true;
        for (int r = 1; r < matrix.length; r++) {
            int sum1 = sumOfRow(matrix, r - 1);
            int sum2 = sumOfRow(matrix, r);
            if (sum1 == sum2) {
                return true;
            }
        }
        return false;

    }

    public static void traverseRow(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int r = 0, c = 0;
        while (c < m) {
            if (r == n - 1) {
                r--;
            } else if (r == 0) {
                r++;
            }
            System.out.print(matrix[r][c] + " ");
        }
    }

    public static boolean identityMatrix(int[][] matrix) {
        if (matrix.length == 1 && matrix[0][0] == 1)
            return true;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix[0].length; c++) {
                if (r == c && matrix[r][c] != 1) {
                    return false;
                } else if (matrix[r][c] != 0) {
                    return false;
                }

            }
        }

        return true;
    }

    public static boolean symantricmatrix(int[][] matrix) {
        for (int r = 0; r < matrix.length; r++) {
            for (int c = r + 1; c < matrix.length; c++) {
                if (matrix[r][c] == matrix[c][r]) {
                    return true;

                }
            }
        }
        return false;

    }

    public static void printDiagonal(int[][] matrix, int r, int c) {
        int n = matrix.length, m = matrix[0].length;
        while (r < n && c < m) {
            System.out.print(matrix[r][c] + " ");
            r++;
            c++;
        }
        System.out.println();

    }

    public static void printupperDiagonal(int[][] matrix) {
        int m = matrix[0].length;
        for (int i = 0; i < m; i++) {
            printDiagonal(matrix, 0, i);
        }
    }

    public static void waveColumn(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        for (int c = 0; c < m; c++) {
            if (c % 2 == 0) {
                for (int r = 0; r < n; r++) {
                    System.out.print(matrix[r][c] + " ");
                }
            } else {
                for (int r = n - 1; r >= 0; r--) {
                    System.out.print(matrix[r][c] + " ");
                }
            }
        }

    }

    public static void waveRow(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        for (int r = 0; r < n; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < m; c++) {
                    System.out.print(matrix[r][c] + " ");
                }
            } else {
                for (int c = m - 1; c >= 0; c--) {
                    System.out.print(matrix[r][c] + " ");
                }
            }
        }

    }

    public static void mulOfTwoMatrix(int[][] m1,int[][] m2){


    }

    

    public static void main(String[] args) {
        int n = input.nextInt();
        int m = input.nextInt();
        int[][] arr = new int[n][m];
        input2d(arr);

        // System.out.println("transpose_matrix");
        // transpose(arr);
        // swapRow(arr, 1, 2);
        // print2d(arr);
        // reverseMatrixCol(arr);
        // print2d(arr);
        // rotatematrixanticlock(arr);
        // print2d(arr);

        // int n1 = input.nextInt();
        // int m1 = input.nextInt();
        // int[][] arr1 = new int[n1][m1];
        // input2d(arr1);
        // System.out.println(sameMatrix(arr, arr1));

        // System.out.println(equalSum(arr));
        // traverseRow(arr);
        // System.out.println(identityMatrix(arr));
        // System.out.println(symantricmatrix(arr));
        // printupperDiagonal(arr);
        // System.out.println("wave column");
        // waveColumn(arr);
        // System.out.println("wave Row");
        // waveRow(arr);

    }

}