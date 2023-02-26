import java.sql.*;
import java.util.*;
public class preparestatement2
{
	public static void main(String args[]) throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
		 String query="Insert into students values(?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("enter roll number");
			String roll=sc.nextLine();
			System.out.println("enter name number");
			String name=sc.nextLine();
			pst.setString(1,roll);
			pst.setString(2,name);
			pst.executeUpdate();
			System.out.println("Please enter [yes/no] to insert new ");
			String op=sc.nextLine();
			if(op.equalsIgnoreCase("no"))
			{
				break;
				}
		}
		ResultSet rs=pst.executeQuery("select * from students");
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" " +rs.getString(2));
		}
		
	}
}