public class binearbaum {

    public class Knoten {
        private int wert;
        private Knoten teilbaumLinks;
        private Knoten teilbaumRechts;

        public int getWert() {
            return wert;
        }

        public Knoten getKnotenLinks() {
            return teilbaumLinks;
        }

        public Knoten getKnotenRechts() {
            return teilbaumRechts;
        }
        // …
    }

    public class Baum {
        private Knoten wurzel;

        public boolean istTeilbaumKleiner(Knoten k, int wert) {
            //rekursiv prüfen, ob alle Werte in einem Teilbaum kleiner dem Vergleichswert sind.
            if (k.getWert() < wert) {
                if (k.getKnotenLinks() != null)
                    istTeilbaumKleiner(k.getKnotenLinks(), wert);
                return true;
            } else return false;
        }

        public boolean istTeilbaumGroesser(Knoten k, int wert) {
            //rekursiv prüfen, ob alle Werte in einem Teilbaum größer dem Vergleichswert sind.
            if (k.getWert() < wert) {
                if (k.getKnotenRechts() != null)
                    istTeilbaumKleiner(k.getKnotenRechts(), wert);
                return true;
            } else return false;
        }

        public boolean istSuchbaum() {
            return istSuchbaum(wurzel);
        }

        public boolean istSuchbaum(Knoten k) {
            // TODO
            return true;
        }
        // …
    }
}
