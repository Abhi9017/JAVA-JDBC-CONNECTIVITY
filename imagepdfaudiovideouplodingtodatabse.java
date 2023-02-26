import java.io.*;
import java.sql.*;
public class imagepdfaudiovideouplodingtodatabse
  {
	public static void main(String args[]) throws ClassNotFoundException,SQLException,FileNotFoundException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
		File file=new File("D:\\birth\\d.jpg");
		FileInputStream fin=new FileInputStream(file);
		String querry="insert into profilephoto values(?,?)";
		PreparedStatement pst=con.prepareStatement(querry);
		pst.setString(1,"Abhi");
		int size= (int) file.length();
		pst.setBinaryStream(2,fin,size);
		pst.executeUpdate();
		con.close();
		
	}
  }
