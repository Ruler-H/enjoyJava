import java.io.FileReader;
import java.io.Reader;

public class HelloIO04 {
    public static void main(String[] args) throws Exception {
        Reader re = new FileReader("/tmp/hello.txt");

//        int ch1 = re.read();
//        System.out.println((char) ch1);
//        ch1 = re.read();
//        System.out.println((char) ch1);
//        ch1 = re.read();
//        System.out.println((char) ch1);
//        ch1 = re.read();
//        System.out.println((char) ch1);

        int ch = -1;
        while ((ch = re.read()) != -1) {
            System.out.println((char)ch);
        }

        re.close();
    }
}
