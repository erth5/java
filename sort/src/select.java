public class select {
    private int[] intArr = {1, 16, 93};

    public static void main(String[] args) {
        select ss = new select();
        int[] arr = ss.select();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }

    private int[] select() {
        for (int i = intArr.length - 1; i >= 1; i--) {//Runde vermindern
            int q = 0;//position höchster Wert
            for (int j = 1; j <= i; j++) {
                if (intArr[j] > intArr[q]) {
                    q = j;
                }//j...zu prüfender Wert
            }//i...Gesamtlänge
            int k = intArr[q];
            intArr[q] = intArr[i];
            intArr[i] = k;//...höchster Wert Zwischenspeicher
        }
        return intArr;
    }// O(n^2)
}