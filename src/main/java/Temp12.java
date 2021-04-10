import java.util.Iterator;
import java.util.LinkedHashSet;

public class Temp12 {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();

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
