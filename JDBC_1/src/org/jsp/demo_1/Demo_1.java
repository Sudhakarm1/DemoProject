package org.jsp.demo_1;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
public class Demo_1 
{
	public static void main(String[] args) throws SQLException, ClassNotFoundException 
	{
		Driver D=new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(D);
		System.out.println(D);
		//Step-2
		Class.forName("com.mysql.jdbc.Driver");
		//Step-3
		Scanner Sc=new Scanner(System.in);
		Class.forName(Sc.nextLine());
	}
}
