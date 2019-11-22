import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class reader {
    public static void main(String[] args){
        String file = "file.json";
        try {
            BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
            if (fr.ready())
                System.out.println(fr.readLine());
            if (fr.ready())
                System.out.println(fr);
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}