import java.util.Arrays;
import java.util.Scanner;

public class MultidimentionalArray {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int[][] arr = new int[3][3];

//        input
        for (int row = 0; row < arr.length; row++)
        {
            for(int col = 0; col < arr[row].length; col++)
            {
                arr[row][col] =  in.nextInt();
            }
        }

//        output
//        for (int row = 0; row < arr.length; row++)
//        {
//            for(int col = 0; col < arr[row].length; col++)
//            {
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // output using Arrays.toString() methhod
//        for (int row = 0; row < arr.length; row++)
//        {
//            System.out.println(Arrays.toString(arr[row]));
//        }
        //output using enhanced for loop
        for(int[] a: arr)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
