package com.gdut.ch07;

public class Name {
	private String firstName, lastName;

	public Name(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Name [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return firstName.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Name) {
			Name name = (Name)obj;
			return (firstName.equals(name.firstName))
						&& (lastName.equals(name.lastName));
		}
		return super.equals(obj);
	}
	
	
	
}
