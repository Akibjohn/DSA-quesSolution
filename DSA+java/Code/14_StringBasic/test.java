import java.util.*;

public class test {
    public static Scanner input = new Scanner(System.in);

    public static void printAllSubString(String str) {
        
        int len = str.length();
        int index = len - 1;
        for (int bi = 0; bi <= index; bi++) {
            for (int ei = bi; ei <= index; ei++) {
                String s = str.substring(bi, ei + 1);
                System.out.print(s + ",");
            }
        }
    }

    public static void main(String[] args) {
        String s=input.nextLine();
        printAllSubString(s);

    }
}