import java.util.ArrayList;
import java.util.Scanner;

public class ArraylistExaple {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>(10);

//        list.add(45);
//        list.add(68);
//        list.add(12);
//        list.add(59);
//        list.add(20);

//        System.out.println(list.contains(20));
//        System.out.println(list);
//        list.set(0, 24);
//        System.out.println(list);

        // input
        for (int i = 0; i < 5 ; i++) {
            list.add(in.nextInt());

        }
        //get item at any index
        for (int i = 0; i < 5 ; i++) {
            System.out.println(list.get(i)); // pass index here, list[Index] syntax will not work here

        }

    }
}
