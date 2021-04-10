import java.util.ArrayDeque;
import java.util.Deque;

public class Temp10 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("salary");
        deque.add("view");
        deque.add("mistake");

        for (String s: deque) {
            System.out.println(s);
        }
    }
}
