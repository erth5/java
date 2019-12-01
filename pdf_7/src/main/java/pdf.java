import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class pdf {
    public static void main(String[] args) throws FileNotFoundException {
        create_pdf("test.pdf");
    }
    public static void create_pdf(String file) throws FileNotFoundException {
        //Initialize writer
        PdfWriter writer = new PdfWriter(file);

//Initialize document
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document doc = new Document(pdfDoc);

//Add paragraph to the document
        doc.add(new Paragraph("Hello World!"));

//Close document
        try {
            doc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
