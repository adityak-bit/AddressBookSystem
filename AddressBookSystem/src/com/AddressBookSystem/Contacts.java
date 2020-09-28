package com.AddressBookSystem;

public class Contacts {
	public String firstName;
	public String lastName;
	public String address;
	public String city;
	public String state;
	public double zip;
	public double phoneNumber;
	public String email;

	public Contacts(String firstName, String lastName, String address, String city, String state, double zip,
			double phoneNumber, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

}
