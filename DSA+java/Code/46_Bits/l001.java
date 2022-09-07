import java.util.*;

public class l001 {
    public static Scanner input = new Scanner(System.in);

    // Only for(+ve)
    public static String decimalToBinaryForPositives(int n) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // while (n > 0) {
        // int rem = n % 2;
        // arr.add(rem);
        // n = n / 2;
        // }
        // for (int i = arr.size() - 1; i >= 0; i--) {
        // System.out.print(arr.get(i));
        // }

        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            int rem = n % 2;
            sb.append(rem);
            n = n / 2;
        }
        return sb.reverse().toString();
    }

    public static String decimalToBinary(int n) {
        if(n > 0) return decimalToBinaryForPositives(n);
        else if (n == 0) return "0";
        else {
            int pos = -n; //sign change
            String conv = decimalToBinaryForPositives(pos);  //convert
            return twosCompliment(conv);  //twoscomplement
        }
    }

    public static String twosCompliment(String s) {
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()) 
            sb.append(c == '0' ? 1 : 0);
        String ans = binaryAddition(sb.toString(), "1"); 
        return "1" + ans;
        
    }

    public static String binaryAddition(String n1, String n2) {
        int i = n1.length() - 1, j = n2.length() - 1;
        int dig = 0, carry = 0;
        StringBuilder sb = new StringBuilder();
        while(i >= 0 || j >= 0) {
            int x = 0, y = 0;
            if(i >= 0) x = n1.charAt(i) - '0';
            if(j >= 0) y = n2.charAt(j) - '0';
            int sum = x + y + carry;
            dig = sum % 2;
            carry = sum / 2;
            sb.insert(0, dig);
            i --; j--;
        }
        if(carry > 0) sb.append(carry);
        return sb.toString();
    }

    public static int binaryToDecimalPositive(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        int ans=0;
        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='1'){
                ans+=Math.pow(2, i);
            }
        }
        return ans;

    }

    public static boolean checkBitOnOff(int num,int bp){
        int mask=(1<<bp);
        return (num & mask)==0? false:true;
        

    }

    public static int onnBit(int num,int bp){
        int mask=(1<<bp);
        return (num | mask);
    }

    public static int offBit(int num,int bp){
        int mask=(1<<bp);
        mask=(~mask);
        return (num & mask);
    }

    // on = off ;off =on;
    public static void toggleBit(int num,int n){

    }
   

    public static void main(String[] args) {
        // String str = input.nextLine();
        int n=input.nextInt();
        int m=input.nextInt();
        // System.out.println(convertDecimalToBinary(n));
        
        

    }
}