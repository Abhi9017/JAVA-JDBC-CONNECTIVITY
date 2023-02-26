import java.sql.*;
public class mainconnection
{
	public static void main(String args[]) throws SQLException
	{
		String driver ="com.mysql.jdbc.Driver";
		String conn="jdbc:mysql://localhost/";
		String user="root";
		String password="";
		
		try
		{
			//register driver
			//	Class.forName("com.mysql.jdbc.Driver");
			// connection
			Connection con=DriverManager.getConnection(conn,user,password);
			// create statemnt
			Statement stmt = con.createStatement();
			//excute queries
			
			
			stmt.executeUpdate("DROP DATABASE schools");
			
			// CLOOSE CONNECTION'
			con.close();
			
			
		}
		catch(Exception e){}
		
	}
}