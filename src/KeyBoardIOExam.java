import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KeyBoardIOExam {
    public static void main(String[] args) throws Exception{
        // 키보드로부터 한줄씩 입력받고, 한줄씩 화면에 출력하시오.
        // 키보드 : System.in
        // 화면에 출력 : System.out
        // 키보드로 입력받는다는건 문자를 입력받는 것 : char 단위 입출력
        // char 단위 입출력 클래스는 Reader, Writer
        // 한줄 읽기 : BufferedReader 라는 클래스는 readLine 이라는 메소드를 가지고 있다.
        //           더이상 읽어들일것이 없으면(EOF) Null을 반환
        // 한줄 쓰기 : PrintStream, PrintWriter

        // Reader의 자식 중에서
        // BufferedReader는 아님
        // CharReader x
        // FilterReader x - 장식. Reader를 넣어줘야 한다.
        // InputerStreamReader(InputStream in) - 장식
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = null;
        while ((line = br.readLine()) != null){
            System.out.println("읽어들인값 : " + line);
        }
    }
}
