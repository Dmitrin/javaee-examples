package ru.dmitrin.ee.main;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;
import ru.dmitrin.ee.pojo.Book;
import ru.dmitrin.ee.service.BookService;

import static ru.dmitrin.ee.util.Const.BOOK_NAME;

public class Main {

	public static void main(String[] args) {
		Weld weld = new Weld();
		WeldContainer container = weld.initialize();
		BookService bookService =
			container.instance().select(BookService.class).get();
		Book book = bookService.createBook("H2G2", 12.5f, BOOK_NAME);
			System.out.println(book);
		weld.shutdown();
	}
}
