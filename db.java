import java.sql.*;
class db
{
	//javac -cp mysql-connector-j-8.0.31.jar;. db.java//
	// mysql -u root -p
	
	public static void main(String args[]) throws SQLException
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/","root","");
			System.out.println("xampp connexted");
			Statement stat=con.createStatement();
			stat.executeUpdate("CREATE DATABASE PROGRAMS");
			System.out.println("cretaed");
			
		}catch(Exception e)
		{
		  	System.out.println(e.getMessage());
		}
	}
}