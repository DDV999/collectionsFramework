import java.util.Iterator;
import java.util.Vector;

public class Temp7 {
    public static void main(String[] args) {
        Vector<String> list = new Vector<String>();

        list.add("joke");
        list.add("street");
        list.add("yellow");
        list.add("freez");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
