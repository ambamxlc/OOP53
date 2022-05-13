public class Tv {
    private String showName;
    private int numEpisodes;
    private String genre;

    public Tv(String showName, int numEpisodes, String genre) {
        this.showName = showName;
        this.numEpisodes = numEpisodes;
        this.genre = genre;
    }

    public Tv(String showName, int numEpisodes) {
        this.showName = showName;
        this.numEpisodes = numEpisodes;
    }

    public Tv(String showName, String genre) {
        this.showName = showName;
        this.genre = genre;
    }

    public Tv(int numEpisodes, String genre) {
        this.numEpisodes = numEpisodes;
        this.genre = genre;
    }

    public Tv(String showName) {
        this.showName = showName;
    }

    public String getShowName() { return showName; }
    public void setShowName(String showName) { this.showName = showName; }

    public int getNumEpisodes() { return numEpisodes; }
    public void setNumEpisodes(int numEpisodes) { this.numEpisodes = numEpisodes; }

    public String getGenre() { return genre; }
    public void setGenre(String genre) { this.genre = genre; }

    @Override
    public String toString() {
        return getShowName() + " is a " + getGenre() + " show with " + getNumEpisodes() + " episodes. RNGesus deems it.";
    }
}