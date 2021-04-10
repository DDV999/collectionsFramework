public class Player  implements Comparable<Player>{
    private String name;

    private int goldMedal;
    private int silverMedal;
    private int bronzeMedal;

    public Player(String name, int goldMedal, int silverMedal, int bronzeMedal) {
        this.name = name;
        this.goldMedal = goldMedal;
        this.silverMedal = silverMedal;
        this.bronzeMedal = bronzeMedal;
    }

    // Сравнить данный Player с другим Player.
    // Возвращает значение < 0, то есть данный Player  < Player other.
    // Если возвращает значение > 0, значит данный Player > Player other
    // Если возвращает значение = 0, значит данный Player này = Player other.
    @Override
    public int compareTo(Player other) {
        // Сравнить количество золотых медалей.
        int value = this.goldMedal - other.goldMedal;
        if (value != 0) {
            return value;
        }
        // Сравнить количество серебряных медалей
        value = this.silverMedal - other.silverMedal;
        if (value != 0) {
            return value;
        }
        // Сравнить количество бронзовых медалей
        value = this.bronzeMedal - other.bronzeMedal;
        return value;
    }

    @Override
    public String toString() {
        return "[" + this.name + ", Gold: " + this.goldMedal //
                + ", Silver: " + this.silverMedal + ", Bronze: " //
                + this.bronzeMedal + "]";
    }
}
