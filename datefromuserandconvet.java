import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class datefromuserandconvet{
public static void main(String args[]) throws ParseException
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("enter the date of brth in (dd-mm-yyyyy)");
	   String dob=sc.nextLine();
	   System.out.println(dob);
	   
	   //covert to date format
	   SimpleDateFormat  sdf =new SimpleDateFormat("dd-MM-yyyy");
	   java.util.Date dob1=sdf.parse(dob);
	    System.out.println(dob1);
	   // covert sql date
	   
	   
	   long dob2=dob1.getTime();
	   java.sql.Date dob3=new java.sql.Date(dob2);
	   System.out.println(dob3);
	   
	   
	   
	   
	   
     }
}