import java.util.*;

public class RotateBy90
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

        rotateBy90(arr);
        printArr(arr);
    }

    public static void rotateBy90(int[][] arr)
    {
        int n = arr.length;

        // transpose the matrix i.e -> change row to column and column to row

        int i=0,j=0;

        while(i<n && j<n)
        {
            for(int k=1;i+k<n;k++)
            {
                //not temp variable
                int temp = arr[i][j+k];
                arr[i][j+k] = arr[i+k][j];
                arr[i+k][j] = temp;
            }
            i++;
            j++;
        }
        // swap column
        i=0;
        j=n-1;

        while(i < n/2)
        {
            for(int k=0;k<n;k++)
            {
                int temp = arr[k][i];
                arr[k][i] = arr[k][j];
                arr[k][j] = temp;
            }
            i++;
            j--;
        }
    }
    public static void printArr(int[][] arr)
    {
        int n = arr.length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}