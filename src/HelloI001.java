import java.io.FileOutputStream;
import java.io.OutputStream;

public class HelloI001 {
    public static void main(String[] args) throws Exception{
        OutputStream out = new FileOutputStream("/tmp/helloio01.dat");
        out.write(1); // 0000 0000   0000 0000   0000 0000   0000 00001
        out.write(255);
        out.write(0);
        out.close();
    }
}
