import java.util.*;

public class l001 {
    public static Scanner scn = new Scanner(System.in);

    public static int[][] input2d() {
        int[][] arr = new int[scn.nextInt()][scn.nextInt()];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        return arr;
    }

    public static boolean specialsearch(int[][] matrix, int target) {
        int r = 0, n = matrix.length;
        int m = matrix[0].length - 1;
        while (r < n && m >= 0) {
            if (matrix[r][m] == target) {
                return true;
            } else if (matrix[r][m] > target) {
                m--;
            } else {
                r++;
            }

        }
        return false;
    }

    public static boolean binarySearch(int[] arr, int data) {
        int n = arr.length, si = 0, ei = n - 1;
        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data)
                return true;
            else if (arr[mid] < data)
                si = mid + 1;
            else
                ei = mid - 1;
        }
        return false;
    }

    public static boolean searchMatrix_02(int[][] matrix, int target) {
        int n = matrix.length, m = matrix[0].length;
        for (int r = 0; r < n; r++) {
            if (matrix[r][0] <= target && target <= matrix[r][m - 1]) {
                if (binarySearch(matrix[r], target))
                    return true;
            }
        }
        return false;
    }

    

    public static void main(String[] args) {
        int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 2, 23, 26, 30 } };
        int data = 3;

    }
}