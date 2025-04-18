class TextDocument implements Document {
    String filePath;
    String encoding;
    int wordCount;

    public TextDocument(String filePath, String encoding, int wordCount) {
        this.filePath = filePath;
        this.encoding = encoding;
        this.wordCount = wordCount;
        System.out.println("Creating a Text Document prototype.");
    }

    public TextDocument(TextDocument original) {
        this.filePath = original.filePath;
        this.encoding = original.encoding;
        this.wordCount = original.wordCount;
    }

    @Override
    public Document clone() {
        return new TextDocument(this);
    }

    @Override
    public void open() {
        System.out.println("Opening Text Document: " + filePath + " with encoding: " + encoding + " (" + wordCount + " words)");
        System.out.println("Type: Text, Path: " + filePath + ", Encoding: " + encoding + ", Words: " + wordCount);
    }

    @Override
    public String getType() {
        return "Text";
    }
}