package ru.dmitrin.ee.service;

import ru.dmitrin.ee.annotations.Added;
import ru.dmitrin.ee.annotations.Removed;
import ru.dmitrin.ee.annotations.ThirteenDigits;
import ru.dmitrin.ee.service.generators.NumberGenerator;

import javax.enterprise.event.Event;
import javax.inject.Inject;
import ru.dmitrin.ee.pojo.Book;

public class BookService {

	@Inject @ThirteenDigits
	private NumberGenerator numberGenerator;

	@Inject
	@Added
	private Event<Book> bookAddedEvent;

	@Inject
	@Removed
	private Event<Book> bookRemovedEvent;

	public Book createBook(String title, Float price, String description) {
		Book book = new Book(title, price, description);
		book.setNumber(numberGenerator.generateNumber());
		bookAddedEvent.fire(book);
		return book;
	}

	public void deleteBook(Book book) {
		bookRemovedEvent.fire(book);
	}
}
