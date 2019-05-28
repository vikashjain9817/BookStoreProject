package com.bookstore.beans;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Table(name = "orders")
@SequenceGenerator(name = "ordseq", initialValue = 500, allocationSize = 1000)
public class Orders {
	
	@Id
	@Column(name = "orderId")
	@Size(max=3)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ordseq")
	private int id;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@NotNull
	@JoinColumn(name = "customerid")
	private Customer customer;
	
	@OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "bookId")
	@NotNull
	private Book book;
	
	@Column(name = "bookCopies")
	@NotNull
	private int bookCopies;
	
	
	@Column(name = "totalprice")
	@NotNull
	private double totalBookPrice;
	
	@Column(name = "status")
	@NotNull
	@Size(max = 10)
	@Pattern(regexp = "\\b(PROCESSING|ORDERED|SHIPPED|DELIVERED)\\b")
	private String Status;
	
	
	@Column(name = "orderdate")
	@NotNull
	private Date orderDate;
	
	@Column(name = "paymentMethod")
	@NotNull
	private String method;
	
	@Column(name = "recipientName")
	@NotNull
	@Size(min = 8, max = 30)
	private String recipientName;
	
	@Column(name = "recipientPhone")
	@Size(min = 10, max = 15)
	@NotNull
	private String recipientPhone;
	
	
	@Column(name = "streetAddress")
	@Size(min = 10, max = 128)
	@NotNull
	private String streetAddress;
	
	@Column(name = "city")
	@Size(min = 3, max = 32)
	@NotNull
	private String city;
	
	@Column(name = "zipCode")
	@Size(min = 3, max = 24)
	@NotNull
	private String zipCode;
	
	@Column(name = "country")
	@Size(min = 3, max = 64)
	@NotNull
	private String country;

	/*
	 * Getters and Setters
	 */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public int getBookCopies() {
		return bookCopies;
	}

	public void setBookCopies(int bookCopies) {
		this.bookCopies = bookCopies;
	}

	public double getTotalBookPrice() {
		return totalBookPrice;
	}

	public void setTotalBookPrice(double totalBookPrice) {
		this.totalBookPrice = totalBookPrice;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getRecipientName() {
		return recipientName;
	}

	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}

	public String getRecipientPhone() {
		return recipientPhone;
	}

	public void setRecipientPhone(String recipientPhone) {
		this.recipientPhone = recipientPhone;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
}
