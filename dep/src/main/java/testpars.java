import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class testpars {

    public static void main(String[] args) {

        //example object
        JSONObject jo = new JSONObject();
        jo.put("firstName", "John");
        jo.put("lastName", "Doe");

        //array of all objects
        JSONArray ja = new JSONArray();
        ja.put(jo);

        //to DB
        String x1 = jo.getString("firstName");
        String x2 = jo.getString("lastName");

        //System.out.println(x1);
        //System.out.println(x2);

        JSONArray y = readfromfile("file.json");
        System.out.print(y);
        //String x = ja.getJSONObject(0).toString();

        //tests
        //System.out.println(ja);
        //System.out.println(jo);
        //System.out.println();
        //System.out.println(ja.toString());
        //System.out.println(jo.get("firstName"));

        //JSONObject mainObj = new JSONObject();
        //mainObj.put("employees", ja);
    }
    public static void writetofile(JSONArray x){
        Path file = Paths.get("output.json");
        try (BufferedWriter writer = Files.newBufferedWriter(file)){
            writer.write(x.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONArray readfromfile(String path){

    }
}
