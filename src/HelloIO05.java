import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class HelloIO05 {
    public static void main(String[] args) throws Exception {
        // FileOutputStream은 "/tmp/my.txt"에 저장한다.
        // FileOutputStream은 write 메소드를 가짐
        // int의 마지막 byte만 저장한다.
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("/tmp/my.txt")));
        pw.println("hello");
        pw.println("world");
        pw.println("!!!!");
        pw.close();
    }
}
