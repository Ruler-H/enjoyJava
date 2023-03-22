public class Exception1 {
    public static void main(String[] args) {
        ExceptionObj1 exceptionObj1 = new ExceptionObj1();
        try {
            int value = exceptionObj1.divide(10, 0);
            System.out.println(value);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        }

    }
}

