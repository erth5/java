public class KundeTest {

    //Kontruktor & benötigt Objekt Kunde
    public KundeTest(Object kunde) {
        System.out.println(kunde.toString());
    }

    public static void main(String[] args) {
        Kunde kunde = new Kunde();
        kunde.setEmail_adresse("halloo");
        System.out.println(kunde);
    }
}
