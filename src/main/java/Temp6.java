import java.util.Iterator;
import java.util.LinkedList;

public class Temp6 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        list.add("home");
        list.add("food");
        list.add("garbage");
        list.add("ruby");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
