import java.util.ArrayList;
import java.util.Iterator;

public class Temp5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("cool");
        list.add("great");
        list.add("boom");
        list.add("treat");

        //Traversing list through Iterator
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
