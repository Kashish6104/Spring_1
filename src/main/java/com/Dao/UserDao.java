package com.Dao;

public class UserDao {

	  static UserDao userDao = null;
	 
	  private UserDao() {
		  
	  }
	  
	 public  static UserDao userDao() {
		 if (userDao == null){
			 userDao = new UserDao(); 
		 }
		return userDao; 
	 }
}
