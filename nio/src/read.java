import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class read {
    public static void main(String[] args){

        Path file = Paths.get("hello");

        try (BufferedReader reader = Files.newBufferedReader(file)){
            while (reader.ready()){
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}//without Charset