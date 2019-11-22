import java.io.BufferedReader;
        import java.io.FileInputStream;
        import java.io.InputStreamReader;

//parse json to an java obj
public class jsontoobject {
    public static void main(String[] args){
        String file = "file.json";
        try {
            BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
