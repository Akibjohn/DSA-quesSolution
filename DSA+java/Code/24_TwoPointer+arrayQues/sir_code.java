import java.util.*;

public class sir_code {
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void sortEvenOdd(int[] arr) {
        int n = arr.length, p = -1, itr = 0;
        while (itr < n) {
            if (arr[itr] % 2 == 0) {
                swap(arr, itr, ++p);
            }
            itr++;
        }
    }

    public static int pivotIndex(int[] arr, int data) {
        int n = arr.length, p = -1, itr = 0;
        int idx = n - 1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == data) {
                idx = i;
                break;
            }
        }
        swap(arr, idx, n - 1);

        while (itr < n) {
            if (arr[itr] <= data) {
                swap(arr, itr, ++p);
            }
            itr++;
        }

        return p;
    }

    public static void sortRegion(int[] arr, int leftDataB, int rightDataB) {
        int n = arr.length, p1 = -1, itr = 0, p2 = n - 1;
        while (itr <= p2) {
            if (arr[itr] <= leftDataB)
                swap(arr, itr++, ++p1);
            else if (arr[itr] >= rightDataB)
                swap(arr, itr, p2--);
            else
                itr++;
        }

        System.out.println("(" + (p1 + 1) + ", " + (itr - 1) + ") ");
    }

    public static void printAllPairs(int[] arr, int target, int lr, int rr) {
        Arrays.sort(arr);
        while (lr < rr) {
            int sum = arr[lr] + arr[rr];
            if (sum == target) {
                System.out.println("(" + arr[lr] + ", " + arr[rr] + ") ");
                lr++;
                rr--;
            } else if (sum < target) {
                lr++;
            } else {
                rr--;
            }
        }
    }

    

    public static void main(String[] args) {

    }

}
    

