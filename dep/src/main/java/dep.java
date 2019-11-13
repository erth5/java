import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.json.JSONStringer;

public class dep {
    public static void main(String[] args){
        //JSON
        String mystr = new JSONStringer()
                .object()
                .key("JSON")
                .value("hello")
                .endObject()
                .toString();

        //Microsoft Excel
        HSSFWorkbook workbook = new HSSFWorkbook();




        System.out.println("finish");
    }
}
