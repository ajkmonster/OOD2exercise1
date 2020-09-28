package com.fdmgroup.ood2exercise1;

public class User {

	private String name;
	private String address;
	private String email;
	
	public User() {
		
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		String user = "Name: " + this.name + "\n" +
					"Address: " + this.address + "\n" +
					"Email: " + this.email + ",\n";
		return user;
	}
}
