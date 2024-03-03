package com.crudapp.Service;

import com.crudapp.model.User;

public interface IUserService {

	// to be implemented inside service implementation class which implements IUserService
	
	public String addUser(String userFirstName,String userLastName,Integer userContact);
	public String searchUser(Integer userID);
	public String updateUser(User user);
	public String deleteUser(Integer userID);
}
