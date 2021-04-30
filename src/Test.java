import java.util.LinkedList;

/**
 * Created by Miguel Emmara
 */
public class Test {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            a.add(i);
        }

        for (Integer integer : a) {
            System.out.println(integer);
        }

        System.out.println(a.get(5));
    }
}