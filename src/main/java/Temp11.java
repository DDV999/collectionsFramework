import java.util.HashSet;
import java.util.Iterator;

public class Temp11 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>();
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
