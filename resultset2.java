import java.sql.*;
public class resultset2
{
	public static void main(String args[]) throws SQLException
	{
		String url="jdbc:mysql://localhost/chat";
		String user="root";
		String pswd="";
		Connection con=DriverManager.getConnection(url,user,pswd);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from users");
		
		while(rs.next()){
		System.out.println(rs.getString("user_id")+"     "  +rs.getString("unique_id")+"         "  +rs.getString("fame")+"         "  +rs.getString("lname")+"       "  +rs.getString("email")+"          "  +rs.getString("password"));
		}
		System.out.println("********************");
		
		con.close();
		
	}
}