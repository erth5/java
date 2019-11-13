public class insert {
    public int[] intArr = {12,4,6};

    public int[] insert(){
        int k;//...Zwischenspeicher
        for (int i = 0; i < intArr.length; i++){
            for (int j = intArr.length-1; j > 0; j--){
                if (intArr[j-1] > intArr[j]){
                    k = intArr[j];
                    intArr[j] = intArr[j-1];
                    intArr[j-1] = k;
                }
            }//Der Reihe nach einsortiert
        }
        return intArr;
    }


    public static void main(String[] args){
        insert is = new insert();
        int[] arr = is.insert();
        for (int i = 0; i < arr.length; i++){
            System.out.println(i + 1 + ": " + arr[i]);
        }
    }
}