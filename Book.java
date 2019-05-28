package com.bookstore.beans;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "book")
@SequenceGenerator(name = "bookseq", initialValue = 1, allocationSize = 1000)
public class Book {
	
	@Id
	@Column(name = "bookId")
	@Size(max=3)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bookseq")
	private int bookId;
	
	
	@Column(name = "category")
	@NotNull
	private String category;
	
	
	@Column(name = "title")
	@NotNull
	@Size(min =10 ,max = 128)
	private String title;
	
	
	@Column(name = "author")
	@NotNull
	@Size(min = 5, max = 64)
	private String author;
	
	@Column(name = "description")
	@Size(min = 200, max = 2000)
	private String description;
	
	@Column(name = "ISBNnumber")
	@Size(min = 10, max = 15)
	@NotNull
	private String ISBNnumber;
	
	@Column(name = "thumbnailImage")
	private String thumbnailImage;
	
	@Column(name = "price")
	private double price;
	
	@Column(name = "date")
	private Date date;

	/*
	 * Getters and Setters
	 */
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getISBNnumber() {
		return ISBNnumber;
	}

	public void setISBNnumber(String iSBNnumber) {
		ISBNnumber = iSBNnumber;
	}

	public String getThumbnailImage() {
		return thumbnailImage;
	}

	public void setThumbnailImage(String thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
