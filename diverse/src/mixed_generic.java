import java.util.ArrayList;
import java.util.List;
//https://www.torsten-horn.de/techdocs/java-generics.htm#Generics-Anwendungsbeispiel

public class mixed_generic {
    public static void main( String[] args )
    {
        List<String> listeMitGenerics = new ArrayList<>();
        listeMitGenerics.add( "Hallo1" );
        methodeOhneGenerics( listeMitGenerics );

        List<String> listeOhneGenerics = new ArrayList<String>();
        listeOhneGenerics.add( "Hallo2" );
        methodeMitGenerics( listeOhneGenerics );
    }

    private static void methodeOhneGenerics(List<String> lst)
    {
        System.out.println( lst.get( 0 ) );
    }

    private static void methodeMitGenerics(List<String> lst)
    {
        System.out.println( lst.get( 0 ) );
    }
}