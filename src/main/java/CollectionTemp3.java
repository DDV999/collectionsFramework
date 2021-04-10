import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;

public class CollectionTemp3 {
    public static void main(String[] args) {
        Collection<String> collection = new Vector<String>();
        collection.add("Collection");
        collection.add("Queue");
        collection.add("List");
        collection.add("Map");
        System.out.println("Size collection: "+collection.size());

        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println("Element: "+iterator.next());
        }
    }
}
