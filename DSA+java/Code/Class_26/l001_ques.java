import java.util.*;

public class l001_ques {
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

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void new_sort(int[] arr, int p, int q) {
        int pt1 = 0, itr = 0, n = arr.length, pt2 = n - 1, p3 = pt2 - 1, p4 = pt1 + 1;
        while (itr <= pt2) {
            if (arr[itr] < p) {
                swap(arr, pt1++, itr++);
            } else if (arr[itr] == p) {
                swap(arr, itr++, p4);
            } else if (arr[itr] == q) {
                swap(arr, itr++, p3);
            } else if (arr[itr] > p && arr[itr] < q) {
                itr++;
            } else if (arr[itr] > q) {
                swap(arr, itr, pt2--);
                p3--;
            }
        }
    }

    public static void countOfPair(int[] arr, int target, int l, int r) {
        Arrays.sort(arr);
        int si = l, ei = r;
        while (si <=ei) {
            int sum = arr[si] + arr[ei];
            if (sum == target) {
                System.out.println(arr[si] + "," + arr[ei]);
                si++;
                ei--;
            } else if (sum < target)
                si++;
            else if (sum > target)
                ei--;

        }
    }

    

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] arr = new int[n];
        input(arr);
        // int p=input.nextInt();
        // int q=input.nextInt();
        // new_sort(arr, p, q);
        // print(arr);

        int target = input.nextInt();
        int l = input.nextInt();
        int r = input.nextInt();
        countOfPair(arr, target, l, r);
        // print(arr);

    }

}
