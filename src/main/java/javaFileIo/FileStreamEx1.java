package javaFileIo;

import java.io.File;
import java.io.FileWriter;
import java.net.URI;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStreamEx1 {
    public static void main(String[] args) {

        File dir = new File("/Users/wooram/javafile");
        File file1 = new File("/Users/wooram/javafile/corona.rtf");
        File file2 = new File("/Users/wooram/javafile/front.rtf");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm");

        File[] contents = dir.listFiles();
        System.out.println("-------");
        for (File file:contents) {
            System.out.println(file + sdf.format(new Date(file.lastModified())));
        }
    }
}
