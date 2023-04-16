package com.flight.main;

class Registration{
	private String name;
	private String email;
	private String contactNumber;
	static Registration arr[];
	private static int index;
	public Registration() {
		// TODO Auto-generated constructor stub
	}
	
	public Registration(String name, String email, String contactNumber) {
		this.name = name;
		this.email = email;
		this.contactNumber = contactNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String string) {
		this.contactNumber = string;
	}
	
	public void register(Registration user) {
		if(arr!=null) {
		Registration.arr[index]=user;
		index ++;
			}
		
	}
}