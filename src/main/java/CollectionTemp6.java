import java.util.LinkedList;
import java.util.Queue;

public class CollectionTemp6 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<String>();

        // offer(E): Вставляет дополнительно элемент в очередь (queue).
        // С очередью LinkedList элемент будет вставлен в конце очереди.
        // Возвращает true если вставлено успешно.
        // Возвращает false если в очереди больше нет места.
        queue.offer("E");
        queue.offer("A");
        queue.offer("M");

        // add(E):  Вставляет дополнительно элемент в очередь.
        // С очередью LinkedList элемент будет вставлен в конце очереди.
        // Возвращает true если вставлено успешно.
        // Выбрасывает исключение если в очереди больше нет места.
        queue.add("G");
        queue.add("B");

        while (true) {
            // Получает и удаляет первый элемент из очереди.
            // Возвращает null если большне нет элементов в очереди.
            String name = queue.poll();
            if (name == null) {
                break;
            }
            System.out.println("Name: " + name);
        }
    }
}
