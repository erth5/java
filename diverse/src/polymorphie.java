//Teilgebiet Vererbung

public class polymorphie {
}


abstract class House{
    int flats; //Appartments
    int rooms;
    public abstract void printroomnumber();
}
class flat extends House{// hier Vererbung
    public void printroomnumber () {
        System.out.println("Raumanzahl ist " + rooms);// hier polymorphe Methode
    }
}
