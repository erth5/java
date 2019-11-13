public class quick {
    private static int[] intArr = {13, 4, 2};

    public static void main(String[] args) {

        quick q = new quick();

        int[] arr = q.sort(0, intArr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }

    private int[] sort(int l, int r) {
        int q;
        if (l < r) {
            q = partition(l, r);
            sort(l, q);
            sort(q + 1, r);
        }
        return intArr;
    }

    private int partition(int l, int r) {
        int i, j, x = intArr[(l + r) / 2];
        i = l - 1;
        j = r + 1;
        while (true) {
            do {
                i++;
            } while (intArr[i] < x);

            do {
                j--;
            } while (intArr[j] > x);

            if (i < j) {
                int k = intArr[i];
                intArr[i] = intArr[j];
                intArr[j] = k;
            } else {
                return j;
            }
        }//Teile und suche Pivot Element
    }//klein =< pivot =< groß
}