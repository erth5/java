import java.util.ArrayList;
import java.util.List;

public class generic {

    public void nogeneric (){
        List<String> mylist = new ArrayList<>();
        mylist.add("Hallo");
        String s = mylist.get(0);
    }

    public generic (){
        List<String> mylist = new ArrayList<String>();
        mylist.add("Hallo");
        String s = mylist.get(0);
    }

    public void generics(){
        List<String> meineListe = new ArrayList<>();
        //meineListe.add( new Integer(42) );  <-- Kompilierfehler String to Integer
        String s = meineListe.get( 0 );
    }

    public void nogenerics(){
        List meineListe = new ArrayList();
        meineListe.add(42);
        String s = (String) meineListe.get( 0 ); // <-- Laufzeit-Exception !
    }
}//generic benötigt kein Typecast