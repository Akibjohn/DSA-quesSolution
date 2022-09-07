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

    public static void pivot_sort(int[] arr , int data) {
        int pt1 = 0, itr = 0, n = arr.length,pt2=n-1;
        while (itr <=pt2) {
            if(arr[itr]<data){
                swap(arr, pt1++,itr++);
            }else if(arr[itr]==data){
                itr++;
            }else if(arr[itr]>data){
                swap(arr, itr, pt2--);
            }
        }
    }

    public static int pivot_sort_02(int[] arr , int data) {
        int pt1 = 0, itr = 0, n = arr.length,pt2=n-1;
        
        while (itr <=pt2) {
            if(arr[itr]<data){
                swap(arr, pt1++,itr++);
            }else if(arr[itr]==data){
                itr++;
                
            }else if(arr[itr]>data){
                swap(arr, itr, pt2--);
            }
        }
        return pt2;
    }

    

    public static void main(String[] args) {
        int n = input.nextInt();
        int[] arr = new int[n];
        input(arr);
        int data=input.nextInt();
        pivot_sort(arr, data);
        System.out.println(pivot_sort_02(arr, data));
        print(arr);
         
        
    }

}

