import java.util.*;
public class stockSpan {
    public static int[] stock(int[] arr){
        Stack<Integer> st = new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(st.isEmpty()){
                ans[i]=-1;
                st.push(-1);
            }else if(arr[st.peek()]>arr[i]){
                ans[i]=st.peek();
                st.push(i);
            }
            else {
                while(!st.isEmpty() && arr[st.peek()]<=arr[i]) st.pop();
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(arr[i]);
                
        }
    }
    
}
