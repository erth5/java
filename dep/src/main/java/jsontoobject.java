import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

//parse json to an java obj
public class jsontoobject {
    {    //open the file
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file.json)));
            int linenumber = 0;
            while (br.ready()) {

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
