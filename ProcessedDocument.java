public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        Document pdfDoc = registry.createPdfClone("annual_report_2024.pdf", 150);
        pdfDoc.open();
        System.out.println();

        Document textDoc = registry.getTextDocumentPrototype();
        textDoc.open();
        System.out.println();

        Document spreadsheetDoc = registry.getSpreadsheetPrototype();
        spreadsheetDoc.open();
        System.out.println();

        Document summaryPdf = registry.createPdfClone("summary_report.pdf", 30);
        summaryPdf.open();
    }
}