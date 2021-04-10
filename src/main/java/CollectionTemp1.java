import java.util.LinkedList;

public class CollectionTemp1 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("F");
        list.add("B");
        list.add("D");
        list.add("E");
        list.add("C");

        list.addLast("Z");
        list.addFirst("A");

        list.add(1, "A2");
        System.out.println("list: " + list);

        list.remove("F");
        list.remove(2);

        System.out.println("list: " + list);

        list.removeFirst();
        list.removeLast();

        System.out.println("list: " + list);

        Object val = list.get(2);
        list.set(2, (String) val + " Changed");
        System.out.println("list: " + list);
    }
}
