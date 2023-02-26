import java.io.*;
import java.sql.*;
public class downoadpdffromdatabase

{
	public static void main(String args[]) throws FileNotFoundException,ClassNotFoundException,IOException,SQLException
	{
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
		String query="select resume from resume";
		PreparedStatement pst=con.prepareStatement(query);
	    ResultSet rs=pst.executeQuery();
		Reader r=rs.getCharacterStream(1);
		
		FileWriter  fos=new FileWriter("D:\\birth\\text.txt");
		int i;
		while((i=r.read())!=-1)
		{
			fos.write(i);
		}
     
	 con.close();
	}
	
}