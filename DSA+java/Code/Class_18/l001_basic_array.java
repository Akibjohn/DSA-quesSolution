import java.util.*;
public class l001_basic_array{
    public static Scanner input=new Scanner(System.in);

    public static void input1D(int[] arr ){
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
    }

    public static void print1D(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }

    // return index if data found, if not then return -1;
    public static int findElement(int[] arr, int data) {
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                return (int) i;
            }
        }return -1;

    }

    public static int maxElem(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }return max;
        
    }

    public static int minElem(int[] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            min=Math.min(arr[i],min);
        }return min;
        
    }

    public static void main(String[] args){
        int n=input.nextInt();
        int[] arr=new int[n];
        input1D(arr);
        // int data=input.nextInt();
        // System.out.println(findElement(arr, data));
        // print1D(arr);
        System.out.println("maxElement: "+maxElem(arr));
        System.out.println("minElement: "+minElem(arr));
        

    }

}