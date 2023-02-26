import java.sql.*;
import java.util.*;
public class batch
{
	public static void main(String args[]) throws SQLException{
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");	
	String query ="insert into students values(?,?)";
	PreparedStatement pst=con.prepareStatement(query);
	Scanner sc=new Scanner(System.in);
    while(true)
	{
		
		System.out.println("enter 10 digits roll Number");
		String roll=sc.nextLine();
		System.out.println("enter 10 letters Name");
		String name=sc.nextLine();
		System.out.println("enter [y/n] to add next data");
		String op=sc.nextLine();
		pst.setString(1,roll);
		pst.setString(2,name);
		pst.addBatch();
		System.out.println("inserted  into database");
		if(op.equalsIgnoreCase("n"))
		{
			
			break;
		}
		
		
	}
	pst.executeBatch();
	pst.executeUpdate();
	con.close();
}
}