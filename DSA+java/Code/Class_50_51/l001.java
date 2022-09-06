import java.util.*;

public class l001 {
    public static Scanner input = new Scanner(System.in);

    public static int minVlaue(int n, int m) {
        return n < m ? n : m;
    }

    public static int maxVlaue(int n, int m) {
        return n > m ? n : m;
    }

    public static int minValueArr(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
        }
        return min;
    }

    public static int maxValueArr(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    public static int floor(double n){
        return n<0.0? (int) n-1:(int)n;
    }

    public static int floorArr(int[] arr, int n){
        boolean flag=false;
        int floor =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<=n){
                flag=true;
                floor=Math.max(floor,arr[i]);
            }
        }
        return flag==true?floor:-1;
    }
    public static int ceilArr(int[] arr, int n){
        boolean flag =false;
        int ceil =Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=n){
                flag=true;
                ceil=Math.min(ceil,arr[i]);
            }
        }
        return flag==true? ceil:-1;
    }
    // O(n)
    public static int power_01(int x,int n){
        int ans=1;
        for(int i=0;i<n;i++){
            ans*=x;
        }
        return ans;
    }

    // power Olog(n)
    public static int power_02(int x, int n) {
        int ans = 1;
        if(n==0){
            return ans;
        }
        while (n > 1) {
            if (n % 2 != 0) {
                ans = ans * x;
                n--;

            } else {
                x = x * x;
                n = n / 2;
            }
        }
        ans = ans * x;
        return ans;
    }

    // i*i<=n ; i=underroot n T:O(root n)
    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;

        }
        return true;

    }

    public static void printPrimeFactors(int n) {
        int i = 2;
        while (n > 1) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int x = input.nextInt();
        int n = input.nextInt();
        // System.out.println(power(x, n));
        // printPrimeFactors(x);
        // System.out.println(minVlaue(2, 5));
        // System.out.println(minValueArr(new int[] {1,3,5,-1,2,3}));
        // System.out.println(power_01(2, 3));
        // System.out.println(floor(-100.0));
        // System.out.println(floorArr(new int[] {1,3,5,-1,2,3}, -2));
        // System.out.println(ceilArr(new int[] {1,3,5,-1,2,3}, 10));
        System.out.println(power_02(x, n));

    }
}