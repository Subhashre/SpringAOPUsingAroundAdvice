package org.subha.service;

import java.util.Comparator;

public class CustomerService  {

	private String Name;
	private String Email;
	public void setName(String name) {
		Name = name;
	}
	public void setEmail(String email) {
		Email = email;
	}
	
	public void printName() {
		System.out.println("Customer name : " + this.Name);
	}

	public void printEmail() {
		System.out.println("Customer website : " + this.Email);
	}

	public void printThrowException() {
		try{		
		throw new IllegalArgumentException();
		}
		catch(Exception e){
			System.out.println("Exception Caught.");
		}
	}
	
}
