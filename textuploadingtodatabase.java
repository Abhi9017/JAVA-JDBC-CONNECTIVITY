import java.sql.*;
import java.io.*;
public class textuploadingtodatabase
{
	public static void main(String args[]) throws SQLException,FileNotFoundException{
		File file=new File("C:\\Users\\91934\\Documents\\Courses.txt");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
		String query="insert into resume values(?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,"abhi");
		FileReader reader=new FileReader(file);
		pst.setCharacterStream(2,reader);
		pst.executeUpdate();
		con.close();
	}
}