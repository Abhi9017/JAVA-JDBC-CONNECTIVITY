import java.io.*;
import java.sql.*;
public class downloadinmagefromdatabase

{
	public static void main(String args[]) throws FileNotFoundException,ClassNotFoundException,IOException,SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
		String query="select image from profilephoto";
		PreparedStatement pst=con.prepareStatement(query);
		ResultSet rs=pst.executeQuery();
		FileOutputStream fos=new FileOutputStream("D:\\birth\\abhilash.jpg");
		if(rs.next())
		{
			fos.write(rs.getBytes(1));
			System.out.println(rs.getBytes(1));
			System.out.println("success downoaded");
		}
		else
		{
			System.out.println("success  not downoaded");
		}
		
		
	}
}