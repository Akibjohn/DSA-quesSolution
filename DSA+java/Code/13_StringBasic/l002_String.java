import java.util.*;
public class l002_String {
    public static Scanner input =new Scanner(System.in);

    public static void test_1(String str){
        char ch=str.charAt(2);
        int len=str.length();
        str+=" Bye";
        String s=str.substring(3, 7+1);
        String s2=str.substring(3);
        System.out.println(s2);

    }
    public static void printAllSubString(String str){
        
        String s=str.substring(0,0+1);
        String s1=str.substring(0,1+1);
        String s2=str.substring(0,2+1);
        String s3=str.substring(0,3+1);
        String s4=str.substring(1,1+1);
        String s5=str.substring(1,2+1);
        String s6=str.substring(1,3+1);
        String s7=str.substring(2,2+1);
        String s8=str.substring(2,3+1);
        String s9=str.substring(3,3+1);
        System.out.println(s+", "+s1+", "+s2+","+s3+", "+s4+", "+s5+","+s6+", "+s7+", "+s8+","+s9);
    }

    public static void printAllSubString_1(String str){
        int len=str.length();
        for(int beginIndex=0;beginIndex<len;beginIndex++){
            for(int endIndex=beginIndex;endIndex<len;endIndex++){
                String s=str.substring(beginIndex, endIndex+1);
                System.out.println(beginIndex+","+endIndex+": "+s);
            }
        }
    }

     // https://codingbat.com/prob/p151940
     public String withoutX(String str) {
        if (str.length() == 0)
            return str;
        else if (str.length() == 1 && str.charAt(0) == 'x')
            return "";

        int lastIndex = str.length() - 1;
        int beginIndex = str.charAt(0) == 'x' ? 1 : 0;
        int endIndex = str.charAt(lastIndex) == 'x' ? lastIndex - 1 : lastIndex;

        return str.substring(beginIndex, endIndex + 1);
    }

    public int countHi(String str) {
        int i = 0, n = str.length(), count = 0;
        while (i < n) {
            if (str.charAt(i) == 'h') {
                if (i + 1 < n && str.charAt(i + 1) == 'i') {
                    count++;
                    i++;
                }
            }
            i++;
        }

        return count;
    }

    public static void main(String[] args){
        String s="abcd";
        // test_1(s);
        // String s="abcd";
        printAllSubString_1(s);

    }
    
}
