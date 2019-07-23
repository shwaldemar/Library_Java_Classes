import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void setUp() {
        library = new Library("Simons", 1000);
    }

    @Test
    public void libraryStartsEmpty() {
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBookToLibrary() {
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void canRemoveBookFromLibrary() {
        library.addBook(book);
        assertEquals(1, library.countBooks());
        library.removeBook(book);
        assertEquals(0, library.countBooks());
    }


}