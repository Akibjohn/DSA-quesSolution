import java.util.*;
public class l001_array_ques{
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

    public static boolean palindrom(int[] arr){
        // my code
        // int index=arr.length-1;
        // if(index%2==0){
        //     for(int i=0;i<=index/2;i++){
        //         for(int j=index;j>index/2;j--){
        //             if(arr[i]==arr[j]) return true;
        //         }
        //     }
        // }
        // else if (index%2!=0){
        //     for(int i=0;i<=index/2;i++){
        //         for(int j=index;j>index/2;j--){
        //             if(arr[i]==arr[j]) return true;
        //         }
        //     }
        // }return false;

        // code sir
        int i=0,j=arr.length-1;
        while(i<j){
            if(arr[i]==arr[j]) return true;
            i++;
            j--;
        }return false;
    }

    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    public static void reverse(int[] arr){
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr, i++, j--);
        }
    }

    public static int[] inverse(int[] arr){
        int n=arr.length;
        int[] ans =new int[n];
        for(int i=0;i<n;i++){
            ans[arr[i]]=i;
        }
        return ans;
    }
        
    

    public static void main(String[] args){
        // int n=input.nextInt();
        // int[] arr=new int[n];
        // input1D(arr);
        // int data=input.nextInt();
        // System.out.println(findElement(arr, data));
        // print1D(arr);
        // System.out.println("maxElement: "+maxElem(arr));
        // System.out.println("minElement: "+minElem(arr));
        // System.out.println(palindrom(arr));
        // reverse(arr);
        // print1D(arr);
        int[] arr={0,2,1,4,3};
        
        print1D(inverse(arr));
        

    }

}