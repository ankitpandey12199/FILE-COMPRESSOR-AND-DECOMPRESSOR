package project;

import java.io.*;
import java.util.zip.GZIPInputStream;

public class decompress {

    public static void method(File file) throws IOException {
        String fileDirectory = file.getParent();

        FileInputStream fis = new FileInputStream(file);
        FileOutputStream fos = new FileOutputStream(fileDirectory + "/Decompressed.txt");
        GZIPInputStream gis = new GZIPInputStream(fis);
        byte[] buffer = new byte[1024];
        int len;
        while ((len = gis.read(buffer)) != -1) {
            fos.write(buffer, 0, len);
        }
        fis.close();
        gis.close();
        fos.close();
    }

}
