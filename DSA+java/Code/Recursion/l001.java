

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

    public static void main(String[] args) {
        int x=2;
        int n=5;
        // printIncreasing(n);
        // printDicreasing(n);
        // pattern(n);
        System.out.println(power(x, n));
        power(x, n, 1);;
    }
}