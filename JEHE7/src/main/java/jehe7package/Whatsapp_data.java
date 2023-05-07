package jehe7package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Whatsapp_data {

	public static void main(String[] args) throws Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");
//		Connection connection =	DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
//			Statement statement = connection.createStatement();
//			statement.execute("create database whatsapp");
			Connection connection1 =	DriverManager.getConnection("jdbc:mysql://localhost:3306/whatsapp","root","root");
			Statement statement2 = connection1.createStatement();
//			statement2.execute("create table user(u_id integer primary key , u_name varchar(55) not null,u_email varchar(55) not null , u_pwd integer not null) ");
//			statement2.execute("insert into user values (1,'tarun','tarun@gmail.com',5333233)");
//			statement2.execute("insert into user values(2,'ramesh','ramesh@gmail.com',789566)");
//			statement2.execute("insert into user values(3,'suresh','suresh@gmail.com',555555)");
//			statement2.execute("insert into user values(4,'ravindhar','ravindhar@gmail.com',74123)");
//			statement2.execute("insert into user values(5,'kml','kml@gmail.com',963214)");
			System.out.println("after update the table "
					+ "/n");
			
			//statement2.execute("update user set u_name='siva',u_email='siva@gmail.com',u_pwd=565256 where u_id=5");
			//statement2.execute("delete from user where u_id=3");
			//statement2.execute("insert into user values(3,'suresh','suresh@gmail.com',555555)");
			//statement2.execute("alter table user add u_ph integer");
			//statement2.execute("update user set u_ph=85235623 where u_id=1 ");
			statement2.execute("alter table user drop u_ph");
			statement2.close();
			
	} 

}
