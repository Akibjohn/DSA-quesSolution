import java.util.*;
public class ques{
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr={ 1, 3 ,-2 ,4 ,-1};
        int n=arr.length;
        int[] leftMax=new int[n];
        leftMax[0]=arr[0];
        for(int i=1;i<n;i++){
            leftMax[i]=arr[i]+leftMax[i-1];
        }
        
        
        int[] rightMax=new int[n];
        rightMax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            rightMax[i]=arr[i]+rightMax[i+1];
        }
       
        int[] ans=new int[n];
        int finalAns=0;
        for(int i=0;i<n;i++){
            ans[i]=Math.max(leftMax[i], rightMax[i]);
            finalAns=Math.max(ans[i], finalAns);
        }
        System.out.println(finalAns);
    }
}