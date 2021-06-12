import java.util.*;

public class SaddlePoint
{
    public static void main(String[] args)
    {
       Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][] arr = new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        printSaddlePoint(arr);
    }
    public static void printSaddlePoint(int[][] arr)
    {
        int n = arr.length;
        boolean flag = true;
        for(int i=0;i<n;i++)
        {

            int min = Integer.MAX_VALUE;
            int k1 = 0;
            // find minimum element in a row
            for(int j=0;j<n;j++)
            {
                  if(min > arr[i][j])
                  {
                      min = arr[i][j];
                      k1= j;
                  }
            }
             
             int max = Integer.MIN_VALUE;
            // find the maximum in column
            for(int j=0;j<n;j++)
            {
                if( arr[j][k1] > max)
                {
                    max = arr[j][k1];
                }
            }

            if( max == min)
            {
                System.out.println(max);
                flag = false;
                return ;
            }
        }
        if(flag)
        {
            System.out.println("Invalid input");
        }
    }
}