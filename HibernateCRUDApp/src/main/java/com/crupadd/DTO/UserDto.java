package com.crupadd.DTO;

public class UserDto {
	public UserDto() {
		System.out.println("Zero Arg Constuctor is being called by hibernate internally");
	}
	
	private Integer userDtoID;
	private String userDtoFirstName;
	private String userDtoLastName;
	private Integer userDtoContact;
	
	public Integer getUserDtoID() {
		return userDtoID;
	}
	public void setUserDtoID(Integer userDtoID) {
		this.userDtoID = userDtoID;
	}
	public String getUserDtoFirstName() {
		return userDtoFirstName;
	}
	public void setUserDtoFirstName(String userDtoFirstName) {
		this.userDtoFirstName = userDtoFirstName;
	}
	public String getUserDtoLastName() {
		return userDtoLastName;
	}
	public void setUserDtoLastName(String userDtoLastName) {
		this.userDtoLastName = userDtoLastName;
	}
	public Integer getUserDtoContact() {
		return userDtoContact;
	}
	public void setUserDtoContact(Integer userDtoContact) {
		this.userDtoContact = userDtoContact;
	}
	
	@Override
	public String toString() {
		return "UserDto [userDtoID=" + userDtoID + ", userDtoFirstName=" + userDtoFirstName + ", userDtoLastName="
				+ userDtoLastName + ", userDtoContact=" + userDtoContact + "]";
	}
	
	
	
	
}
