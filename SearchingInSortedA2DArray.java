import java.util.*;

public class SearchingInSortedA2DArray
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
        int v = scn.nextInt();
        printIndex(arr,v);
    }
    public static void printIndex(int[][] arr,int d)
    {
        int n  = arr.length;
        int i=0,j=n-1;

        while(i < n && i >= 0 && j < n && j >= 0)
        {
            int k = arr[i][j];

            if(k > d)
            {
                j--;
            }
            else if(k < d)
            {
               i++;
            }
            else
            {
                System.out.println(i+"\n"+j);
                return;
            }
        }

        System.out.println("Not Found");
        return ;
    }
}