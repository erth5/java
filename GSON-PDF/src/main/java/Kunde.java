import java.sql.Date;

/**
 * Klasse die ein Seminar als Objekt repraesentiert
 * Dabei ist diese Klasse identisch zur abbildung ihrer Datenrepaesentetion in der Datenbank
 * und fungiert somit als mapping klasse fuer das Hibernate Framework
 *
 * @author Jasley Jangk
 *
 */
public class Kunde {

    public String vorname;
    public String nachname;
    public int kunden_nummer;
    private String email_adresse;
    private String ort;
    private String plz;
    private String strasse;
    private String hausnummer;
    private String login_name;
    private String password;
    private Date geburtsdatum;

    /**
     * Sandart Konstruktor fuer das erstellen von leeren Elementen
     */
    public Kunde() {

    }

    /**
     * @param vorname
     * @param nachname
     * @param kunden_nummer
     * @param email_adresse
     * @param ort
     * @param plz
     * @param straße
     * @param hausnummer
     * @param login_name
     * @param password
     * @param geburtsdatum
     */
    public Kunde(String vorname, String nachname, int kunden_nummer, String email_adresse, String ort, String plz,
                 String straße, String hausnummer, String login_name, String password, Date geburtsdatum) {

        this.vorname = vorname;
        this.nachname = nachname;
        this.kunden_nummer = kunden_nummer;
        this.email_adresse = email_adresse;
        this.ort = ort;
        this.plz = plz;
        this.strasse = straße;
        this.hausnummer = hausnummer;
        this.login_name = login_name;
        this.password = password;
        this.geburtsdatum = geburtsdatum;
    }

    /**
     * @return vorname
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * @param vorname
     *            das zu setzende Objekt vorname
     */
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    /**
     * @return nachname
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * @param nachname
     *            das zu setzende Objekt nachname
     */
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    /**
     * @return kunden_nummer
     */
    public int getKunden_nummer() {
        return kunden_nummer;
    }

    /**
     * @param kunden_nummer
     *            das zu setzende Objekt kunden_nummer
     */
    public void setKunden_nummer(int kunden_nummer) {
        this.kunden_nummer = kunden_nummer;
    }

    /**
     * @return email_adresse
     */
    public String getEmail_adresse() {
        return email_adresse;
    }

    /**
     * @param email_adresse
     *            das zu setzende Objekt email_adresse
     */
    public void setEmail_adresse(String email_adresse) {
        this.email_adresse = email_adresse;
    }

    /**
     * @return ort
     */
    public String getOrt() {
        return ort;
    }

    /**
     * @param ort
     *            das zu setzende Objekt ort
     */
    public void setOrt(String ort) {
        this.ort = ort;
    }

    /**
     * @return plz
     */
    public String getPlz() {
        return plz;
    }

    /**
     * @param plz
     *            das zu setzende Objekt plz
     */
    public void setPlz(String plz) {
        this.plz = plz;
    }

    /**
     * @return strasse
     */
    public String getStrasse() {
        return strasse;
    }

    /**
     * @param strasse
     *            das zu setzende Objekt strasse
     */
    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    /**
     * @return hausnummer
     */
    public String getHausnummer() {
        return hausnummer;
    }

    /**
     * @param hausnummer
     *            das zu setzende Objekt hausnummer
     */
    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    /**
     * @return login_name
     */
    public String getLogin_name() {
        return login_name;
    }

    /**
     * @param login_name
     *            das zu setzende Objekt login_name
     */
    public void setLogin_name(String login_name) {
        this.login_name = login_name;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     *            das zu setzende Objekt password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return geburtsdatum
     */
    public Date getGeburtsdatum() {
        return geburtsdatum;
    }

    /**
     * @param geburtsdatum
     *            das zu setzende Objekt geburtsdatum
     */
    public void setGeburtsdatum(Date geburtsdatum) {
        this.geburtsdatum = geburtsdatum;
    }

    @Override
    public String toString() {
        return "Kunde [vorname=" + vorname + ", nachname=" + nachname + ", kunden_nummer=" + kunden_nummer
                + ", email_adresse=" + email_adresse + ", ort=" + ort + ", plz=" + plz + ", straße=" + strasse
                + ", hausnummer=" + hausnummer + ", login_name=" + login_name + ", password=" + password
                + ", geburtsdatum=" + geburtsdatum + "]";
    }

}
