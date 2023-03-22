public class CommandLineArgumentExam {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("사용법 : CommadLineArgumentExam 값 값 ...");
            System.exit(0);
        }

        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
