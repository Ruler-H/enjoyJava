import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class IOExam11 {
    public static void main(String[] args) throws Exception {
        String name = "kim";
        int kor = 90;
        int eng = 50;
        int math = 70;
        double total = kor + eng + math;
        double avg = total / 3.0;

        DataOutputStream out = new DataOutputStream(new FileOutputStream("/tmp/score.dat"));
        out.writeUTF(name);
        out.writeInt(kor);
        out.writeInt(eng);
        out.writeInt(math);
        out.writeDouble(total);
        out.writeDouble(avg);
        out.close();
    }
}
