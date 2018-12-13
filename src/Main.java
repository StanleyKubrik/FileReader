import java.io.*;
import java.nio.charset.StandardCharsets;

public class Main {
    private static FileOutputStream fileOutputStream;
    private static FileInputStream fileInputStream;

    public static void main(String[] args) throws IOException {
        String path = "hello.txt";
        fileOutputStream = new FileOutputStream(path);
        fileInputStream = new FileInputStream("D:\\Nikita\\FileReader\\".concat(path));
        String text = "Hello world!";

        byte[] buffer = text.getBytes();
        fileOutputStream.write(buffer, 0, buffer.length);
        fileOutputStream.close();

        StringBuilder stringBuilder = new StringBuilder();
        byte[] buffer2 = new byte[1024];
        while (fileInputStream.read(buffer2) != -1){
            String string = new String(buffer2, StandardCharsets.UTF_8);
            stringBuilder.append(string);
        }
        fileInputStream.close();
        System.out.println(stringBuilder.toString());
    }
}