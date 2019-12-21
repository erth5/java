import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFile {

    public static void main(String[] args) throws FileNotFoundException {
        zipFile("/Users/Eggo5/Desktop/test.log", "/Users/Eggo5/Desktop/test.zip");
    }

    private static void zipFile(String inFileName, String outFileName) throws FileNotFoundException {
        ZipOutputStream zos = null;
        FileInputStream fis = null;
        try {
            zos = new ZipOutputStream(
                    new FileOutputStream(outFileName));
            fis = new FileInputStream(inFileName);
            zos.putNextEntry(new ZipEntry(new File(inFileName).getName()));
            int len;
            byte[] buffer = new byte[2048];
            while ((len = fis.read(buffer, 0, buffer.length)) > 0) {
                zos.write(buffer, 0, len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {}
            }
            if(zos != null){
                try {
                    zos.closeEntry();
                    zos.close();
                } catch (IOException e) {}
            }
        }
    }
}