package com.bookstore.beans;

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
@Table(name = "customer")
@SequenceGenerator(name = "cuseq", initialValue = 1, allocationSize = 1000)
public class Customer {
	
	@Id
	@Column(name = "customerId")
	@Size(max=3)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cuseq")
	private int customerId;
	
	
	@Column(name = "customerName")
	@Size(min = 8, max = 30)
	@NotNull
	private String customerName;
	
	@Column(name = "email")
	@NotNull
	@Size(min = 10, max = 64)
	private String email;
	
	
	@Column(name = "password")
	@Size(min = 8, max = 16)
	@NotNull
	private String password;
	
	@Column(name = "phoneNumber")
	@Size(min = 10, max = 15)
	@NotNull
	private String phoneNumber;
	
	@Column(name = "address")
	@Size(min = 10, max = 128)
	@NotNull
	private String address;
	
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
	 * getters and setters.
	 */
	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
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
