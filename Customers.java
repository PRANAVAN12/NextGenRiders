package com.nextgen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customers {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int id;

	@Column(name = "username")
	protected String username;

	@Column(name = "email")
	protected String email;

	@Column(name = "country")
	protected String country;

	@Column(name = "password")
	protected String password;

	@Column(name = "phone")
	protected String phone;

	public Customers() {
	}

	public Customers(String username, String email, String country, String password, String phone) {
		super();
		this.username = username;
		this.email = email;
		this.country = country;
		this.password = password;
		this.phone = phone;

	}

	public Customers(int id, String username, String email, String country, String password, String phone) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.country = country;
		this.password = password;
		this.phone = phone;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
