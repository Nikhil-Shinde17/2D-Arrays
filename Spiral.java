import java.util.*;

public class Spiral
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }
        printSpiral(arr);
    }
    public static void printSpiral(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;

        int rs = 0, re = n-1;
        int cs = 0,ce = m-1;
         
         int count = 1;

        while(count <= n*m)
        {
            // for left wall
            for(int i=rs;i<=re && count <= n*m;i++)
            {
                System.out.println(arr[i][cs]);
                count++;
            }
            cs++;

            // for bottom wall print
            for(int i=cs;i<=ce && count <= n*m;i++)
            {
                System.out.println(arr[re][i]);
                count++;
            }
            re--;

            // for right wall
            for(int i=re;i>=rs  && count <= n*m;i--)
            {
                System.out.println(arr[i][ce]);
                count++;
            }
            ce--;
            
            // upper wall
            for(int i=ce;i>=cs && count <= n*m;i--)
            {
                System.out.println(arr[rs][i]);
                count++;
            }
            rs++;
        }
    }
}