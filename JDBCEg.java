package Test;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.sun.jdi.connect.spi.Connection;

public class JDBCEg {
public static void main(String[] args)throws ClassNotFoundException, SQLException {
		
		String url ="jdbc:oracle:thin:@localhost:1521/XE";
		String username ="dhanu";
		String password ="123";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		java.sql.Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("connection created");
		Statement stmt = ((java.sql.Connection) con).createStatement();
		
		String updateQuery = "UPDATE DAY8 SET NAME='BHAVYA',SUBJECT='SQL',MARKS=80 WHERE ID=3";
		stmt.executeUpdate(updateQuery);
		
		ResultSet rs = stmt.executeQuery("SELECT * FROM DAY8");
		System.out.println("query execution" + rs);

 	while(rs.next()) {
		
		System.out.println(rs.getString("id") + ":" +  rs.getString("name") + ":" +  rs.getString("subject") + ":" + rs.getString("marks"));
	}
	con.close();

}

}
