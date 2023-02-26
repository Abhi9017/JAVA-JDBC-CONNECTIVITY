import jva.sql.*;
class i
{
	
	public static void main(String args[]) throws Exception
	{
		Connection con=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:8080/","root","");
			System.out.println("xampp connexted");
		}catch(Exception e)
		{
		  	System.out.println(e.getMessage());
		}
	}
}