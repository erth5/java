import org.json.JSONArray;
import org.json.JSONObject;

public class jsontoobject {
    public static void main(String[] args){
        JSONArray JA = new JSONArray();
        JA.put(Integer.parseInt("Anna"), "sagtja");
    }

    JSONObject getPerson(String firstName, String lastName){
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

        JSONObject response= new JSONObject();
        response.put("employees", employees );
        response.put("manager", managers );
        return response;
    }
}