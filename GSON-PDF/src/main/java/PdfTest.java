import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.sql.Date;

public class PdfTest {

    //Kontruktor & benötigt Objekt Kunde
    public PdfTest(Object kunde) {
        System.out.println(kunde.toString());
    }

    public static void main(String[] args) {

        Kunde kunde = new Kunde();
        kunde.setVorname("Paul");
        kunde.setNachname("Peter");
        kunde.setKunden_nummer(8267);
        kunde.setEmail_adresse("example@gmail.com");
        kunde.setOrt("Mittweida");
        kunde.setPlz("07463");
        kunde.setStrasse("examplestreet");
        kunde.setHausnummer("27");
        kunde.setLogin_name("derBaer");
        kunde.setPassword("123456");
        kunde.setGeburtsdatum(new Date(2019, 1, 1));
        System.out.println(kunde);

        Seminar seminar = new Seminar();
        seminar.setSeminarnummer(342895);
        seminar.setTitel_seminar("DasKlange");
        seminar.setRaum_nummer("3-019");
        seminar.setAdresse_medien("wasdas?");
        seminar.setBeschreibung("Das Klange ist ein Seminar, in dem Getrunken wird");
        seminar.setSeminarklasse("WasDas");
        seminar.setMax_teilnehmer(20);
        seminar.setDozenten_nummer(293);
        seminar.setDatum(new Date(20192902));
        seminar.setStart_zeit("12:00");
        seminar.setEnd_zeit("13:00");
        System.out.println(seminar);

        //call PDF function
        try {
            PDF.create_pdf("test.pdf", "Paul", "Mustermann", "Hacking für Anfänger", "12.12,2019", "Beispiel Anwalt");
        } catch (FileNotFoundException | MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
