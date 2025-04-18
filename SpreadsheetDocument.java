class SpreadsheetDocument implements Document {
    String spreadsheetName;
    int rowCount;
    int columnCount;

    public SpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        this.spreadsheetName = spreadsheetName;
        this.rowCount = rowCount;
        this.columnCount = columnCount;
        System.out.println("Creating a Spreadsheet Document prototype.");
    }

    public SpreadsheetDocument(SpreadsheetDocument original) {
        this.spreadsheetName = original.spreadsheetName;
        this.rowCount = original.rowCount;
        this.columnCount = original.columnCount;
    }

    @Override
    public Document clone() {
        return new SpreadsheetDocument(this);
    }

    @Override
    public void open() {
        System.out.println("Opening Spreadsheet Document: " + spreadsheetName + " (" + rowCount + " rows, " + columnCount + " columns)");
        System.out.println("Type: Spreadsheet, Name: " + spreadsheetName + ", Rows: " + rowCount + ", Columns: " + columnCount);
    }

    @Override
    public String getType() {
        return "Spreadsheet";
    }
}