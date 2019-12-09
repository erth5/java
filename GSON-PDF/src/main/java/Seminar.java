import java.util.Date;

/**
 * Klasse die ein Seminar als Objekt repraesentiert
 * Dabei ist diese Klasse identisch zur abbildung ihrer Datenrepaesentetion in der Datenbank
 * und fungiert somit als mapping klasse fuer das Hibernate Framework
 *
 * @author Jasley Jangk
 *
 */
public class Seminar {

    private int seminarnummer;
    private String titel_seminar;
    private String raum_nummer;
    private String adresse_medien;
    private String beschreibung;
    private String seminarklasse;
    private int max_teilnehmer;
    private int dozenten_nummer;
    private Date datum;
    private String start_zeit;
    private String end_zeit;

    /**
     * Sandart Konstruktor fuer das erstellen von leeren Elementen
     */
    public Seminar() {

    }

    /**
     * @param seminarnummer
     * @param titel_seminar
     * @param raum_nummer
     * @param adresse_medien
     * @param beschreibung
     * @param seminarklasse
     * @param max_teilnehmer
     * @param dozenten_nummer
     * @param datum
     * @param start_zeit
     * @param end_zeit
     */
    public Seminar(int seminarnummer, String titel_seminar, String raum_nummer, String adresse_medien,
                   String beschreibung, String seminarklasse, int max_teilnehmer, int dozenten_nummer, Date datum,
                   String start_zeit, String end_zeit) {

        this.seminarnummer = seminarnummer;
        this.titel_seminar = titel_seminar;
        this.raum_nummer = raum_nummer;
        this.adresse_medien = adresse_medien;
        this.beschreibung = beschreibung;
        this.seminarklasse = seminarklasse;
        this.max_teilnehmer = max_teilnehmer;
        this.dozenten_nummer = dozenten_nummer;
        this.datum = datum;
        this.start_zeit = start_zeit;
        this.end_zeit = end_zeit;
    }

    /**
     * @return seminarnummer
     */
    public int getSeminarnummer() {
        return seminarnummer;
    }

    /**
     * @param seminarnummer
     *            das zu setzende Objekt seminarnummer
     */
    public void setSeminarnummer(int seminarnummer) {
        this.seminarnummer = seminarnummer;
    }

    /**
     * @return titel_seminar
     */
    public String getTitel_seminar() {
        return titel_seminar;
    }

    /**
     * @param titel_seminar
     *            das zu setzende Objekt titel_seminar
     */
    public void setTitel_seminar(String titel_seminar) {
        this.titel_seminar = titel_seminar;
    }

    /**
     * @return raum_nummer
     */
    public String getRaum_nummer() {
        return raum_nummer;
    }

    /**
     * @param raum_nummer
     *            das zu setzende Objekt raum_nummer
     */
    public void setRaum_nummer(String raum_nummer) {
        this.raum_nummer = raum_nummer;
    }

    /**
     * @return adresse_medien
     */
    public String getAdresse_medien() {
        return adresse_medien;
    }

    /**
     * @param adresse_medien
     *            das zu setzende Objekt adresse_medien
     */
    public void setAdresse_medien(String adresse_medien) {
        this.adresse_medien = adresse_medien;
    }

    /**
     * @return beschreibung
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * @param beschreibung
     *            das zu setzende Objekt beschreibung
     */
    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    /**
     * @return seminarklasse
     */
    public String getSeminarklasse() {
        return seminarklasse;
    }

    /**
     * @param seminarklasse
     *            das zu setzende Objekt seminarklasse
     */
    public void setSeminarklasse(String seminarklasse) {
        this.seminarklasse = seminarklasse;
    }

    /**
     * @return max_teilnehmer
     */
    public int getMax_teilnehmer() {
        return max_teilnehmer;
    }

    /**
     * @param max_teilnehmer
     *            das zu setzende Objekt max_teilnehmer
     */
    public void setMax_teilnehmer(int max_teilnehmer) {
        this.max_teilnehmer = max_teilnehmer;
    }

    /**
     * @return dozenten_nummer
     */
    public int getDozenten_nummer() {
        return dozenten_nummer;
    }

    /**
     * @param dozenten_nummer
     *            das zu setzende Objekt dozenten_nummer
     */
    public void setDozenten_nummer(int dozenten_nummer) {
        this.dozenten_nummer = dozenten_nummer;
    }

    /**
     * @return datum
     */
    public Date getDatum() {
        return datum;
    }

    /**
     * @param datum
     *            das zu setzende Objekt datum
     */
    public void setDatum(Date datum) {
        this.datum = datum;
    }

    /**
     * @return start_zeit
     */
    public String getStart_zeit() {
        return start_zeit;
    }

    /**
     * @param start_zeit
     *            das zu setzende Objekt start_zeit
     */
    public void setStart_zeit(String start_zeit) {
        this.start_zeit = start_zeit;
    }

    /**
     * @return end_zeit
     */
    public String getEnd_zeit() {
        return end_zeit;
    }

    /**
     * @param end_zeit
     *            das zu setzende Objekt end_zeit
     */
    public void setEnd_zeit(String end_zeit) {
        this.end_zeit = end_zeit;
    }

    @Override
    public String toString() {
        return "Seminar [seminarnummer=" + seminarnummer + ", titel_seminar=" + titel_seminar + ", raum_nummer="
                + raum_nummer + ", adresse_medien=" + adresse_medien + ", beschreibung=" + beschreibung
                + ", seminarklasse=" + seminarklasse + ", max_teilnehmer=" + max_teilnehmer + ", dozenten_nummer="
                + dozenten_nummer + ", datum=" + datum + ", start_zeit=" + start_zeit + ", end_zeit=" + end_zeit + "]";
    }

}
