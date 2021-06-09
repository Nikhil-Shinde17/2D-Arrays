import java.util.*;

public class StateOfWakanda
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int  n = scn.nextInt();

        int[][] arr = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        printDiagonally(arr);
    }

    public static void printDiagonally(int[][] arr)
    {
        int n = arr.length;

        int c = 0;
        while(c<n)
        {
            int i =0;
            int j = c;
            while(j<n)
            {
                 System.out.println(arr[i][j]);
                  i++;
                  j++;
    
            }
            c++;
        }
    }
}