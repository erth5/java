public class simple {

    private int[] intArr = {16, 26, 37, 11, 3, 25};

    public static void main(String[] args) {

        simple s = new simple();

        int[] arr = s.sort();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }//intArr[mit dem Wert von Speicheradresse]

    private int[] sort() {

        int k;
        for (int i = intArr.length - 1; i > 1; i--) {//Häufigkeit auszuführen
            for (int j = 0; j <= i - 1; j++) {//Zyklus
                if (intArr[j] >= intArr[i]) {
                    k = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = k;
                }//j Zeiger
            }//i Gesamtlänge
        }
        return intArr;
    }// O(n^2)
}