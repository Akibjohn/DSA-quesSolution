import java.util.*;

public class l001_prefix {
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

    public static void prefixArray(int[] arr) {
        int q = input.nextInt();
        int total = 0;
        while (q-- > 0) {
            int lr = input.nextInt();
            int rr = input.nextInt();
            while (lr <= rr) {
                int sum = arr[lr++];
                total += sum;
            }
            System.out.println(total);
            total = 0;
        }
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] arr = new int[n];
        input(arr);
        prefixArray(arr);
    }

}