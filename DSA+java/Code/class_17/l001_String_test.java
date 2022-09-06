import java.util.*;
public class l001_String_test{
    public static Scanner input=new Scanner(System.in);

    public static void main(String[] args){
        String str=input.nextLine();
        char ch=input.next().charAt(0);
        int count=0;
        for(int i=0;i<str.length();i++){
            char s=str.charAt(i);
            if (s==ch) count++;
        }System.out.println(count);
    }
}