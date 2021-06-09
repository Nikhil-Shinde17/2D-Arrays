import java.util.*;

public class StateOfWakanda2
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
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

        int c=0;
        int k = n-1;
        while(c<n)
        {
            int i=0,j=0;
            if(c%2==0)
            {
                i = 0;
                j = c;
            }
            else
            {
                i = k;
                j = n-1;
            }

            while(i>=0 && j>=0 && j<n)
            {
                System.out.print(arr[i][j]+" ");

                if(c%2 ==0)
                {
                    i++;
                    j++;
                }
                else
                {
                    i--;
                    j--;
                }
            }
            // System.out.println();
            c++;
            k--;
        }
    }
}