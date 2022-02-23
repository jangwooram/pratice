package javaFileIo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileStreamEx4 {
    public static void main(String[] args) {
        try {
            FileOutputStream fileOut =new FileOutputStream("/Users/wooram/javafile/test.txt");
            String str = "여기에 쓰는 글이 저장 됩니다.";
            fileOut.write(str.getBytes(StandardCharsets.UTF_8));
            fileOut.close();
            System.out.println("저장완료");

        } catch (IOException e) {
            System.out.println("저장할 수 없습니다");
        }
    }
}
