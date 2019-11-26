import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;

public class json {
    public static void main(String[] args){
        JSONArray JA = new JSONArray();

        JSONArray managers = new JSONArray();
        managers.put(getPerson("John","Doe"));
        managers.put(getPerson("Anna","Smith"));
        managers.put(getPerson("Peter","Jones"));
        System.out.println(managers.get(1));
    }

    static JSONObject getPerson(String firstName, String lastName){
        JSONObject person = new JSONObject();
        person .put("firstName", firstName);
        person .put("lastName", lastName);
        return person ;
    }

    public JSONObject getJsonResponse(){

        JSONArray employees = new JSONArray();
        employees.put(getPerson("John","Doe"));
        employees.put(getPerson("Anna","Smith"));
        employees.put(getPerson("Peter","Jones"));

        JSONArray managers = new JSONArray();
        managers.put(getPerson("John","Doe"));
        managers.put(getPerson("Anna","Smith"));
        managers.put(getPerson("Peter","Jones"));
        System.out.println(managers.get(3));

        JSONObject response= new JSONObject();
        response.put("employees", employees );
        response.put("manager", managers );
        return response;
    }

    public json(){
        //using 1
        String mystr = new JSONStringer()
                .object()
                .key("JSON")
                .value("hello")
                .endObject()
                .toString();
        //using 2
        JSONObject obj = new JSONObject("{ \"hello\" : \"world\" }");
        String x = obj.toString();
        obj.put("hello", "again");
        System.out.println("finish" + x + obj);
        //using 3
        JSONArray jsonArray = new JSONArray("[naffer]");
        System.out.println(jsonArray.toString());
    }
}