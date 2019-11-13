public class bubble {
    private int[] intArr = {12, 7, 3, 5};

    public static void main(String[] args) {

        bubble b = new bubble();

        int[] arr = b.bubble();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }

    private int[] bubble() {
        int k;//helper
        for (int i = 0; i < intArr.length - 1; i++) {//Häufigkeit auszuführen
            if (intArr[i] < intArr[i + 1]) {
                continue;
            }
            k = intArr[i];
            intArr[i] = intArr[i + 1];
            intArr[i + 1] = k;
            bubble();
        }//i...Zeiger
        return intArr;
    }//O(n^2)
}