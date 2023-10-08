import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        // input
//        arr[0] = 1;
//        arr[1] = 34;
//        arr[2] = 45;
//        arr[3] = 27;
//        arr[4] = 89;
//        System.out.println(arr[3]);

//        input using for loop
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
