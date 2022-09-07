import java.util.*;

public class l002_intersection {

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

    public static void intersection(int[] arr1, int[] arr2) {

        int n = arr1.length, m = arr2.length;
        if(n==0 || m==0){
            System.out.println("empty");
        }

        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + ",");
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;

            } else {
                j++;
            }
        }

    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] arr1 = new int[n];
        input(arr1);
        int m = input.nextInt();
        int[] arr2 = new int[m];
        input(arr2);
        intersection(arr1, arr2);

    }
}
