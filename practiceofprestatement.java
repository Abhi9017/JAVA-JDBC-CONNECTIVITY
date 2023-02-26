import java.sql.*;
public class practiceofprestatement
{
	public static void main(String args[]) throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
		String Query="insert into students values ('20vv1a1212','prathima')";
		PreparedStatement pstm=con.prepareStatement(Query);
		pstm.executeUpdate();
		ResultSet rs=pstm.executeQuery("select * from students");
		while(rs.next())
		{
			 System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(1));
			System.out.println("");
		}
		con.close();
		
	}
}