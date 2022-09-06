import java.util.*;

public class l001 {
    public static Scanner input = new Scanner(System.in);

    public static int countVowel(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            // if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' ||
            // str.charAt(i)=='o' || str.charAt(i)=='u'){
            // count++;
            // }

            if (str.charAt(i) == 'a') {
                count++;
            } else if (str.charAt(i) == 'e') {
                count++;
            } else if (str.charAt(i) == 'i') {
                count++;
            } else if (str.charAt(i) == 'o') {
                count++;
            } else if (str.charAt(i) == 'u') {
                count++;
            }

        }
        return count;

    }

    public static int countConst(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
            } else {
                count++;
            }

        }
        return count;

        // return str.length()-countVowel(str);

    }

    public static void printReverseString(String str) {
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }

    }

    public static int countSpace(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    public static void printAlternate(String str) {
        for (int i = 0; i < str.length(); i += 2) {
            System.out.print(str.charAt(i));
        }
    }

    public static boolean isMultipleOf3(String str) {
        int n = str.length();
        if (n % 3 == 0) {
            return true;
        }

        return false;
    }

    public static void printSubStringLength3(String str) {
        int i = 0, n = str.length();
        while (n >= 3) {
            System.out.println(str.substring(i, i + 3));
            i += 3;
            n -= 3;
        }

    }

    public static int countLowerCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                count++;
            }
        }
        return count;

    }

    public static int countUpperCase(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                count++;
            }
        }
        return count;

    }

    public static String allLowerCaseToUpperCase(String str) {
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ans += (char) (ch - 'a' + 'A');

            }else{
                ans+=ch;
            }
        }
        return ans;

    }

    public static String allUpperCaseToLowerCase(String str) {
        String ans = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ans += (char) (ch - 'A' + 'a');

            }else{
                ans+=ch;
            }
        }
        return ans;

    }
 
    // aQIbshEkh -> AqiBSHeKH 
    public static String toggelCase(String str){
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z'){
                ans+=(char)(ch-'a'+'A');
            }
            else if(ch>='A' && ch<='Z'){
                ans+=(char)(ch-'A'+'a');
            }
        }
        return ans;

    }

    

    public static String[] split(String str, char regex_ch) {
        ArrayList<String> list = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (ch != regex_ch)
                sb.append(ch);

            if (ch == regex_ch || i == n - 1) {
                list.add(sb.toString());
                sb = new StringBuilder();
            }
        }

        String[] ans = new String[list.size()];
        int i = 0;
        for (String s : list)
            ans[i++] = s;

        return ans;
    }

    // my name is aqib -> aqib name is my 
    public static String reverseSantance(String str){
        String[] arr=str.split(" ");
        StringBuilder sb=new StringBuilder();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            sb.append(arr[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    // my name is aqib ->biqa si eman my

    public static String reverseWordString(String str){
        String[] arr=str.split(" ");
        StringBuilder sb=new StringBuilder();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            String str1=arr[i];
            for(int j=str1.length()-1;j>=0;j--){
                char ch=str1.charAt(j);
                sb.append(ch);
            }
            if(i!=0){
                sb.append(" ");
            }
            
        }

        return sb.toString();
    }



    public static void main(String[] args) {
        String str = input.nextLine();
        // String str="abcdefgh";
        // System.out.println("count Vowels: "+ countVowel(str));
        // System.out.println("Count Constant: "+ countConst(str));
        // System.out.print("Reverse String: ");
        // printReverseString(str);
        // System.out.println();
        // System.out.println("Count Space: "+countSpace(str));
        // System.out.print("Print alternate: ");
        // printAlternate(str);
        // System.out.println("print Substring: ");
        // printLength3(str);

        // System.out.println(isMultipleOf3(str));
        // printSubStringLength3(str);
        // System.out.println("Count Upper: " + countUpperCase(str));
        // System.out.println("Count lower: " + countLowerCase(str));
        // System.out.println("lower To Upper: "+allLowerCaseToUpperCase(str));
        // System.out.println("Upper To lower: "+allUpperCaseToLowerCase(str));
        // System.out.println("Toggle: "+toggelCase(str));
        System.out.println(reverseSantance(str));
        System.out.println(reverseWordString(str));
    }
}