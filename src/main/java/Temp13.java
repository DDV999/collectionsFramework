import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Temp13 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();

        set.add("unit");
        set.add("track");
        set.add("union");
        set.add("extra");
        set.add("track");

        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
