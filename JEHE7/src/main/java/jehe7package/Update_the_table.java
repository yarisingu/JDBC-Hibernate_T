package jehe7package;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Update_the_table {

	public static void main(String[] args) throws Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection =	DriverManager.getConnection("jdbc:mysql://localhost:3306/jehe7","root","root");
		Statement statement=	connection.createStatement();
		statement.execute("update std set s_name='siva',s_email='siva@gmail.com',s_ph=565625 where s_id=5");
		System.out.println("update sucessfully");
		statement.close();
	}
}
