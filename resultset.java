import java.sql.*;
public class resultset
{
	public static void main(String args[]) throws Exception
	{
		String url="jdbc:mysql://localhost/school";
		String user="root";
		String pswd="";
		Connection con=DriverManager.getConnection(url,user,pswd);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from students");
		
		while(rs.next()){
		System.out.println(rs.getString(1)+" "  +rs.getString(2));
		}
		System.out.println("*******************");
		while(rs.next()){
		System.out.println(rs.getString("roll")+" "  +rs.getString("name"));
		}
		con.close();
		
	}
}