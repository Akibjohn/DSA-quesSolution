
import java.util.*;

public class nQueens {

    public static Scanner scn=new Scanner(System.in);
    public static boolean valid_direction(int[][] chess,int row,int col)
    {
        int n=chess.length;
        for(int i=0;i<n;++i) // yaha pe humne poori row and poori column ko traverse kar liya h
        {
            if(chess[i][col]==1 || chess[row][i]==1)
            {
                return false;
            }
        }
        int i,j;
        for(i=row,j=col;i>=0 && j>=0;i--,j--) //Direction 1: upper left diagonal traverse horaha h
        {
            if(chess[i][j]==1)
            {
                return false;
            }
        }
        for(i=row,j=col;i>=0 && j<n;i--,j++)//Direction:2 upper right diagonal traverse horaha h
        {
            if(chess[i][j]==1)
            {
                return false;
            }
        }
        for(i=row,j=col;i<n && j<n;i++,j++) //Direction:3 lower right diagonal traverse horaha h
        {
            if(chess[i][j]==1)
            {
                return false;
            }
        }
        for(i=row,j=col;i<n && j>=0;i++,j--)//Direction:4 lower left diagonal traverse horaha h
        {
            if(chess[i][j]==1)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n=scn.nextInt();
        int[][] chess=new int[n][n];
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
            {
                chess[i][j]=scn.nextInt();
            }
        }
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
            {
                if(chess[i][j]==1)
                {
                    chess[i][j]=0;
                    boolean ans=valid_direction(chess,i,j);
                    if(ans==false)
                    {
                        System.out.println("Danger");
                        return;
                    }
                    chess[i][j]=1;
                }
            }
        }
        System.out.println("N Queens");
    }
}