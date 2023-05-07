package jehe7package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Createtable {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection =	DriverManager.getConnection("jdbc:mysql://localhost:3306/jehe7","root","root");
	Statement statement =	connection.createStatement();
	statement.execute("create table std (s_id  integer primary key,s_name varchar(50) not null,s_email varchar(50) not null, s_ph integer unique not null)");
	System.out.println("table created sucessfuly");
	statement.close();
	
	}
	

}
