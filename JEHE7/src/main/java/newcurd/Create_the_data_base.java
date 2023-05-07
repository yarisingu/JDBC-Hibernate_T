package newcurd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Create_the_data_base {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		Statement statement =connection.createStatement();
		statement.execute("Create  database BIGDATA");
		System.out.println("create data base sucessfully");
	}

}
