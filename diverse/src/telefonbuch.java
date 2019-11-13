import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class telefonbuch {

    private Map<String, Set<String>> storage;

    public telefonbuch(){
        storage = new HashMap<>();
    }

    public boolean einfuegen(String name, String teln){
        if(!storage.containsKey(name))
        {
            storage.put(name, new HashSet<>());
        }
        return storage.get(name).add(teln);
    }

    public boolean hatTelNr(String name){
        return storage.containsValue(name);
    }

    public boolean loeschen (String name, String telnr){
        if (storage.containsKey(name)){
            storage.remove(name, telnr);
            return true;
        }
        storage.remove(name, telnr);
        return false;
    }

    public boolean loeschen (String name){
        storage.remove(name);
        return true;
    }
}
