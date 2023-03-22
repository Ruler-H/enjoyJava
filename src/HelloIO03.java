import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class HelloIO03 {
    public static void main(String[] args) throws Exception {
        Writer w = new FileWriter("/tmp/hello.txt");
        w.write((int) 'a');
        w.write((int) '나');
        w.write((int) '다');
        w.close();
    }
}
