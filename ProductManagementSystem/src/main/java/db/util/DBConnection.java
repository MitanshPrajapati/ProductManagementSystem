package db.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection
{
	private static final String URLNAME = "jdbc:mysql://localhost:3306/studentdb";
	private static final String DRIVERCLASS = "com.mysql.cj.jdbc.Driver";
	private static final String USERNAME  = "root";
	private static final String PASSWORD = "root";
	
	public static Connection getconnection() 
	{
		Connection conn = null;
		
		try 
		{
			Class.forName(DRIVERCLASS);
			
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
			if(conn != null)
			{
				System.out.println("DB connected");
			}
			else {
				System.out.println("DB not connected");
					
			}
			
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		return conn;

	}
	public static void main(String[] args) 
	{
		
		DBConnection.getconnection();
		System.out.println("hello");
	}
	
}
