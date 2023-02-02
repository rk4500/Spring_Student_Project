package com.aptech.service;

import com.aptech.DAO.UserModelDAO;
import com.aptech.model.UserDataModel;
import com.aptech.model.UserLoginModel;

public class UserLoginModelService {
	UserModelDAO UserLoginMDAO;
	
	public UserDataModel verifycredentials(UserLoginModel UserLoginM) {
		UserLoginMDAO = new UserModelDAO();
		UserDataModel Compare = UserLoginMDAO.GetUser(UserLoginM.getUsername());
		
		if(Compare.getUsername().equals(UserLoginM.getUsername()) && Compare.getPassword().equals(UserLoginM.getPassword())) {
			return Compare;
		}
		return null;
	}
}
