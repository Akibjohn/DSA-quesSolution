import java.util.*;
public class nonZero {

    public static Scanner input = new Scanner(System.in);

    public static void input(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void pivot_sort(int[] arr ) {
        int pt1 = 0, itr = 0, n = arr.length;
        while (itr <n) {
            if(arr[itr]!=0){
                swap(arr, pt1++,itr);
            }itr++;
        }
    }

    public static void main(String[] args){

        int n = input.nextInt();
        int[] arr = new int[n];
        input(arr);
        pivot_sort(arr);
        print(arr);

        
    }
    
}
