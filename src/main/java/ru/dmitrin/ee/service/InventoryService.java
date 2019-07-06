package ru.dmitrin.ee.service;

import ru.dmitrin.ee.annotations.Added;
import ru.dmitrin.ee.annotations.Removed;
import ru.dmitrin.ee.pojo.Book;

import javax.enterprise.event.Observes;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class InventoryService {

	@Inject
	private Logger logger;

	List<Book> inventory = new ArrayList<>();

	public void addBook(@Observes @Added Book book) {
		logger.warning("Книга " + book.getTitle() + " добавлена в список");
		inventory.add(book);
	}

	public void removeBook(@Observes @Removed Book book) {
		logger.warning("Книга " + book.getTitle() + " удалена из списка");
		inventory.remove(book);
	}

//	void addBook(@Observes @Added @Price(greaterThan=100) Book book) {
//		System.out.println("something");
//	}
}
