import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) {
        try {
            byte[] bwrite = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("text.txt");
            for (int x = 0; x < bwrite.length; x++) {
                os.write(bwrite[x]);
            }

            os.close();
            InputStream is = new FileInputStream("text.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.println((byte) is.read() + " ");
            }
            is.close();

        } catch (IOException e) {
            System.out.println("Exception");
        }
    }
}
