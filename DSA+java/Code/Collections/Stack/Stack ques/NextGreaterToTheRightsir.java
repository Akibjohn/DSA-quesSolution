import java.util.*;

public class NextGreaterToTheRightsir {
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,3 };
        // 2 4 5 5 6 1 2 5 6 6 9 1 1 9 -1
        display(ngr(arr));
    }

    public static int[] ngr1(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int ele = arr[i];
            if (st.isEmpty())
                ans[i] = -1;
            else if (st.peek() > ele)
                ans[i] = st.peek();
            else {
                while (!st.isEmpty() && st.peek() <= ele)
                    st.pop();
                ans[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(ele);
        }
        return ans;
    }

    public static int[] ngr(int[] arr) {
        int n = arr.length;
        int[] tempAns = new int[n*2];
        int[] temp=new int[n*2];
        for(int i=0;i<n;i++){
            temp[i]=arr[i];
        }
        int idx=0;
        for(int i=n;i<temp.length;i++){
            temp[i]=arr[idx++];
        }
        Stack<Integer> st = new Stack<>();
        for (int i = temp.length - 1; i >= 0; i--) {
            int ele = temp[i];
            if (st.isEmpty())
                tempAns[i] = -1;
            else if (st.peek() > ele)
                tempAns[i] = st.peek();
            else {
                while (!st.isEmpty() && st.peek() <= ele)
                    st.pop();
                tempAns[i] = st.isEmpty() ? -1 : st.peek();
            }
            st.push(ele);
        }
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            ans[i]=tempAns[i];
        }
        return ans;
    }

    public static void display(int[] arr) {
        for (int i : arr)
            System.out.print(i + " ");
        System.out.println();
    }
}
