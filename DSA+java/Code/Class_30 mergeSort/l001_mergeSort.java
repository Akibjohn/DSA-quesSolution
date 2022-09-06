import java.util.*;

public class l001_mergeSort {

    public static Scanner input = new Scanner(System.in);

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }

    public static int[] mergeSortArray(int[] arr1, int[] arr2) {

        int n = arr1.length, m = arr2.length;
        if (n == 0 || m == 0) {
            return n != 0 ? arr1 : arr2;
        }
        int i = 0, j = 0, k = 0;
        int len = n + m;
        int[] ans = new int[len];
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                ans[k++] = arr1[i++];
            } else {
                ans[k++] = arr2[j++];
            }
        }
        while (i < n) {
            ans[k++] = arr1[i++];
        }
        while (j < m) {
            ans[k++] = arr2[j++];
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] arr1 = new int[n];
        input(arr1);
        int m = input.nextInt();
        int[] arr2 = new int[m];
        input(arr2);
        print(mergeSortArray(arr1, arr2));

    }
}