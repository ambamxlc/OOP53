public class Books {
    private String title;
    private int numbPg;
    private int pubYear;

    public Books(String title, int numbPg, int publiYr) {
        this.title = title;
        this.numbPg = numbPg;
        this.pubYear = publiYr;
    }

    public Books(String title, int numbPg) {
        this.title = title;
        this.numbPg = numbPg;
    }

    public Books(String title) {
        this.title = title;
    }

    public Books(int publiYr) {
        this.pubYear = publiYr;
    }

    public String getTitle() { return title; }

    @Override
    public String toString() {
        return title + ", " + numbPg + " pages ," + pubYear;
    }
}