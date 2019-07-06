import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import org.junit.Test;
import ru.dmitrin.ee.pojo.Book;
import ru.dmitrin.ee.service.BookService;

import static org.junit.Assert.assertTrue;
import static ru.dmitrin.ee.util.Const.BOOK_NAME;

public class BookServiceIT {

    /**
     * Проверяет то, что загружается MockGenerator, используемый для тестов
     */
    @Test
    public void shouldCheckNumberIsMOCK() {
        Weld weld = new Weld();
        WeldContainer container = weld.initialize();
        BookService bookService = container.instance().select(BookService.class).get();
        Book book = bookService.createBook("H2G2", 12.5f, BOOK_NAME);
        assertTrue(book.getNumber().startsWith("MOCK"));
        weld.shutdown();
    }
}
