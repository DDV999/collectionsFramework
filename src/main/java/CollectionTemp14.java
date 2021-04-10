import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class CollectionTemp14 {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();

// добавление элементов
        lst.add("Mercury");
        lst.add("Venus");
        lst.add("Earth");
        lst.add("Saturn");
        lst.add("Neptune");

// добавлене несколько элементов сразу
        lst.addAll(Arrays.asList("PlanetX", "PlanetY", "PlanetZ"));

// отображение массива
        System.out.println(lst);

// добавление элемента в определеную позицию
        lst.add(0, "Jupiter");
        lst.add(1, "Uranus");

// получение True если значение есть в массиве, иначе False
        boolean isExist = lst.contains("Earth");

// получение True если все значения есть в массиве, иначе False
        ArrayList<String> favorite = new ArrayList<>();
        favorite.add("Earth");
        favorite.add("Saturn");
        boolean isContains = lst.containsAll(favorite);

// удаление элемента по значению
        lst.remove("Saturn");
        lst.remove("Neptune");

// оставить в списке только указаные элементы
        favorite = new ArrayList<>();
        favorite.add("Earth");
        favorite.add("Saturn");
        lst.retainAll(favorite);

// отображение массива
        System.out.println(lst);

// удаление элемента по индексу
        lst.remove(1);

// удалить все элементы в списке
        favorite = new ArrayList<>();
        favorite.add("Earth");
        favorite.add("Saturn");
        lst.removeAll(favorite);

// удалить элементы списка, которые соответсвуют условию Predicate
        class SamplePredicate<T> implements Predicate<T> {
            T varc1;

            public boolean test(T varc) {
                if (varc1.equals(varc)) {
                    return true;
                }
                return false;
            }
        }

        SamplePredicate<String> filter = new SamplePredicate<>();
        filter.varc1 = "Saturn";
        lst.removeIf(filter);

// обновление значения по индекску
        lst.set(1, "Neptune");

// получить индекс элемента по значению, если не найденно то -1
        int pos = lst.indexOf("Jupiter");

// получение элемента по индексу
        String planet = lst.get(3);

// размер массива
        int amount = lst.size();

// получить часть массива
        ArrayList<String> lst2 = new ArrayList<>(lst.subList(1, 3));

// обэдинение массивов
        lst.addAll(lst2);

// удалить все элементы
        lst.clear();

// отсортировать список в обратном порядке
        //List reversedList = Collections.reverse(lst);

// заменить значение каждого элемента списка на результат оператор
// оператор
        class MyOperator<T> implements UnaryOperator<T> {
            T varc1;

            public T apply(T varc) {
                return varc1;
            }
        }

        MyOperator<String> operator = new MyOperator<>();
        operator.varc1 = "Earth";
        lst.replaceAll(operator);
        System.out.println(lst);
// [Earth, Earth, Earth, Earth]


// выполнить действие над каждым элементом списка
// действие
        class MyConsumer<T> implements Consumer<T> {
            public void accept(T planet) {
                System.out.println("We are flying to " + planet);
            }
        }

        MyConsumer<String> action = new MyConsumer<>();
        lst.forEach(action);
    }
}
