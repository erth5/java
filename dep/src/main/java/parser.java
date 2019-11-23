import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;

public class parser {
    public static void main(String[] args) throws IOException {
        test_calender();
    }
    //*from DB
    //++to android
    public static void test_calender() throws IOException {
        JSONArray calender = new JSONArray();
        JSONObject event;

        for (int events = 4; events >= 0;events--){
            event = new JSONObject();
            event.put("hallo", "bey");
            //System.out.println(event);
            //out_obj(event, "calendar.json");
        }
        in_arr("calendar.json", "calendar");
    }
    //++to win
    //*from win
    //*from android

    //*general
    //out
    private static void out_obj(JSONObject obj, String file){
        try (FileWriter writer = new FileWriter(file)){
            writer.write(obj.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void out_arr(JSONArray obj, String file){
        try (FileWriter writer = new FileWriter(file)){
            writer.write(obj.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //in
    //parse a array of objects
    public static void in_arr(String file, String type) throws IOException {
        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader(file)){
            JSONObject ev = (JSONObject) parser.parse(reader);
            switch (type){
                case "calendar"://when it`s a calendar file
                    JSONArray arr = (JSONArray) ev.get("event");
                    for (Object o : arr) {
                        System.out.println(o);
                    }
                    break;
                case "customer":
                    //TODO
                    break;
                default:
                    break;
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    //parse only one object
    public static void in_obj(String file) throws IOException {
        JSONParser parser = new JSONParser();
        try (Reader reader = new FileReader(file)){
            JSONObject obj = (JSONObject) parser.parse(reader);
            System.out.println(obj);
            } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
