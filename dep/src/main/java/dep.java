import org.json.JSONStringer;

public class dep {
    public static void main(String[] args){
        String mystr = new JSONStringer()
                .object()
                .key("JSON")
                .value("hello")
                .endObject()
                .toString();
        System.out.println("finish");
    }
}
