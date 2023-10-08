import java.util.Arrays;

public class SwapArrayElement {
    public static void main(String[] args) {

        int[] arr = {23,56,12,98,50};
//        System.out.println("Before swapping");
//        System.out.println(Arrays.toString(arr));
//        swap(arr, 1, 3);
//        System.out.println("After swapping");
//        System.out.println(Arrays.toString(arr));

        System.out.println("Before reversing");
        System.out.println(Arrays.toString(arr));
        revers(arr);
        System.out.println("After reversing");
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int index1, int index2 )
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // reveres the array using swap method
    static void revers(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;

        while (start < end)
        {
            //swap
            swap(arr, start,end);

            start++;
            end--;
        }

    }

}
