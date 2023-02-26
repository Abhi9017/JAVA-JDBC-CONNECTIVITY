import java.sql.*;
public class owntable
{
	public static void main(String args[]) throws Exception
	{
		String url="jdbc:mysql://localhost/";
		String user="root";
		String pswd="";
		try(Connection con=DriverManager.getConnection(url,user,pswd))
		{
			Statement st=con.createStatement();
			
			//st.executeUpdate("create database school");
			
			String s="school";
			url+=s;
			Connection con1=DriverManager.getConnection(url,user,pswd);
			Statement st1=con1.createStatement();
			st1.executeUpdate("create table students(roll varchar(10),name varchar(10))");
			st1.executeUpdate("insert into students values('20vv1a1212','abhilash'),('20vv1a1202','chinnala')");
			
			con1.close();
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}