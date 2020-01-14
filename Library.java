
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Library {

    private String Name;
    private ArrayList<Book> Books;

    public Library(String Name){
        this.Books = new ArrayList<>();
    }

    public void AddBook(Book book){
        this.Books.add(book);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Book> getAllBooks() {
        return Books;
    }

    public String getStringAllBooks(){
        String myString = "";
        for (Book book : this.Books){
            myString += book.GetBookString() + "\n";
        }
        return myString;
    }

    public void addBook(Book book){
        if(book != null) this.Books.add(book);
    }

    public Book[] getBooksByAuthorName(String authorName){
        return this.Books.stream()
                .filter(x -> x.getAuthor() == authorName).toArray(Book[] :: new);
    }

    public boolean getAndRemoveBookWithISBN(long ISBN){
        Book book = this.Books
                .stream()
                .filter(x -> x.getISBN() == ISBN)
                .findFirst()
                .orElse(null);
        if (book != null) {
            return this.Books.remove(book);
        }
        else{
            return false;
        }
    }

    public void removeBooksByAuthor(String authorName){
        ArrayList<Book> books = new ArrayList<>();

        for (Book book : this.Books){
            if (book.getAuthor() == authorName) books.add(book);
        }

        this.Books.removeAll(books);
    }

    public String getBookByISBN(long ISBN) {
        Book book = this.Books.stream()
                .filter(x -> x.getISBN() == ISBN)
                .findFirst()
                .orElse(null);

        return book.GetBookString();
    }
}
