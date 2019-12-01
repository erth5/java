import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class pdf {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
        create_pdf("test.pdf");
    }
    public static void create_pdf(String file) throws FileNotFoundException, MalformedURLException {
//Initialize writer
        PdfWriter writer = new PdfWriter(file);

        //data
        String sex = "male";
        String first_name = "Paul";
        String sur_name = "Mustermann";
        String kurs_name = "hacking";
        String any = "any";

//Initialize document
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document doc = new Document(pdfDoc).setBackgroundColor(new DeviceRgb(255, 1, 20));
        //doc.add(new AreaBreak());         break zu einer  neuen Seite

//Add paragraph to the document

        //image
        ImageData data = ImageDataFactory.create("img.png");
        Image img = new Image(data).setFixedPosition(350, 600);
        doc.add(img);

        // fonts

        //title overwrite image
        doc.add(new Paragraph("Urkunde").setFontSize(43).setTextAlignment(TextAlignment.CENTER));

        //desc
        if (sex.equals("male")){
            doc.add(new Paragraph("Sehr Geehrter Herr " + first_name + sur_name + ".").setFontSize(20));
        }else {
            doc.add(new Paragraph("Sehr Geehrte Frau " + first_name + sur_name + ".").setFontSize(20));
        }

        doc.add(new Paragraph("Wir freuen uns, das sie den Kurs " + kurs_name + " \n erfolgreich bei uns Absolviert haben.").setFontSize(18));
        doc.add(new Paragraph("weiterer Text " + any + " \n weiterer Text.").setFontSize(18).setBorderBottom();

        //Footer
        doc.add(new Paragraph("Mit Freundlichen Grüßen").setFontSize(18));
        doc.add(new Paragraph("GMBH Examplefirma"));
        doc.add(new Paragraph("Geschäftsführer: Name A. Sutta"));
        doc.add(new Paragraph("straße 43h"));
        doc.add(new Paragraph("12345 Stadt"));
        doc.add(new Paragraph("Telefonnummer"));
        doc.add(new Paragraph("Webauftritt"));
        doc.add(new Paragraph("Email"));
        doc.add(new Paragraph("test").setFirstLineIndent(100));


//Close document
        try {
            doc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
