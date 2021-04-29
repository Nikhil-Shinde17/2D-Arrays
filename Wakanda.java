import java.util.*;

public class Wakanda{
    public static void main(String[] args)
    {
           Scanner scn = new Scanner(System.in);

           int r = scn.nextInt();
           int c = scn.nextInt();

           int[][] arr = new int[r][c];

           for(int i = 0; i < r; i++)
           {
               for(int j = 0; j < c; j++)
               {
                   arr[i][j] = scn.nextInt();
               }
           }

        for(int i = 0; i < c; i++)
        {
            if((i+1)%2 != 0)
                 {
                     for(int j = 0; j < r;j++)
                    {
                            System.out.println(arr[j][i]);
                    }
                 }
                 else
                 {
                     for(int j = r-1; j >= 0;j--)
                    {
                            System.out.println(arr[j][i]);
                    }
                 }
            
        }
    }
}