class PdfDocument implements Document {
    String fileName;
    String author;
    int pageCount;
    String name;

    public PdfDocument(String fileName, String author, int pageCount) {
        this.fileName = fileName;
        this.author = author;
        this.pageCount = pageCount;
        System.out.println("Creating a PDF Document prototype.");
    }

    public PdfDocument(PdfDocument original) {
        this.fileName = original.fileName;
        this.author = original.author;
        this.pageCount = original.pageCount;
    }

    @Override
    public Document clone() {
        return new PdfDocument(this);
    }

    @Override
    public void open() {
        System.out.println("Opening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: PDF, File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
    }

    @Override
    public String getType() {
        return "PDF";
    }
}