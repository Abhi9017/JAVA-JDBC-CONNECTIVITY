import java.sql.*;
public class callablestatement

{
	
	public static void main(String args[])
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost/school","root","");
		CallableStatement cst =con.prepareCall("{call myprocedure(?,?)}");
		cst.setString(1,'20vv1a12');  /*in parameter*/
		cst.setString(2,'ahiash');    /* in parameter*/
		 cst.execute();    /* inseter */
		 //*-----------------------------------*//
		 
		 cst.registerOutParameter(2,Types.VARCHAR); /*OUT parameerter*/
		  
		/* cst.registerOutParameter(1,Types.INTEGER);*/  //FOR INTEGER//
		
		
	}
}