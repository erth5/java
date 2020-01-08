import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;

import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Date;

import static com.itextpdf.kernel.colors.ColorConstants.RED;

public class PDF {
    // Informationsveranstalter info
    public static void createPDF(Kunde costumer, Seminar seminar) throws IOException {
        //get values from costumer
        String first_name = costumer.getVorname();
        String sur_name = costumer.getNachname();
        String email = costumer.getEmail_adresse();
        String place = costumer.getOrt();
        String plz = costumer.getPlz();
        String street = costumer.getStrasse();
        String house_number = costumer.getHausnummer();
        Date birth_date = costumer.getGeburtsdatum();

        //get values from seminar
        String title = seminar.getTitel_seminar();
        String desc = seminar.getBeschreibung();
        Date date = (Date) seminar.getDatum();      //proof of right format

        //get info

        //for out
        String out = "sft.pdf";
        //Initialize writer
        PdfWriter writer = new PdfWriter(out);
        PdfDocument pdfDoc = new PdfDocument(writer);
        Document doc = new Document(pdfDoc);

        //Add objects to the document

        //Background
        ImageData bgdata = null;
        try {
            bgdata = ImageDataFactory.create("background.png");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Image bg = new Image(bgdata).setFixedPosition(0, 0).setHeight(848).setWidth(598);
        doc.add(bg);

        //image
        ImageData data = null;
        try {
            data = ImageDataFactory.create("ico.png");//set ico.png
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        Image img = new Image(data).setFixedPosition(360, 70);
        doc.add(img);

        // font, style
        com.itextpdf.layout.Style Title = new Style()
                .setItalic()
                .setBold()
                .setFontColor(RED);

        doc.add(new Paragraph("").setPadding(110));

        //sex of person ?
        String sex = "male";
        if (sex.equals("male")){
            doc.add(new Paragraph("Sehr Geehrter Herr " + first_name + " " + sur_name + ",").setFontSize(20));
        }else {
            doc.add(new Paragraph("Sehr Geehrte Frau " + first_name + " " + sur_name + ".").setFontSize(20));
        }

        doc.add(new Paragraph("wir freuen uns, das sie den Kurs " + title + " am " + date+ " erfolgreich bei uns Absolviert haben.").setFontSize(18));   //\n
        doc.add(new Paragraph(" "));
        doc.add(new Paragraph(desc).setFontSize(18));
        doc.add(new Paragraph("Die Firma Hybertech stellt ihnen daher das Zertifikat aus.").setFontSize(18));

        //Footer
        doc.add(new Paragraph("").setPaddingBottom(60));
        doc.add(new Paragraph("Mit Freundlichen Grüßen").setFontSize(18));
        doc.add(new Paragraph("F-Planer GMBH"));
        doc.add(new Paragraph("Geschäftsführer: Name A. Sutta"));
        doc.add(new Paragraph("Bspstraße 43h"));
        doc.add(new Paragraph("12345 EineStadt"));
        doc.add(new Paragraph("Telefonnummer: 00000000"));
        doc.add(new Paragraph("Webauftritt: www.example.de"));
        doc.add(new Paragraph("Email: F-planer@gmail.de"));
        //Close document
        try {
            doc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
