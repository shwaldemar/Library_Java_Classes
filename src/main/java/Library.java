import java.util.ArrayList;

public class Library {

    private String name;
    private int capacity;
    private ArrayList<Book> books;

    public Library(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.books = new ArrayList<Book>();
    }

    public int countBooks() {
        return this.books.size();
    }

    public int addBook(Book book) {
        this.books.add(book);
        return this.books.size();

    }

    public void removeBook(Book book) {
        this.books.remove(book);
    }
}