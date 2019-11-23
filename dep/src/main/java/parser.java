import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class parser {
    public static void main(String[] args) throws IOException {
        test_calender();
    }
    //*from DB
    //++to android
    public static void test_calender() throws IOException {
        JSONArray calender = new JSONArray();


        //examples
        JSONObject ex = new JSONObject();
        ex.put("hello", "world");
        ex.put("second", "line");
        JSONObject xe = new JSONObject();
        xe.put("l", "h");
        xe.put("j", "d");
        JSONArray example = new JSONArray();
        example.add(ex);
        example.add(xe);
        example.add(1, "df");
        example.add(0, "TT");

        //testing
        in_cal("calendar.json", "calendar");
        out_obj(ex, "whateverobj.json");
        out_arr(example, "whateverarr.json");
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

    //in case of json start with a array
    public static void out_arr(JSONArray obj, String file){
        try (FileWriter writer = new FileWriter(file)){
            writer.write(obj.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //in
    //parse a array of objects
    public static void in_cal(String file, String type) throws IOException {
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

    //parse a array
    public static void in_arr(String file) throws FileNotFoundException {
        JSONParser parser = new JSONParser();
        try (Reader r = new FileReader(file)){
            JSONArray arr = new JSONArray();
            parser.parse(r);
        } catch (IOException | ParseException e) {
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
