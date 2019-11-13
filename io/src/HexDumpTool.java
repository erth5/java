import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class HexDumpTool {
    public static void main(String[] args) {
        try {
            System.out.println(dump("HexDumpTool.java"))
            ;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    static String dump(String filename) throws IOException {
        final int Breite = 16;
        StringBuilder dump = new StringBuilder();
        StringBuilder hexline = new StringBuilder();
        StringBuilder txtline = new StringBuilder();

        InputStream in = Files.newInputStream(Paths.get(filename), StandardOpenOption.READ);


        int b = in.read();

        int i = 1;

        while (b != -1) {
            if (b <= 15)
                hexline.append("0");
            hexline.append(Integer.toHexString(b));

            if ((b >= 32) && (b < 127))
                txtline.append((char) b);
            else
                txtline.append('.');

            if (i == Breite) {
                dump.append(hexline).append("  ").append(txtline).append("\n");
                i = 0;
                hexline = new StringBuilder();
                txtline = new StringBuilder();
            }
            b = in.read();
            i++;

        } //Ende while-Schleife
        in.close();

        if (i < Breite) {
            for (int k = i; k <= Breite; k++) {
                hexline.append("00");
                txtline.append(".");
            }
        }
        dump.append(hexline).append("  ").append(txtline).append("\n");


        return dump.toString();
    }


}
