   import java.util.*;

public class l001_rotate_array {
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

    public static void swap(int[] arr, int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        
    }

    public static void reverseArray(int[] arr, int lb, int rb){
        while(lb<rb){
            swap(arr, lb++, rb--);
        }
    }

    public static int[] rotateArrayClock_01(int[] arr, int k) {
        int n = arr.length, idx = n - k;
        k%=n;
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ans[idx % n] = arr[i];
            idx++;

        }return ans;
    }

    public static int[] rotateArrayClock_anti(int[] arr,int k){
        int n=arr.length;
        k%=n;
        if(k<0) k+=n;
        swap(arr, 0, k-1);
        swap(arr, k, n-1);
        swap(arr, 0, n-1);
        return arr;
    } 

    public static int[] rotateArrayAnti(int[] arr,int k){
        int n=arr.length;
        k%=n;
        swap(arr, 0, n-1);
        swap(arr, 0, k-1);
        swap(arr, k, n-1);
        
        return arr;
    } 

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] arr = new int[n];
        input(arr);
        int k = input.nextInt();

        print(rotateArrayClock_anti(arr, k));

    }

}
