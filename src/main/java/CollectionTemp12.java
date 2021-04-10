import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class CollectionTemp12 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("01000005", "Tom");
        map.put("01000002", "Jerry");
        map.put("01000003", "Tom");
        map.put("01000004", "Donald");

        // Получить набор entry.
        // Эти entry могут быть не расспределены по ключам (key).
        Set<Entry<String, String>> entries = map.entrySet();

        for (Entry<String, String> entry : entries) {
            System.out.println("Phone: " + entry.getKey() + " : " + entry.getValue());
        }
    }
}
