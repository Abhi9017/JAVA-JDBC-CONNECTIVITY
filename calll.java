import java.sql.*;
public class calll{
public static void main(String args[])
{
	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
	
	CallableStatement cst=con.preparecall("{call MYPROC(1)}");
	cst.execute();
	con.close();
	
}
}