public class merge {
    public static int[] intArr = {12,4,3};

    public int[] sort(int l, int r) {

        if (l < r) {
            int q = (l + r) / 2;

            sort(l, q);
            sort(q + 1, r);
            merge(l, q, r);
        }
        return intArr;
    }

    private void merge(int l, int q, int r){
        int[] arr = new int[intArr.length];
        int i, j;
        for (i = l; i <= q; i++){
            arr[i] = intArr[i];
        }
        for (j = q + 1; j <= r; j++){
            arr[r + q + 1 - j] = intArr[j];
        }
        i = l;
        j = r;
        for (int k = l; k <= r; k++){
            if (arr[i] <= arr[j]){
                intArr[k] = arr[i];
                i++;
            }   else{
                intArr[k] = arr[j];
                j--;
            }
        }
    }

    public static void main(String[] args) {

        merge m = new merge();
        int[] arr = m.sort(0, intArr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + ": " + arr[i]); }
    }
}