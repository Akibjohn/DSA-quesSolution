import java.util.*;

public class l001_2darray {
    public static Scanner input = new Scanner(System.in);
    

    public static void input2d(int[][] arr1) {
        for (int r = 0; r < arr1.length; r++) {
            for (int c = 0; c < arr1[r].length; c++) {
                arr1[r][c] = input.nextInt();
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

    public static void main(String[] args) {
        int n=input.nextInt();
        int m=input.nextInt();
        int[][] arr=new int[n][m];
        input2d(arr);
        print2d(arr);

    }
}