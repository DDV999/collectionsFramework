import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CollectionTemp4 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");

        ListIterator<String> listIterator = list.listIterator();

        String first = listIterator.next();
        System.out.println("First: " + first);

        String second = listIterator.next();
        System.out.println("Second: " + second);

        if (listIterator.hasPrevious()) {
            String value = listIterator.previous();
            System.out.println("Value: " + value);
        }

        System.out.println("-------");

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
