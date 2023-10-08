public class MaxOfArr {
    public static void main(String[] args) {
        int[] arr = {1,25,31,9,97};
        System.out.println(MaxRange(arr, 2,4));
    }

    static int Max(int[] arr)
    {
        if (arr.length == 0)
        {
            return -1;
        }
        int MaxVal = arr[0];
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > MaxVal)
            {
                MaxVal = arr[i];
            }
        }
        return MaxVal;
    }

    //maximum value form given range
    static int MaxRange(int[] arr , int start, int end)
    {
        if (end < start)
        {
            return -1;
        }

        if (arr == null)
        {
            return -1;
        }


        int MaxVal = arr[start];
        for (int i = start; i <= end; i++)
        {
            if (arr[i] > MaxVal)
            {
                MaxVal = arr[i];
            }
        }
        return MaxVal;
    }
}
