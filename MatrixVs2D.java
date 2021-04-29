public class MatrixVs2D{
    public static void main(String[] args)
    {
        int [][] arr = new int[3][2];
        // System.out.println(arr.length);
        
        System.out.println("Before !!!");
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);
        arr[1] = new int[9];
        System.out.println("After !!!");
        System.out.println(arr[0].length);
        System.out.println(arr[1].length);
        System.out.println(arr[2].length);
    }
}
// we can change the array row to new array 