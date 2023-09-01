package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Booking {
	@Id
	private int bookingid;
	private String bookingdate;
	private String bookingdetails;
	public Booking(int bookingid, String bookingdate, String bookingdetails) {
		super();
		this.bookingid = bookingid;
		this.bookingdate = bookingdate;
		this.bookingdetails = bookingdetails;
	}
	public Booking() {
		super();
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(String bookingdate) {
		this.bookingdate = bookingdate;
	}
	public String getBookingdetails() {
		return bookingdetails;
	}
	public void setBookingdetails(String bookingdetails) {
		this.bookingdetails = bookingdetails;
	}
	
	
}
