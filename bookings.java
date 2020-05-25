package com.nextgen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookings")
public class bookings {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int id;

	@Column(name = "username")
	protected String username;

	@Column(name = "rent_date")
	protected String rent_date;

	@Column(name = "destination_start")
	protected String destination_start;

	@Column(name = "payment")
	protected Float payment;

	@Column(name = "bike")
	protected String bike;

	public bookings() {
	}

	public bookings(String username, String rent_date, String destination_start,  Float payment,
			String bike) {
		super();
		this.username = username;
		this.rent_date = rent_date;
		this.destination_start = destination_start;
		
		this.payment = payment;
		this.bike = bike;

	}
	public bookings(int id,String username, String rent_date, String destination_start, Float payment,
			String bike) {
		super();
		this.id=id;
		this.username = username;
		this.rent_date = rent_date;
		this.destination_start = destination_start;
		
		this.payment = payment;
		this.bike = bike;

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

	public String getRent_date() {
		return rent_date;
	}

	public void setRent_date(String rent_date) {
		this.rent_date = rent_date;
	}

	public String getDestination_start() {
		return destination_start;
	}

	public void setDestination_start(String destination_start) {
		this.destination_start = destination_start;
	}

	

	public Float getPayment() {
		return payment;
	}

	public void setPayment(Float payment) {
		this.payment = payment;
	}

	public String getBike() {
		return bike;
	}

	public void setBike(String bike) {
		this.bike = bike;
	}

}
