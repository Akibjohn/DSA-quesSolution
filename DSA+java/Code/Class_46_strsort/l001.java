import java.util.*;

public class l001 {
    public static Scanner input = new Scanner(System.in);

    // t: O(Nlog(N))
    public static String strSort(String str) {
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i]);
        }
        return sb.toString();

    }

    public static String makeString(char ch, int freq) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < freq; i++) {
            sb.append(ch);
        }
        return sb.toString();
    }

    // T: O(n)
    public static String strSort_02(String str) {
        int[] farr = new int[129];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            farr[ch]++;
        }

        for (int i = 0; i < farr.length; i++) {
            if (farr[i] > 0) {
                sb.append(makeString((char) i, farr[i]));
            }
        }
        return sb.toString();
    }
    // my method /
    public static boolean balanceString(String str) {
        int n = str.length();
        char[] ch = str.toCharArray();
        int si = 0, ei = n - 1, leftcount = 0, rightcount = 0;
        if (n % 2 != 0) {
            int mid = (si + ei) / 2;
            while (si <= mid) {
                leftcount += (int) (ch[si++] - '0');
            }
            while (mid <= ei) {
                rightcount += (int) (ch[mid++] - '0');
            }
        } else {
            int mid = (si + ei) / 2;
            while (si <= mid) {
                leftcount += (int) (ch[si++] - '0');
            }
            while (mid <= ei) {
                rightcount += (int) (ch[mid++] - '0');

            }
        }
        // System.out.println(leftcount);
        // System.out.println(rightcount);
        if (leftcount == rightcount) {
            return true;
        } else {
            return false;
        }

    }
    // sir method
     // String contains only and only numbers from 0 to 9
     public static boolean isBalanced(String str) {
        int n = str.length();
        int mid = (0 + n - 1) / 2;
        int i = n % 2 == 0 ? mid : mid - 1;
        int j = mid + 1;

        int sum1 = 0, sum2 = 0;
        while (i >= 0) {
            char ch1 = str.charAt(i--);
            char ch2 = str.charAt(j++);

            // convert char into digit
            int d1 = ch1 - '0';
            int d2 = ch2 - '0';

            // add up as a digit
            sum1 += d1;
            sum2 += d2;
        }

        if (n % 2 != 0) {
            sum1 += str.charAt(mid) - '0';
            sum2 += str.charAt(mid) - '0';
        }

        return sum1 == sum2;
    }

    public static boolean isPalindrom(String str){
        char[] arr=str.toCharArray();
        int n = str.length();
        int mid = (0 + n - 1) / 2;
        int p1 = n % 2 == 0 ? mid : mid - 1;
        int p2 = mid + 1;
        while(p1>=0){
            if(arr[p1--]!=arr[p2++]){
                return false;
            }
        }
        return true;
    }

    public static int parseStringintoInteger(String str){
        char[] arr=str.toCharArray();
        int n=arr.length-1,ans=0;
        for(int i=0;i<=n;i++){
        }
        return -1;
    }

    public static void main(String[] args) {
        String str = input.nextLine();
        // System.out.println(strSort(str));
        // System.out.println(strSort_02(str));
        // balanceString(str);
        System.out.println(isPalindrom(str));
    }
}