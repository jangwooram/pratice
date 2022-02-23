package javaFileIo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileStreamEx2 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/woorma/javafile/corona.rtf");
            byte[] data = new byte[fileInputStream.available()] ;
            while (fileInputStream.read(data) != -1){
                System.out.println(Arrays.toString(data));
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("error");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
