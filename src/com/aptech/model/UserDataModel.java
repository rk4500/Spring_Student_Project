package com.aptech.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "userdata")
public class UserDataModel {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "EMAILID")
	private String Emailid;
	@Column(name = "PASSWORD")
	private String Password;
	@Column(name = "USERNAME")
	private String Username;
	@Column(name = "FNAME")
	private String FName;
	@Column(name = "LNAME")
	private String LName;
	@Column(name = "C")
	private Boolean C;
	@Column(name = "CPP")
	private Boolean CPP;
	@Column(name = "JAVA")
	private Boolean Java;
	@Column(name = "HTML")
	private Boolean HTML;
	@Column(name = "CSS")
	private Boolean CSS;
	@Column(name = "JAVASCRIPT")
	private Boolean JAVASCRIPT;
	@Column(name = "MYSQL")
	private Boolean Mysql;
	@Column(name = "REACT")
	private Boolean React;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmailId() {
		return Emailid;
	}
	public void setEmailId(String emailId) {
		Emailid = emailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getFName() {
		return FName;
	}
	public void setFName(String fName) {
		FName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public Boolean getC() {
		return C;
	}
	public void setC(Boolean c) {
		C = c;
	}
	public Boolean getCPP() {
		return CPP;
	}
	public void setCPP(Boolean cPP) {
		CPP = cPP;
	}
	public Boolean getJava() {
		return Java;
	}
	public void setJava(Boolean java) {
		Java = java;
	}
	public Boolean getHTML() {
		return HTML;
	}
	public void setHTML(Boolean hTML) {
		HTML = hTML;
	}
	public Boolean getCSS() {
		return CSS;
	}
	public void setCSS(Boolean cSS) {
		CSS = cSS;
	}
	public Boolean getJAVASCRIPT() {
		return JAVASCRIPT;
	}
	public void setJAVASCRIPT(Boolean jAVASCRIPT) {
		JAVASCRIPT = jAVASCRIPT;
	}
	public Boolean getMysql() {
		return Mysql;
	}
	public void setMysql(Boolean mysql) {
		Mysql = mysql;
	}
	public Boolean getReact() {
		return React;
	}
	public void setReact(Boolean react) {
		React = react;
	}
	
	

}
