import java.util.*;

public class l001_binary_search {
    public static Scanner input = new Scanner(System.in);

    public static void input1D(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static int binarySearch(int[] arr, int data) {
        int n = arr.length, si = 0, ei = n - 1;

        while (si <= ei) {
            int mid = (si + ei) / 2;
            if (arr[mid] == data) {
                return mid;
            } else if (arr[mid] < data) {
                si = mid + 1;
            } else {
                ei = mid - 1;
            }
        }
        return -1;
    }

    public static void pairsum(int[] arr, int target) {
        int si = 0, ei = arr.length - 1;
        while (si < ei) {
            int sum = arr[si] + arr[ei];
            if (sum == target) {
                System.out.print(arr[si] + "," + arr[ei]);
                si++;
                ei--;
            } else if (sum < target) {
                si++;
            } else {
                ei--;
            }
        }
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] arr = new int[n];
        input1D(arr);
        // int data = input.nextInt();
        // int ans = binarySearch(arr, data);
        // System.out.println(ans);

        int target=input.nextInt();
        pairsum(arr, target);

    }

}