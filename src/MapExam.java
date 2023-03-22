import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hello");
        map.put("k2", "hi");
        map.put("k3", "안녕");
        map.put("k4", "ㅎㅇ");

        System.out.println("map.get(\"k1\") = " + map.get("k1"));
        System.out.println("map.get(\"k2\") = " + map.get("k2"));
        System.out.println("map.get(\"k3\") = " + map.get("k3"));
    }
}
