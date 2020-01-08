import net.lingala.zip4j.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class Zip4j {
    public static void main(String[] args) {
        try {
            new ZipFile("/Users/Eggo5/Desktop/log.zip").addFile("/Users/Eggo5/Desktop/test.log");
        } catch (ZipException e) {
            e.printStackTrace();
        }
    }
}
