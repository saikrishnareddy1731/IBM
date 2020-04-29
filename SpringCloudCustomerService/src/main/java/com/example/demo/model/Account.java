package com.example.demo.model;

public class Account {

	private Integer id;
	private String number;
	
	public Account(Integer id, String number) {
		super();
		this.id = id;
		this.number = number;
	}
	public Account() {
		super();
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", number=" + number + "]";
	}
	
}
