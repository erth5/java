import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;

public class json_simple {
    public static void main(String[] args) throws IOException {
        test_calender();

        JSONObject obj = new JSONObject();
        obj.put("name", "mkyong.com");
        obj.put("age", 100);

        JSONArray list = new JSONArray();
        list.add("msg 1");
        list.add("msg 2");
        list.add("msg 3");

        obj.put("messages", list);

        try (FileWriter file = new FileWriter("file.json")) {
            file.write(obj.toJSONString());
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);
    }

    public static void test_calender() throws IOException {

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
        //in_cal("file.json", "calendar");
        out_obj(ex, "file.json");
        out_arr(example, "file.json");
        test_client();
    }

    public static void test_client(){
        JSONArray client = new JSONArray();
        JSONObject ID = new JSONObject();
        ID.put("ID", "5236");
        JSONObject login = new JSONObject();
        login.put("login-name", "root");
        JSONObject first_name = new JSONObject();
        first_name.put("first-name", "robert");
        JSONObject surname = new JSONObject();

        client.add(ID);
        client.add(login);
        client.add(first_name);
        System.out.println(client);
        System.out.println(ID.values());
    }

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

    public static void in_arr() {
    }
}