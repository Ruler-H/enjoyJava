import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class Array172 {
    public static void main(String[] args) {
        Item[] items = new Item[5];
        items[0] = new Item("java", 5000);
        items[1] = new Item("파이썬", 4000);
        items[2] = new Item("C#", 4500);
        items[3] = new Item("자바스크립트", 6000);
        items[4] = new Item("Dart", 200);

        Arrays.sort(items, new ItemSorter());
        Arrays.sort(items, (item1, item2) -> item1.getName().compareTo(item2.getName()));

        for (Item item : items) {
            System.out.println("item = " + item);
        }
    }
}

class ItemSorter implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Item item1 = (Item) o1;
        Item item2 = (Item) o2;

        return item1.getName().compareTo(item2.getName());
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator thenComparing(Comparator other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public Comparator thenComparingInt(ToIntFunction keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator thenComparingLong(ToLongFunction keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }

    @Override
    public Comparator thenComparing(Function keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }
}

// Comparable 은 어떤 Item이 큰지, 작은지 기준을 정하는 interface
class Item implements Comparable{
    private String name;
    private int price;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // 파라미터로 들어온 Object와 내 자신을 비교하는 메소드
    // compareTo에는 Obejct를 받아들이도록 했지만 실제로는 Item이 들어온다.
//    @Override
//    public int compareTo(Object o) {
//        Item d = (Item) o;
//
//        return this.name.compareTo(d.name);
//    }

    @Override
    public int compareTo(Object o) {
        Item d = (Item) o;

        return this.price - d.price;
    }
}
