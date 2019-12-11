import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Date;

public class PdfTest {

    //Kontruktor & benötigt Objekt Kunde
    public PdfTest(Object kunde) {
        System.out.println(kunde.toString());
    }

    public static void main(String[] args) throws IOException {

        Kunde kunde = new Kunde();
        kunde.setVorname("Müller");
        kunde.setNachname("Peter");
        kunde.setKunden_nummer(8267);
        kunde.setEmail_adresse("example@gmail.com");
        kunde.setOrt("Mittweida");
        kunde.setPlz("07463");
        kunde.setStrasse("Poststraße");
        kunde.setHausnummer("27");
        kunde.setLogin_name("derBaer");
        kunde.setPassword("123456");
        kunde.setGeburtsdatum(new Date(1995, 4, 21));
        System.out.println(kunde);

        Seminar seminar = new Seminar();
        seminar.setSeminarnummer(342895);
        seminar.setTitel_seminar("Webinterface in html");
        seminar.setRaum_nummer("3-019");
        seminar.setAdresse_medien("wasdas?");
        seminar.setBeschreibung("Das Webinterface ist ein Seminar, in neue Webtechnologie getestet wird.");
        seminar.setSeminarklasse("WasDas");
        seminar.setMax_teilnehmer(20);
        seminar.setDozenten_nummer(293);
        seminar.setDatum(new Date(20192902));
        seminar.setStart_zeit("12:00");
        seminar.setEnd_zeit("13:00");
        System.out.println(seminar);

        //call PDF classic function7

        try {
            PDF_classic.create_pdf("test.pdf", "Paul", "Mustermann", "Hacking für Anfänger", "12.12,2019", "Beispiel Anwalt");
        } catch (FileNotFoundException | MalformedURLException e) {
            e.printStackTrace();
        }

        //call PDF
        PDF.createPDF(kunde, seminar);
    }
}
