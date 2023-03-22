import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetExam2 {
    public static void main(String[] args) {
        Set<MyDate> mySet = new HashSet<>();
        mySet.add(new MyDate("kim", 500));
        mySet.add(new MyDate("lee", 200));
        mySet.add(new MyDate("hong", 700));
        mySet.add(new MyDate("hong", 700));

        Iterator<MyDate> iterator = mySet.iterator();

        while (iterator.hasNext()) {
            MyDate myData = iterator.next();
            System.out.println(myData);
        }

    }
}

class MyDate{

    @Override
    public boolean equals(Object o) {
        System.out.println("equals");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return value == myDate.value && Objects.equals(name, myDate.name);
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode");
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }

    private String name;
    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public MyDate(String name, int value) {
        this.name = name;
        this.value = value;
    }
}
