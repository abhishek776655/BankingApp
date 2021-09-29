package com.freecharge.accounts;

import java.util.Date;

public class SavingAccount extends Account {
	private String type;
	public SavingAccount(String ownerName, StringBuilder address, double balance, Date createdDate, String status) {
		super(ownerName, address, balance, createdDate, status);
		setType("Saving");
		
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

}
