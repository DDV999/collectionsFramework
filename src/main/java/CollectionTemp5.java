import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionTemp5 {
    public static void main(String[] args) {
        // Создать объект Set с начальной емкостью (capacity) способной содержать 10 элементов.
        // Если количество добавленных элементов превышает настоящую емкость, он повысит ее на 80%.
        // Особенностью HashSet является - добавленные элементы после будут стоять спереди.
        Set<String> set = new HashSet<String>(10, (float) 0.8);

        set.add("One");
        set.add("Two");

        // Когда происходит дупликация.
        // С HashSet: Он добавит новый элемент и удалит старый элемент.
        set.add("One");
        set.add("Three");

        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
