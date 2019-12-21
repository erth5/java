import java.io.File;

public class DelFile {
    public static void main(String[] args) {
        boolean status = stDeleteFile("/Users/Eggo5/Desktop/test.zip");
        System.out.println(status);
    }
    public static boolean stDeleteFile(String filename) {
        boolean del = false;
        File file = new File(filename);
        if (file.exists()) {
            del = file.delete();
        }
        return del;
    }
}
