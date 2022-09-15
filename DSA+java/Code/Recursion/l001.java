
import java.util.*;
public class l001{
    public static void printIncreasing(int n){
        if(n==0) return;
        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void printDicreasing(int n){
        if(n==0) return;
        System.out.println(n);
        printDicreasing(n-1);
        
        
    }
    // 5 4 3 2 1 1 2 3 4 5
    public static void pattern(int n){
        if(n==0) return;
        System.out.println(n);
        pattern(n-1);
        System.out.println(n);
        
    }
    public static int power(int x, int n){
        if(n==1) return x;
        int ans=power(x, n-1);
        int finalAns=ans*x;
        return finalAns;
    }
    
    public static void power(int x, int n ,int ans){
        if(n==0) {
            System.out.println(ans);
            return ;
        }
        power(x, n-1, ans*x);
    }
    
    public static void printArr(int[] arr, int i){
        if(i==-1){
            return;
        }
        printArr(arr, i-1);
        System.out.println(arr[i]);
    }
    public static int maxArr(int[] arr,int i){
        if(i==0){
            return arr[i];
        }
        int max=maxArr(arr, i-1);
        int finalmax=Math.max(max, arr[i]);
        return finalmax;
        
    }

    public static int minArr(int[] arr,int i){
        if(i==0){
            return arr[i];
        }
        int min=minArr(arr, i-1);
        int finalmin=Math.min(min, arr[i]);
        return finalmin;
        
    }
    public static void puzzle(int n){
        if(n<=1){
            System.out.println("Base: " + n);
            return;
        }
        System.out.println("pre: " +n);
        puzzle(n-1);
        System.out.println("In :" +n);
        puzzle(n-2);
        System.out.println("post : "+n);

    }
    public static int fibonacci(int n){
        if(n==0) return 0;
        if(n==1) return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }

    public static void main(String[] args) {
        // int x=2;
        // int n=5;
        // int[] arr={1 , 2, 100, 6,0,5};
        // int i=arr.length-1;
        // printArr(arr, i);
        // System.out.println(maxArr(arr, i));
        // System.out.println(minArr(arr, i));
        // puzzle(5);
        // printIncreasing(n);
        // printDicreasing(n);
        // pattern(n);
        // System.out.println(power(x, n));
        // power(x, n, 1);;
        System.out.println(fibonacci(7));
    }
}