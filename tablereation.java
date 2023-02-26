import java.sql.*;
public class tablereation

{
	public static void main(String args[]) throws Exception
	{
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost/","root",""))
		{
			Statement st=con.createStatement();
			st.executeUpdate("create database school");
			Connection con1=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
			System.out.println("yes school databse created");
		   Statement st1=con1.createStatement();
		   st1.executeUpdate("create table student(rollnnumber varchar(10),Name varchar(10))");
		   System.out.println("yes student table created");
		   st1.executeUpdate("insert into student values('20vv1a1212','Abhilash')");
		   System.out.println("inserted values");
		   ResultSet rs=  st1.executeQuery("select * from student ");
		   System.out.println("query excuted");
		   
		   con1.close();
		   con.close();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}