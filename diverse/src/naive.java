//Sucht eine Musterfolge aus einem Array
public class naive {
    public static int[] t = { 5, 3, 5, 228, 14, 69, 18, 27, 109, 85 };

    void naivesearch(int [] p){//Auch Text möglich
        int i = 0, j;
        int m = 1;//m = Länge des SuchMusters
        while (i <= t.length - m){
            j = 0;
            while (j<m && p[j]==t[i+j]) j++;
            if (j==m)
                System.out.println(i);
            i++;
        }//Länge des Textes t wird mit n bezeichnet
    }//p...Suchmuster

    public static void main(String[] args) {

        naive n = new naive();
        int p[] = {18};
        n.naivesearch(p);
    }
}//Θ(n)