package jehe7package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Create_the_database2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection =	DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
//		Statement statement=	connection.createStatement();
//		statement.execute("create database facebook");
		Connection connection1 =	DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook","root","root");
		Statement statement1=	connection1.createStatement();
//		statement1.execute("create table user (u_id integer primary key, u_name varchar(55) not null, u_email varchar(55) not null, u_ph integer )");
//		statement1.execute("insert into user values(1,'tarun','tarun@gmail.com',74123)");
//		statement1.execute("insert into user values(2,'ramesh','ramesh@gmail.com',789566)");
//		statement1.execute("insert into user values(3,'suresh','suresh@gmail.com',555555)");
//		statement1.execute("insert into user values(4,'ravindhar','ravindhar@gmail.com',74123)");
//		statement1.execute("insert into user values(5,'kml','kml@gmail.com',963214)");
		
		
		
		ResultSet resultSet =	statement1.executeQuery("select * from user where u_id=1");
		while(resultSet.next())
		{
			System.out.println("u_id = "+resultSet.getInt(1)+"   s_nmae = "+resultSet.getString(2)+" s_email = "+resultSet.getString(3)+" s_ph = "+resultSet.getInt(4));
		}
		statement1.execute("drop table user");
		statement1.close();
	}
}
