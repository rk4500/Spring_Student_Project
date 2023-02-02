package com.aptech.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

@Entity(name = "userdata")
public class UserLoginModel {
	@Column(name = "USERNAME")
	private String username;
	@Column(name = "PASSWORD")
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserLoginModel [username=" + username + ", password=" + password + "]";
	}
	


}