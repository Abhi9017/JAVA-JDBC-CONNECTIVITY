import java.sql.*;
import java.util.*;

public class preparedstatement
{
	public static void main(String args[]) throws SQLException, ClassNotFoundException
	{
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
		String query="Insert into students values(?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter roll number");
			String r=sc.nextLine();
			System.out.println("enter name number");
			String n=sc.nextLine();
			pst.setString(1,r);
			pst.setString(2,n);
			pst.executeUpdate();
			System.out.println("enter [yes/no] to insert");
			String  yn=sc.nextLine();
			if(yn.equalsIgnoreCase("no"))
			{
				break;
			}
		}
		con.close();
	}
}