package com;

public class App 
{
    public static void main( String[] args )
    {
        UserDao userDao1 = UserDao.userDao();
        UserDao userDao2 = UserDao.userDao();
        UserDao userDao3 = UserDao.userDao();
        UserDao userDao4 = UserDao.userDao();
    
    	System.out.println(userDao1);
    	System.out.println(userDao2);
    	System.out.println(userDao3);
    	System.out.println(userDao4);
    }
}
