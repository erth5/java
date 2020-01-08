import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class fileworking {

    public static void zipFile(String inFileName, String outFileName){
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
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException ignored) {}
            }
            if(zos != null){
                try {
                    zos.closeEntry();
                    zos.close();
                } catch (IOException ignored) {}
            }
        }
    }

    public static boolean stDeleteFile(String filename) {
        boolean del = false;
        File file = new File(filename);
        if (file.exists()) {
            del = file.delete();
        }
        return del;
    }

    private boolean checkFile(File file) {
        if (file != null) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.err.println("Error creating " + file.toString());
            }
            if (file.isFile() && file.canWrite() && file.canRead())
                return true;
        }
        return false;
    }

    static void emptyfile(String file){
        try {
            FileWriter fw = new FileWriter(file);
            fw.write("");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
