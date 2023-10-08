//Q. count the occurence of 5 in a number
public class CountNums {
    public static void main(String[] args) {
        int n = 4558515;
        int count = 0;

        while(n > 0){
            int rem = n % 10;
            if(rem == 5)
            {
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
