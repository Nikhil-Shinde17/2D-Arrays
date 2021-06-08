import java.util.*;

public class RingRotate
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
        
        int r = scn.nextInt();
        int s = scn.nextInt();
        ringRotate(arr,r,s);
        print(arr);
    }
    public static void ringRotate(int[][] arr,int r,int s)
    {
      int n = arr.length;
       int m = arr[0].length;
       
       int sr = r - 1,sc = r - 1;
       int dr = n - r,dc = m - r;
       
       int total = (dr - sr + 1)*2 +2*(dc - sc) - 2;
    //    System.out.println(total);
       int i = 0; 
       int[] temp = new int[total];  
        
           //left wall 
           for(int j=sr;j<=dr && i<total;j++)
           {
               temp[i] = arr[j][sc];
               i++;
           }
           sc++;



           //bottom wall
           for(int j=sc;j<=dc && i<total;j++)
           {
               temp[i] = arr[dr][j];
               i++;
           }
           dr--;

           for(int j=dr;j>=sr && i<total;j--)
           {
               temp[i] = arr[j][dc];
               i++;
           }
           dc--;

           for(int j=dc;j>=sc && i<total;j--)
           {
             temp[i] = arr[sr][j];
             i++;
           }
           sr++;

           rotate(temp,s);
           i = 0;
            sr = r - 1;sc = r - 1;
            dr = n - r;dc = m - r;
            for(int j=sr;j<=dr && i<total;j++)
           {
                arr[j][sc] = temp[i];
               i++;
           }
           sc++;

           for(int j=sc;j<=dc && i<total;j++)
           {
               arr[dr][j] = temp[i];
               i++;
           }
           dr--;

           for(int j=dr;j>=sr && i<total;j--)
           {
               arr[j][dc] = temp[i];
               i++;
           }
           dc--;

           for(int j=dc;j>=sc && i<total;j--)
           {
             arr[sr][j] = temp[i];
             i++;
           }
           sr++;

    }
    public static void rotate(int[] arr,int s)
    {
        int n = arr.length;
        
        s = s%n;
        if(s < 0)
        s = n + s;

        
       
    //    for(int i=0;i<n;i++)
    //    {
    //        System.out.print(arr[i]+" ");
    //    }
        int i = n-s,j=n-1;
        
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i=0;j=n-s-1;
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        i=0;j=n-1;
        while(i<j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

    }
    public static void print(int[][] arr)
    {
       int n = arr.length;
       int m = arr[0].length;
       for(int i=0;i<n;i++)
       {
           for(int j=0;j<m;j++)
           {
               System.out.print(arr[i][j]+" ");
           }
           System.out.println();
       }   
    }
}