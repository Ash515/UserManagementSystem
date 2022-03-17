package net.javaguide.usermanagement.dao;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;

//this dao class provides crud operations for the tale users in the database
public class Userdao {
	
private String jdbcURL ="jdbc:mysql://localhost:3306/demo?useSSL=false";
private String jdbcUserName="root";
private String jdbcPassword="";

private static final String INSERT_USER_SQL="INSERT INTO users"+"(name,email,country) VALUES"+"(?,?,?);";
private static final String SELECT_USER_SQL="select id,name,email,country from users where id =?";
private static final String SELECT_ALLUSER_SQL="select * from users";
private static final String DELETE_USER_SQL="delete from users where id=?";
private static final String UPDATE_USER_SQL="update users set name=?,email=?,country=? where id=?";

protected Connection getConnection() {
	Connection connection=null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection(jdbcURL,jdbcUserName,jdbcPassword);
		
	}catch(ClassNotFoundException e) {
		e.printStackTrace();
	}
	return connection;
}

//create or insert user
//update user
//select user by id
//select users
//delete users

public 




}
