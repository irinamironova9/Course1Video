public class Book {
    private final String title;
    private final String author;
    private int publishingYear;

    public Book(String title, String author, int publishingYear) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (published in " + publishingYear + ")";
    }
}
