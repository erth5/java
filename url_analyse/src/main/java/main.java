import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
public class main {
    public static void main(String[] args) {
        Path file = Paths.get("C:/Users/test/Downloads/my-umatrix-rules.txt");

        try (BufferedReader reader = Files.newBufferedReader(file)) {
            while (reader.ready()) {

                String current = (reader.readLine());
                System.out.println(current);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}