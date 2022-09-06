import java.util.*;

public class l001_questions {
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

    public static int maximum(int[] arr) {
        int maxvalue = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            maxvalue = Math.max(arr[i], maxvalue);
        }
        return maxvalue;

    }

    public static int minimum(int[] arr) {
        int minvalue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            minvalue = Math.min(arr[i], minvalue);
        }
        return minvalue;

    }

    // O(2*N)
    public static int findDiffrence_01(int[] arr) {
        int max = maximum(arr);
        int min = minimum(arr);
        return max - min;

    }

    // O(1*N)
    public static int findDiffrence_02(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
        return max - min;
    }

    public static void printPeakEle(int[] arr) {
        if (arr.length < 3)
            System.out.println("array length is less then 3");

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + ",");
            }
        }
    }

    public static int countPeakEle(int[] arr) {
        if (arr.length < 3)
            return 0;
        int count = 0;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1])
                count++;
        }
        return count;
    }

    public static boolean checkIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i])
                return false;
        }

        return true;
    }

    public static boolean checkDecreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i])
                return false;
        }

        return true;
    }

    // HW
    public static boolean checkMountain(int[] arr) {
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i - 1] > arr[i] && arr[i] < arr[i + 1])
                return true;
        }
        return false;
    }

    public static boolean checkArrayisIncreasingSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
                return true;
        }
        return false;
    }

    public static int peakIndexMountainInArray(int[] arr) {
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1])
                return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] arr = new int[n];
        input(arr);

        // System.out.println(maximum(arr));
        // System.out.println(minimum(arr));

        // System.out.println(findDiffrence_01(arr));

        // System.out.println(findDiffrence_02(arr));

        // printPeakEle(arr);

        // System.out.println(countPeakEle(arr));
        // checkArrayisIncreasingSorted(arr);
        // System.out.println(peakIndexMountainInArray(arr));
        // if (checkMountain(arr) == true)
        //     System.out.println("yes");
        // else
        //     System.out.println("no");

    }
}