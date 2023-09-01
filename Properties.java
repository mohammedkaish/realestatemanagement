package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Properties {

	@Id
	private int propid;
	private double price;
	private String location;
	public Properties(int propid, double price, String location) {
		super();
		this.propid = propid;
		this.price = price;
		this.location = location;
	}
	public Properties() {
		super();
	}
	public int getPropid() {
		return propid;
	}
	public void setPropid(int propid) {
		this.propid = propid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
