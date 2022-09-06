import java.util.*;
public class l001_sorting{
    public static Scanner input=new Scanner(System.in);

    public static void input(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
    }

    public static void print(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }System.out.println();
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                }
            }
        }
    }

    public static void bubbleSort_optimize(int[] arr){
        boolean isArraySorted=true;
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length-i;j++){
                if(arr[j-1]>arr[j]){
                    swap(arr, j-1, j);
                    isArraySorted=false;
                }
            }
            if(isArraySorted) break;
        }
    }

    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }
    public static void main(String[] args){
        int n=input.nextInt();
        int[] arr=new int[n];
        input(arr);
        System.out.println("before Sorting");
        print(arr);
        System.out.println("after bubble sorting");
        bubbleSort(arr);
        print(arr);
        System.out.println("after selection sorting");
        selectionSort(arr);
        print(arr);

    }

}