package ru.dmitrin.ee.pojo;

public class Book {

	private String title;
	private Float price;
	private String description;
	private String number;

	public Book(String title, Float price, String description) {
		this.title = title;
		this.price = price;
		this.description = description;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
