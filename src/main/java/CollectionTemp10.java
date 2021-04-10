import java.util.SortedSet;
import java.util.TreeSet;

public class CollectionTemp10 {
    public static void main(String[] args) {
        // Создать объект SortedSet через подкласс TreeSet
        SortedSet<Player> players = new TreeSet<Player>();

        Player tom = new Player("Tom", 1, 3, 5);
        Player jerry = new Player("Jerry", 3, 1, 3);
        Player donald = new Player("Donal", 2, 10, 0);

        // Добавить элементы в коллекцию.
        // Они будут автоматически расставлены (По возрастанию).
        players.add(tom);
        players.add(jerry);
        players.add(donald);

        // Напечатать элементы.
        for (Player player : players) {
            System.out.println("Player: " + player);
        }
    }
}
