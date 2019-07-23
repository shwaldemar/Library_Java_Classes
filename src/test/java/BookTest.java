import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book("Simons Biography", "Simon Hall", "Science Fiction");
    }

    @Test
    public void hasTitle() {
        assertEquals("Simons Biography", book.getTitle());
    }

    @Test
    public void hasAuthor() {
        assertEquals("Simon Hall", book.getAuthor());
    }

    @Test
    public void hasGenre() {
        assertEquals("Science Fiction", book.getGenre());
    }



}
