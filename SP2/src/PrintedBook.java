public class PrintedBook extends Title {
    private int pages;

    public PrintedBook(String title, String literatureType, int copies, int pages) {
        super(title, literatureType, copies);
        this.pages = pages;
    }

    @Override
    protected double calculatePoints() {
        return pages * calculateLiteraturePoints() * copies;
    }

    @Override
    protected double calculateLiteraturePoints() {
        switch (literatureType.toUpperCase()) {
            case "BI": return 3.0;
            case "TE": return 3.0;
            case "LYRIK": return 6.0;
            case "SKØN": return 1.7;
            case "FAG": return 1.0;
            default: return 1.0;
        }
    }
}
