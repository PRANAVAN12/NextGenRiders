package com.nextgen.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Rides")
public class RideOuts {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int id;

	@Column(name = "username")
	protected String username;

	@Column(name = "rent_date")
	protected String rent_date;

	@Column(name = "days")
	protected Float days;

	@Column(name = "bike")
	protected String bike;
	
	@Column(name = "feedbacks")
	protected String feedbacks;
	
	@Column(name = "Reviews")
	protected String Points;

	public RideOuts() {
		super();
		// TODO Auto-generated constructor stub
		
	}

	public RideOuts(int id, String username, String rent_date, Float days, String bike, String feedbacks,
			String points) {
		super();
		this.id = id;
		this.username = username;
		this.rent_date = rent_date;
		this.days = days;
		this.bike = bike;
		this.feedbacks = feedbacks;
		Points = points;
	}

	public RideOuts(String username, String rent_date, Float days, String bike, String feedbacks, String points) {
		super();
		this.username = username;
		this.rent_date = rent_date;
		this.days = days;
		this.bike = bike;
		this.feedbacks = feedbacks;
		Points = points;
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

	public Float getDays() {
		return days;
	}

	public void setDays(Float days) {
		this.days = days;
	}

	public String getBike() {
		return bike;
	}

	public void setBike(String bike) {
		this.bike = bike;
	}

	public String getFeedbacks() {
		return feedbacks;
	}

	public void setFeedbacks(String feedbacks) {
		this.feedbacks = feedbacks;
	}

	public String getPoints() {
		return Points;
	}

	public void setPoints(String points) {
		Points = points;
	}
	
	

	}