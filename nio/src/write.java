import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class write {
    public static void main(String[] args){

        Charset charset = StandardCharsets.US_ASCII;
        String a = "hello world";
        Path file = Paths.get("hello");

        try (BufferedWriter writer = Files.newBufferedWriter(file, charset)) {
            writer.write(a, 0, a.length());
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
    }
}//with Charset