package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Create_the_tableprepare {

	public static void main(String[] args) throws Throwable {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook","root","root");
	PreparedStatement preparedStatement =	connection.prepareStatement("create table data (d_id integer primary key, d_name varchar(55) not null,d_email varchar(55) not null, d_ph integer not null)");
	preparedStatement.execute();
	preparedStatement.close();
	}

}
