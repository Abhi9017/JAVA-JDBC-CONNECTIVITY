
public class datainjdbc2
{
	public static void add()
	{
		//time//
		java.util.Date date1=new java.util.Date();
		System.out.println(date1);
		// time tosecond//
		long date2=date1.getTime();
		System.out.println(date2);
		java.sql.Date date3 =new java.sql.Date(date2);
		System.out.println(date3);
		
	}
	public static void main(String args[])
	{
		datainjdbc2 s=new datainjdbc2();
		s.add();
		
	}
}