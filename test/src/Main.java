import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        InputStream is = System.in;
        while (true){
            System.out.print("1 ký tự: ");
            int ch = 0;
            try {
                ch = is.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (ch == 'q'){
                System.out.println("finished!");
                break;
            }
            try {
                is.skip(2);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("ký tự nhận đc " + (char) ch);
        }
    }
}
