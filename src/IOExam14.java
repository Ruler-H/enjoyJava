import java.io.ByteArrayInputStream;

public class IOExam14 {
    public static void main(String[] args) throws Exception{
        byte[] array = new byte[2];
        array[0] = (byte) 1;
        array[1] = (byte) 2;
        ByteArrayInputStream in = new ByteArrayInputStream(array);
        int read1 = in.read();
        int read2 = in.read();

    }
}
