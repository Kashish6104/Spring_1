package com;

public class UserDao {

	  static UserDao userDao = null;
	 
	 public  static UserDao userDao() {
		 if (userDao == null){
			 userDao = new UserDao(); 
		 }
		return userDao; 
	 }
}
