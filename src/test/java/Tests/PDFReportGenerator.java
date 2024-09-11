import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.io.IOException;

public class PDFReportGenerator {

    private Document document;
    private String filePath;

    public PDFReportGenerator(String filePath) {
        this.filePath = filePath;
        this.document = new Document();
    }

    public void startDocument() {
        try {
            PdfWriter.getInstance(document, new FileOutputStream(filePath));
            document.open();
        } catch (DocumentException | IOException e) {
            e.printStackTrace();
        }
    }

    public void addTitle(String title) {
        try {
            document.add(new Paragraph(title));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public void addSummary(String summary) {
        try {
            document.add(new Paragraph(summary));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public void addDetails(String details) {
        try {
            document.add(new Paragraph(details));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public void addFooter(String footer) {
        try {
            document.add(new Paragraph(footer));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
    }

    public void finishDocument() {
        document.close();
    }
}
