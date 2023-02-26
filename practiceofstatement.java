import java.sql.*;
public class practiceofstatement
{
	public static void main(String args[]) throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
		Statement stmt =con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from students");
		while(rs.next())
		{
			 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(1));
			System.out.println("");
		}
		con.close();
		
	}
}