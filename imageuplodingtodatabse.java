import java.io.*;
import java.sql.*;
public class imageuplodingtodatabse
{
	public static void main(String args[]) throws SQLException,FileNotFoundException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
		File file=new File("D:\\birth\\d.jpg");
	//video	File file=new File("D:\\birth\\d.mp4");
//audio	File file=new File("D:\\birth\\d.mp3");
		FileInputStream fin=new FileInputStream(file);
		String query="insert into profilephoto values(?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,"abhi");
		int size=(int) file.length();
		pst.setBinaryStream(2,fin,size);
		pst.executeUpdate();
	     con.close();
	}
}