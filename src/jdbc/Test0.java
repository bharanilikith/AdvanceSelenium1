package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class Test0 {

	public static void main(String[] args) throws SQLException {

//Step:1 Register to the database
		Driver dref=new Driver();
		DriverManager.registerDriver(dref);
		
//Step:2 Connect to database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","root");
		
//Step:3 Create sql query Statement
		Statement stat = con.createStatement();
		String query="select * from project";
		
//Step:4 execute query
		ResultSet res = stat.executeQuery(query);
		while(res.next()) {
			System.out.println(res.getString(1));
		}
		
//step:5 close the database
		con.close();
		
	}

}
