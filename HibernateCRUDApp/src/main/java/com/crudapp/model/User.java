package com.crudapp.model;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Entity;

@Entity
@DynamicInsert()
public class User {
	
	public User() {
		System.out.println("Zero Arg Constuctor is being called by hibernate internally");
	}
	
	private Integer userID;
	private String userFirstName;
	private String userLastName;
	private Integer userContact;
	
	public Integer getUserID() {
		return userID;
	}
	public void setUserID(Integer userID) {
		this.userID = userID;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public Integer getUserContact() {
		return userContact;
	}
	public void setUserContact(Integer userContact) {
		this.userContact = userContact;
	}
	
	@Override
	public String toString() {
		return "User [userID=" + userID + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", userContact=" + userContact + "]";
	}
	
	
}
