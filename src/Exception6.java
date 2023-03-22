public class Exception6 {
    public static void main(String[] args) {
        int[] array = {4, 2};
        int[] value = null;
        try {
            value[0] = array[0] / array[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }
}
