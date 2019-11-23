import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.StringWriter;
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

        //String y = readfromfile("file.json");
        //System.out.print(y);
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
}
