
public final class Book {

    public Book(String title, String author, String BookPublisher, int PublishingYear, long ISBN){
        this.setTitle(title);
        this.setAuthor(author);
        this.setPublisher(BookPublisher);
        this.setYearOfPublishing(PublishingYear);
        this.setISBN(ISBN);
    }

    private int PublishingYear;
    private long ISBN;
    private String Title;
    private String Author;
    private String BookPublisher;


    public void setTitle(String title) {
        Title = title;
    }
    public String getTitle() {
        return Title;
    }

    public void setAuthor(String author) {
        Author = author;
    }
    public String getAuthor() {
        return Author;
    }

    public void setPublisher(String publisher) {
        BookPublisher = publisher;
    }
    public String getPublisher() {
        return BookPublisher;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        PublishingYear = yearOfPublishing;
    }
    public int getYearOfPublishing() {
        return PublishingYear;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }
    public long getISBN() {
        return ISBN;
    }

    public String GetBookString(){
        return new String(
                this.getAuthor() + " " + this.getTitle() + " " + this.getPublisher() + " " + this.getYearOfPublishing() + " "  + this.getISBN());
    }
}
