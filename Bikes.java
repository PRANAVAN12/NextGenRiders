package com.nextgen.model;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "bikes")
public class Bikes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int id;

	@Column(name = "bikename")
	protected String bikename;
	
	@Column(name = "bikeimg")
	protected Blob bikeimg;

	@Column(name = "description")
	protected String description;

	@Column(name = "Quantity")
	protected int Quantity;

	@Column(name = "Price")
	protected Float Price;

	

	public Bikes() {
	}

	public Bikes(String bikename, String description, int Quantity, Float Price ,Blob bikeimg) {
		super();
		this.bikename = bikename;
		this.description = description;
		this.Quantity = Quantity;
		this.Price = Price;
		this.bikeimg=bikeimg;
		

	}
	public Bikes(int id,String bikename, String description, int Quantity, Float Price,Blob bikeimg) {
		super();
		this.id=id;
		this.bikename = bikename;
		this.description = description;
		this.Quantity = Quantity;
		this.Price = Price;
		this.bikeimg=bikeimg;

	}

	public Blob getBikeimg() {
		return bikeimg;
	}

	public void setBikeimg(Blob bikeimg) {
		this.bikeimg = bikeimg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBikename() {
		return bikename;
	}

	public void setBikename(String bikename) {
		this.bikename = bikename;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public Float getPrice() {
		return Price;
	}

	public void setPrice(Float price) {
		Price = price;
	}

	
}
