import java.util.ArrayList;

public class ListExam02 {
    public static void main(String[] args) {
        // 자료구조객체들은 제네릭을 사용하지 않으면 Object 타입을 저장한다.
        ArrayList<String> list = new ArrayList<>();
        list.add("kim");
        list.add("lee");
        list.add("hong");

        String str1 = list.get(0);
        String str2 = list.get(1);
        String str3 = list.get(2);

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
        System.out.println("str3 = " + str3);
    }
}
