import java.util.*;

public class l001_regionSort {
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

    public static void regionSort_0_1(int[] arr) {
        int pt = -1, itr = 0, n = arr.length;
        while (itr < n) {
            if (arr[itr] == 0) {
                swap(arr, ++pt, itr);
            }
            itr++;
            
        }
    }

    public static void regionSort_0_1_2(int[] arr) {
        int pt1 = -1, itr = 0, n = arr.length, pt2 = n - 1;
        while (itr <=pt2) {
            if (arr[itr] == 0) {
                swap(arr, ++pt1, itr++);
            } else if (arr[itr] == 1) {
                itr++;
            } else if (arr[itr] == 2) {
                swap(arr, itr, pt2--);
            }

           
        }
    }

    public static void evenOddArray(int[] arr) {
        int pt = 0, itr = 0, n = arr.length;
        while (itr < n) {
            if(arr[itr]%2==0){
                swap(arr, itr++, pt++);
            }
            itr++;
        }
    }

    public static void main(String[] args) {
        // int n = input.nextInt();
        // int[] arr = new int[n];
        // input(arr);
        // regionSort_0_1(arr);
        // // regionSort_0_1_2(arr);
        // evenOddArray(arr);
        // print(arr);
        
    }

}
