package com.freecharge.accounts;

import java.util.Date;

public class CurrentAccount extends Account{

	private String type;
	
	public CurrentAccount(String ownerName, StringBuilder address, double balance, Date createdDate, String status) {
		super(ownerName, address, balance, createdDate, status);
		setType("Current");
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
