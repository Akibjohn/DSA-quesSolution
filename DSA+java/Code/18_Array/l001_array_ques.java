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
    public static int[] sumOfTwoArrays(int[] A,int[] B){
        
        int a=A.length, b=B.length;
        int len=Math.max(a, b)+1;
        int[] ans=new int[len];
        int i=a-1,j=b-1,k=len-1,carry=0;
        while(i>=0 || j>=0 || carry!=0){
            int sum=(i>=0? A[i]:0)+(j>=0? B[j]:0)+carry;
            int digit=sum%10;
            carry=sum/10;
            ans[k-1]=digit;
            i--;
            j--;
        }return ans;

    }

    public static void sumOfTwoArraysProgram(){
        int n=input.nextInt();
        int[] A=new int[n];
        input1D(A);

        int m=input.nextInt();
        int[] B=new int[m];
        input1D(B);
        int[] ans = sumOfTwoArrays(A, B);
        print1D(ans);

    }

    public static int[] diffOfTwoArrays(int[] A,int[] B){
        

    }
    
    public static void diffOfTwoArraysprogram(){
        int n=input.nextInt();
        int[] A=new int[n];
        input1D(A);

        int m=input.nextInt();
        int[] B=new int[m];
        input1D(B);
        int[] ans=diffOfTwoArrays(A, B);
        print1D(ans);
    } 

    public static void main(String[] args){
        // sumOfTwoArraysProgram();
        diffOfTwoArraysprogram();
        
    }

}