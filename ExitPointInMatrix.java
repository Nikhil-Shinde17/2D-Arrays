import java.util.*;

public class ExitPointInMatrix
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

        printExitPoint2(arr);
    }

    public static void printExitPoint(int[][] arr)
    {
        int n = arr.length;
        int m = arr[0].length;

        int s=0,e=0;

        char currP = 'e';

        while(s >= 0 && s<n && e<m && e >= 0) 
        {
            if(arr[s][e] == 0)
            {
                if(currP == 'e')
                {
                    e++;
                }
                else if(currP == 'w')
                {
                     e--;
                }
                else if(currP == 'n')
                {
                      s--;
                }
                else if(currP == 's')
                {
                    s++;
                }
            }
            else
            {
                 if(currP == 'e')
                {
                    s++;
                    currP = 's';
                }
                else if(currP == 'w')
                {
                     s--;
                     currP = 'n';
                }
                else if(currP == 'n')
                {
                      e++;
                      currP ='e';
                }
                else if(currP == 's')
                {
                     e--;
                     currP = 'w';
                }
            }
        }
        
        if(s < 0)
        {
            s++;
        }
        else if(s == n)
        {
             s--;
        }

        if(e < 0)
        {
            e++;
        }
        else if(e == m)
        {
            e--;
        }

        System.out.println(s+"\n"+e);
    }

    // Another way

    public static void printExitPoint2(int[][] arr)
    {
        int rs = 0, cs = 0;
        int re = arr.length, ce = arr[0].length;
         
         int dir = 0;

        while(rs < re && rs >= 0 && cs < ce && cs >= 0)
        {
            dir = (arr[rs][cs] + dir)%4;

            if(dir == 0)
            {
                   cs++;
            }
            else if(dir == 1)
            {
                rs++;
            }
            else if(dir == 2)
            {
                cs--;
            }
            else
            {
                  rs--;
            }
        }

        if(cs == ce)
        {
            cs--;
        }
        else if(rs == re)
        {
            rs--;
        }
        else if(cs < 0)
        {
            cs++;
        }
        else if(rs < 0)
        {
            rs++;
        }
        System.out.println(rs+"\n"+cs);
    }
}