import java.util.*;
public class TakingInput{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);

        int r = scn.nextInt();
        int c = scn.nextInt();
        int [][] arr = new int[r][c];

          //scan input
        for(int i = 0; i < r;i++)
        {
            for(int j = 0; j < c; j++)
            {
                arr[i][j] = scn.nextInt();
            }
        }

        //print 
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}