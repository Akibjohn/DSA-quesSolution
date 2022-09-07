import java.util.*;

public class l002_calculator{

    public static Scanner input = new Scanner(System.in); // global

    public static int add(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public static int div(int a,int b){
        return a/b;
    }
    public static int power(int a,int b){
        return (int) Math.pow(a,b);
    }
    public static int rem(int a,int b){
        return a%b;
    }
    public static int calculator(int a,char ch,int b){
        if(ch=='+') 
            return add(a,b);
        else if(ch=='-')
            return sub(a,b);
        else if(ch=='*')
            return mul(a,b);
        else if(ch=='/')
            return div(a,b);
        else if(ch=='^')
            return power(a,b);
        else if(ch=='%')
            return rem(a,b);
        else{
            System.out.println("invalid input");
            return -1;
        }

    }


    public static void main(String[] args) {
        char ch=input.next().charAt(0);
        int a=input.nextInt();
        int b=input.nextInt();
       
        int ans=calculator(a,ch,b);
        System.out.println(ans);
       }


}