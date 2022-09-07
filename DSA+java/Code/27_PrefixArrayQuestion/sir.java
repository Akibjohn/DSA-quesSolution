import java.util.*;

public class sir {
    private static Scanner scn = new Scanner(System.in);


    public static void prefixArray(int[] arr) {
        int n = arr.length;
        int[] parr = new int[n + 1];
        for (int i = 0; i < n; i++) {
            parr[i + 1] = parr[i] + arr[i];
        }

        int q = scn.nextInt();
        while (q-- > 0) {
            int lr = scn.nextInt(), rr = scn.nextInt();
            int sum = parr[rr + 1] - parr[lr];
            System.out.println(sum);
        }
    }

    public static void print(int[] arr) {
        for (int ele : arr)
            System.out.print(ele + " ");

        System.out.println();

    }

    public static void main(String[] args) {

        
        int[] arr = { 4, 6, 8, 9, 7, 10, 12, 13, 16, 17, 22 };
        prefixArray(arr);
    }
}