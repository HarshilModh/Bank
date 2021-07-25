package Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Dbconnection {
	private static String userName="root";
	private static String password="";
	private static String connectionURL="jdbc:mysql://localhost:3306/bank";
	private static String driverCLass="com.mysql.jdbc.Driver";
	
	
	public 	static Connection getDBConnection() {
		Connection conn=null;	
		try {
			Class.forName(driverCLass); // jvm force

			conn = DriverManager.getConnection(connectionURL,userName, password);//getttion
			if (conn != null) {

				System.out.println("connected with database...");
			} else {

				System.out.println("not connected with database...");
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	public static void main(String[] args) {
		getDBConnection();
	
}
}
