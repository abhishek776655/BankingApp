package com.freecharge.accounts;

import java.util.Date;

public class Account {
	private String ownerName;
	private StringBuilder address;
	private double balance;
	private Date createdDate;
	private String status;
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public StringBuilder getAddress() {
		return address;
	}
	public void setAddress(StringBuilder address) {
		this.address = address;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Account(String ownerName, StringBuilder address, double balance, Date createdDate, String status) {
		super();
		this.ownerName = ownerName;
		this.address = address;
		this.balance = balance;
		this.createdDate = createdDate;
		this.status = status;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void deposit(double depositAmount) {
		if(depositAmount>0) {
		this.balance = this.balance + depositAmount;
		}
		else {
			System.out.println("Please enter correct amuount");
		}
		
	}
	
	public void showBalance() {
		System.out.println("Balance" + this.balance);
	}
	
	public void withdrawal(double withdrawalAmount) {
		
		if(this.balance >= withdrawalAmount) {
			this.balance = this.balance - withdrawalAmount;
		}
		else {
			System.out.println("Not Enough money");
		}
		
	}
}
