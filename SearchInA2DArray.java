// a). Integers in each row are sorted from left to right.
// b). The first integer of each row is greater than the last integer of the previous row.
import java.util.*;

public class SearchInA2DArray
{

    public static void main(String[]args) {
        //input work
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();

        int[][]matrix = new int[m][n];

        for(int i=0; i < m;i++) {
            for(int j=0; j < n;j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        int target = scn.nextInt();

        boolean isFound = search2(matrix,target);
        System.out.println(isFound);
    }
    public static boolean search1(int[][]arr,int target) {
        int n = arr.length;
        int m = arr[0].length;
        
        int j = n-1;
        int i = 0;

        while(i <= j)
        {
            int mid = (i+j)/2;
              if( arr[mid][m-1] == target)
                {
                     return true;
                }
                else if(arr[mid][m-1] < target)
                {
                    i = mid + 1;
                } 
                else
                {
                    j = mid - 1;
                }
        }

        //apply binary search in column
        if(i >= n)
        {
            return false;
        }
        // System.out.println(i+"\n"+j);
        int row = i;
        i=0;j=m-1;
        while(i <= j)
        {
              int mid = (i+j)/2;
              if( arr[row][mid] == target)
                {
                     return true;
                }
                else if(arr[row][mid] < target)
                {
                    i = mid + 1;
                } 
                else
                {
                    j = mid - 1;
                }
        }
        return false;
    }

    //2nd approach
   public static boolean search2(int[][]arr,int target) {
       int n = arr.length;
       int m = arr[0].length;

       int i = 0;
       int j = n-1;

       while(i <= j)
       {
           int mid = (i+j)/2;

           if(arr[mid][0] <= target && arr[mid][m-1] >=target )
           {
                 int a=0,b=m-1;
                 while( a <= b)
                 {
                     int mid1 = (a+b)/2;
                     if(arr[mid][mid1] == target)
                     {
                                 return true;
                     }
                     else if(arr[mid][mid1] > target)
                     {
                            b = mid1 - 1;
                     }
                     else{
                            a = mid1 + 1;
                     }
                 }
           }
           else if(arr[mid][0] > target)
           {
                 j = mid - 1;
           }
           else
           {
                  i = mid + 1;
           }
       }
       return false;
   }
}