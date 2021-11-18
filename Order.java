package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Order {
	@Id
    private int id;
    private String name;
    private String date;
    private String amount;
    
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(int id, String name, String date, String amount) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.amount = amount;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
    
}
