package com.aptech.DAO;

import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.aptech.model.UserLoginModel;
import com.aptech.model.UserDataModel;

public class UserModelDAO {
//	Connect to db using hibernate
	SessionFactory SessionFact;
	Session Sesh;
	
	public UserModelDAO() {
		SessionFact = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(UserDataModel.class).buildSessionFactory();
	}
	
	public UserDataModel GetUser(String UserLoginUsername) {
		this.Sesh = this.SessionFact.getCurrentSession();
		this.Sesh.beginTransaction();
		 
		Query query =Sesh.createQuery("FROM userdata WHERE USERNAME =: UserName");
		query.setParameter("UserName", UserLoginUsername);
		UserDataModel fromdb = (UserDataModel) query.list().get(0);
//		UserLoginModel fromdb = this.Sesh.get(UserLoginModel.class, UserLoginEmailId);
		return fromdb;
	}
	
	public void CreateUser(UserDataModel UserReg) {
		this.Sesh = this.SessionFact.getCurrentSession();
		this.Sesh.beginTransaction();
		Sesh.save(UserReg);
		Sesh.getTransaction().commit();
	}
}
