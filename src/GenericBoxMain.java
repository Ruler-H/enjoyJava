public class GenericBoxMain {
    public static void main(String[] args) {
        GenericBox<String> genericBox = new GenericBox<>();
        genericBox.setT("kim");
        String str = genericBox.getT();
        System.out.println(str.toUpperCase());

        GenericBox<Integer> intBox = new GenericBox<>();
        intBox.setT(5);
        Integer intValue = intBox.getT();
        System.out.println("intValue = " + intValue);

        GenericBox<Object> objBox = new GenericBox<>();
        objBox.setT("hello");
        String str2 = (String) objBox.getT();
        System.out.println("str2 = " + str2);
    }
}
