import java.util.Iterator;
import java.util.Stack;

public class Temp8 {
    public static void main(String[] args) {
        Stack<String> list = new Stack<String>();

        list.push("red");
        list.push("quit");
        list.push("second");
        list.push("drop");
        list.push("freak");
        list.pop();

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
