package com.mcit.webapp;

public class FullName {

	// full name maker fn
	public String combine(String firstName, String lastName) {
		if(firstName!= null & lastName != null) {
			return firstName +" "+lastName;
		}
		return null;
	}
}
