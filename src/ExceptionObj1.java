public class ExceptionObj1 {
    /**
     * i를 k로 나눈 나머지를 반환한다.
     *
     * @param i
     * @param k
     * @return
     * @throws ArithmeticException
     */
    public int divide(int i, int k) throws ArithmeticException {
        int value = 0;
        value = i / k;
//        try {
//            value = i / k;
//        } catch (ArithmeticException e) {
//            System.out.println("0으로 나눌 수 없어요");
//            System.out.println(e.toString());
//        }
        return value;
    }
}
