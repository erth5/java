import com.itextpdf.kernel.geom.PageSize;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfPage;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;

public class pdf {
    public static void main(String[] args) throws FileNotFoundException {
        createPDF("file.pdf");
    }
    public static void createPDF(String file) throws FileNotFoundException {
        PdfDocument doc = new PdfDocument(new PdfWriter(file));
        doc.setDefaultPageSize(PageSize.A4);

        //create Page
        PdfPage page = doc.addNewPage(1, PageSize.A4);
        //PdfPage p2 = doc.addNewPage();

        //write in file
        Paragraph para = new Paragraph("Dear Mr / Miss" + "Name");
        Paragraph p2 = new Paragraph("I came from");

        //save pdf
        System.out.println(doc.getNumberOfPages() + " page/s");
        try {
            doc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}









