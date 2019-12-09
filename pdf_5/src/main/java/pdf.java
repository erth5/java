import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class pdf {
    public static void main(String[] args) throws IOException, DocumentException {
        pdf.create_pdf("test5.pdf");
    }

    public static void create_pdf(String file) throws IOException, DocumentException {
        Document doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream(file));
        doc.open();

        Font font = new Font(Font.FontFamily.TIMES_ROMAN);
        Font font14pt = new Font(Font.FontFamily.TIMES_ROMAN, 14);
        Font font10pt = new Font(Font.FontFamily.TIMES_ROMAN, 10);

        Paragraph p = new Paragraph("Hello World! ", font);
        Chunk chunk = new Chunk("Hallo Wereld! ", font14pt);
        p.add(chunk);
        chunk = new Chunk("Bonjour le monde! ", font10pt);
        chunk.setTextRise(4);
        p.add(chunk);

        doc.add(p);
        doc.close();
    }
}
