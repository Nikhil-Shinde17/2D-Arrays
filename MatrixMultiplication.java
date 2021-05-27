import java.util.*;

public class MatrixMultiplication
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();

        int[][] arr1 = new int[n1][m1];

        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m1;j++)
            {
                arr1[i][j] = scn.nextInt();
            }
        }
        
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();

        int[][] arr2 = new int[n2][m2];

        for(int i=0;i<n2;i++)
        {
            for(int j=0;j<m2;j++)
            {
                arr2[i][j] = scn.nextInt();
            }
        }

        if(m1 != n2)
        {
            System.out.println("Invalid input");
        }
        else
        {
           printMatrixMultiplication(arr1,arr2); 
        }
    }

    public static void printMatrixMultiplication(int[][] arr1,int[][] arr2)
    {
        int n1 = arr1.length;
        int m1 = arr1[0].length;

        int n2 = arr2.length;
        int m2 = arr2[0].length;

        // for matrix multiplication the simple rule is that m1 == n1
        // the size will be n1*m2

        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m2;j++)
            {
                int sum = 0;
                for(int k=0;k<m1;k++)
                {
                    sum += arr1[i][k]*arr2[k][j];
                }
                System.out.print(sum+" ");
            }
            System.out.println("");
        }
    }
}










