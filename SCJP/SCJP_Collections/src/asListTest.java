import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class asListTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Integer[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<Integer> myListA = new ArrayList<Integer>();

        myListA = Arrays.asList(a);

        for (Integer i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        myListA.set(0, 111);
        myListA.set(5, 222);

        for (Integer i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("-------------------םאמבמנמע-------------------");

        Integer[] b = {};
        List<Integer> myListB = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            myListB.add(i);
        }
        for (Integer integer : myListB) {
            System.out.print(integer + " ");
        }
        System.out.println();

        b = myListB.toArray(b);
        b[0] = 111;
        b[5] = 222;

        for (Integer integer : myListB) {
            System.out.print(integer + " ");
        }
        System.out.println();

    }
}
