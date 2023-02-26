import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.*;
public class dobtosql
{
	public static void main(String args[]) throws ParseException,SQLException,ClassNotFoundException
	{
	       Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
			String query ="insert into happybirthday values(?,?)";
			PreparedStatement pst=con.prepareStatement(query);
			pst.setString(1,"abhilash");
			Scanner sc=new Scanner(System.in);
	   System.out.println("enter the date of brth in (dd-mm-yyyyy)");
	   String dob=sc.nextLine();
	   SimpleDateFormat  sdf =new SimpleDateFormat("dd-MM-yyyy");
			java.util.Date dob1=sdf.parse(dob);
			long dob2=dob1.getTime();
			java.sql.Date dob3=new java.sql.Date(dob2);
			pst.setDate(2,dob3);
			pst.executeUpdate();
			con.close();
			
		
	}
}