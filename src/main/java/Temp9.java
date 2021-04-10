import java.util.Iterator;
import java.util.PriorityQueue;

public class Temp9 {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();

        priorityQueue.add("hit");
        priorityQueue.add("jump");
        priorityQueue.add("click");
        priorityQueue.add("lion");
        priorityQueue.add("break");
        System.out.println("head: " + priorityQueue.element());
        System.out.println("head: " + priorityQueue.peek());
        System.out.println("Iterating the queue elements: ");
        Iterator iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        priorityQueue.remove();
        priorityQueue.poll();
        System.out.println("после удаления 2-х элементов: ");
        Iterator<String> iterator1 = priorityQueue.iterator();
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }
    }
}
