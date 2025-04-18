class DocumentRegistry {
    private final PdfDocument pdfPrototype;
    private final TextDocument textDocumentPrototype;
    private final SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        pdfPrototype = new PdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
        textDocumentPrototype = new TextDocument("meeting_notes.txt", "UTF-8", 250);
        spreadsheetPrototype = new SpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
    }

    public Document createPdfClone(String fileName, int pageCount) {
        PdfDocument clone = (PdfDocument) pdfPrototype.clone();
        clone.fileName = fileName;
        clone.pageCount = pageCount;
        return clone;
    }

    public Document getTextDocumentPrototype() {
        return textDocumentPrototype.clone();
    }

    public Document getSpreadsheetPrototype() {
        return spreadsheetPrototype.clone();
    }
}