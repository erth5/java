import org.json.JSONArray;
import org.json.JSONObject;

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

        System.out.println(x1);
        System.out.println(x2);
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
