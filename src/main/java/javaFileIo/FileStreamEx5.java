package javaFileIo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileStreamEx5 {
    public static void main(String[] args) {
        File file = new File("/Users/wooram/javafile/memo.txt");
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write("내일부터 시작 \n 리액트");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            System.out.println("저장실패");
        }
    }
}
