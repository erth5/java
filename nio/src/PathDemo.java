import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
public class PathDemo {
    public static void main(String[] args) throws IOException {
        Path relative = Paths.get("filename.txt");
        System.out.println("Relative path: " + relative);
        Path absolute = relative.toAbsolutePath();
        System.out.println("Absolute path: " + absolute);
    }
}