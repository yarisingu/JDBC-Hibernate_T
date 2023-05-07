package newcurd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Create {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/BIGDATA");
		
	}
}
