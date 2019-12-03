import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;

import java.io.FileNotFoundException;
import java.net.MalformedURLException;

import static com.itextpdf.kernel.colors.ColorConstants.RED;

public class pdf {
    public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
        create_pdf("test.pdf", "Paul", "Mustermann", "Hacking für Anfänger", "12.12,2019", "Beispiel Anwalt");
    }
    public static void create_pdf(String file, String first_name, String sur_name, String kurs_name, String date, String desc) throws FileNotFoundException, MalformedURLException {
//Initialize writer
        PdfWriter writer = new PdfWriter(file);

        //data
        String sex = "male";

//Initialize document
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document doc = new Document(pdfDoc);

//Add paragraph to the document

        //Background
        ImageData bgdata = ImageDataFactory.create("bg.png");
        Image bg = new Image(bgdata).setFixedPosition(0, 0).setHeight(848).setWidth(595);
        doc.add(bg);


        //image
        ImageData data = ImageDataFactory.create("img.png");
        Image img = new Image(data).setFixedPosition(360, 80);
        doc.add(img);

        // font, style
        com.itextpdf.layout.Style Title = new Style()
                .setItalic()
                .setBold()
                .setFontColor(RED);

        //title
        //Paragraph U = new Paragraph("Urkunde");
        //U.setFontSize(55).setPadding(30).setMarginBottom(50).addStyle(Title);

        //Paragraph r = new Paragraph("rkunde").setFontColor(ColorConstants.BLACK);
        //r.setFontSize(43).setTextAlignment(TextAlignment.CENTER).setBold().setItalic().setFontColor(RED);
        //doc.add(U);

        doc.add(new Paragraph("").setPadding(110));

        //desc
        if (sex.equals("male")){
            doc.add(new Paragraph("Sehr Geehrter Herr " + first_name + " " + sur_name + ".").setFontSize(20));
        }else {
            doc.add(new Paragraph("Sehr Geehrte Frau " + first_name + " " + sur_name + ".").setFontSize(20));
        }

        doc.add(new Paragraph("Wir freuen uns, das sie den Kurs \n" + kurs_name + " am " + date+ " \n erfolgreich bei uns Absolviert haben.").setFontSize(18));
        doc.add(new Paragraph("Durch den Besuch haben sie wichtige Erkentnisse gewonnen \n und das Zertifikat " + desc + " erhalten.").setFontSize(18));

        doc.add(new Paragraph("").setPaddingBottom(100));

        //Footer
        doc.add(new Paragraph("Mit Freundlichen Grüßen").setFontSize(18));
        doc.add(new Paragraph("GMBH Examplefirma"));
        doc.add(new Paragraph("Geschäftsführer: Name A. Sutta"));
        doc.add(new Paragraph("Bspstraße 43h"));
        doc.add(new Paragraph("12345 EineStadt"));
        doc.add(new Paragraph("Telefonnummer: 00000000"));
        doc.add(new Paragraph("Webauftritt: www.example.de"));
        doc.add(new Paragraph("Email: example.gmail.de"));
        //doc.add(new Paragraph("test").setFirstLineIndent(100));
        //doc.add(new AreaBreak()); new side

//Close document
        try {
            doc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
