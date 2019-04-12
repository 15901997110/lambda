package com.edu.java8.lambda;

import java.time.LocalDate;

public class Book {
	private int id;
	private String name;
	private String author;
	private double price;
	private String type;
	private LocalDate publishDate;

	public Book(int id, String name, String author, double price, String type, LocalDate publishDate) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
		this.type = type;
		this.publishDate = publishDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "Book{" +
				"id=" + id +
				", name='" + name + '\'' +
				", author='" + author + '\'' +
				", price=" + price +
				", type='" + type + '\'' +
				", publishDate=" + publishDate +
				'}';
	}
}
