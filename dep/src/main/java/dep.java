import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONStringer;

public class dep {
    public static void main(String[] args){

        //JSON
        //JSON API using 1
        String mystr = new JSONStringer()
                .object()
                .key("JSON")
                .value("hello")
                .endObject()
                .toString();

        //JSON API using 2
        JSONObject obj = new JSONObject("{ \"hello\" : \"world\" }");
        String x = obj.toString();
        obj.put("hello", "again");
        System.out.println("finish" + x + obj);

        JSONArray jsonArray = new JSONArray("[naffer]");
        System.out.println(jsonArray.toString());

        //JSON Api simple framework
        org.json.simple.JSONObject sob = new org.json.simple.JSONObject();


        //Microsoft Excel
        HSSFWorkbook workbook = new HSSFWorkbook();
    }
}
