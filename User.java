package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class User {
	@Id
	private int id;
	private String name;
	private String address;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_book")
	private Booking book;
	public Booking getBook() {
		return book;
	}
	public void setBook(Booking book) {
		this.book = book;
	}
	public User(Booking book) {
		super();
		this.book = book;
	}
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_prop")
	private List<Properties> prop;
	
	public User() {
		super();
	}
	public User(int id, String name, String address, Booking book, List<Properties> prop) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.book = book;
		this.prop = prop;
	}
	public User(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Properties> getProp() {
		return prop;
	}
	public void setProp(List<Properties> prop) {
		this.prop = prop;
	}
	
}
