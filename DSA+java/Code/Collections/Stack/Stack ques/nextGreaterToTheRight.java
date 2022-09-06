import java.util.*;
public class nextGreaterToTheRight {
    public static void main(String[] args) {
        int[] arr = { -1, 5, 4, 9, 7, 2, 1, 8, 3, 1, 3 };
        int[] ans=new int[arr.length];
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=arr.length-1;i>=0;i++){
            if(stack.isEmpty()){
                
                stack.push(arr[i]);
            }else if(stack.peek()>arr[i]){
                
                stack.push(arr[i]);
            }
            else {
                while(!stack.isEmpty() && stack.peek()<=arr[i]) stack.pop();
                
            }
            stack.push(arr[i]);

        }
        for(int i=arr.length-1;i>=0;i++){
            if(stack.isEmpty()){
                ans[i]=-1;
                stack.push(arr[i]);
            }else if(stack.peek()>arr[i]){
                ans[i]=stack.peek();
                stack.push(arr[i]);
            }
            else {
                while(!stack.isEmpty() && stack.peek()<=arr[i]) stack.pop();
                ans[i] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(arr[i]);

        }
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]+" ");
        }
    }
}