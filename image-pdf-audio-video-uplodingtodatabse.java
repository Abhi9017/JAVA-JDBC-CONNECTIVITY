import java.io.*;
public class image-pdf-audio-video-uplodingtodatabse
  {
	public static void main(String args[]) 
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
		File file=new File("C:\\Users\\91934\\Desktop\\Screenshot_20220311-103008_Drive.jpg");
		FileInputStream fin=new FileInputStream(file);
		String querry="insert into profilephoto values(?,?)";
		PreparedStatement pst=con.prepareStatement(querry);
		pst.setString(1,"Abhilash");
		int size= (int)file.length();
		pst.setBinaryStream(2,fin,size);
		pst.executeUpdate();
		con.close();
		
	}
  }
