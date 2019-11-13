import java.io.*;
import java.util.HashMap;

public class listreader {

    // Hashmap erzeugen, die die Passwörter erhalten soll.
    private static HashMap pwdlist = new HashMap();

    //Einlesen und übergeben der Passwörter.
    public static void lesen() {

        //Datei wählen
        File datei1 = new File("pwd.txt");

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(datei1)));

            //jedes Passwort muss auf eine Zeile geschrieben sein.
            long linenumber = 0;

            //Wenn der Reader noch ein Wort hat, dann weiter einlesen.
            while (br.ready()) {

                pwdlist.put(linenumber, br.readLine());

                linenumber++;
            }

            br.close();

        } catch (IOException ignored) {
        }
    }
}