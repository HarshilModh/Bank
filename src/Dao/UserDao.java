package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import Bean.UserBean;
import Util.Dbconnection;

public class UserDao {
	public int insertUser(UserBean user) {
		
	
	try(Connection conn=Dbconnection.getDBConnection();
			PreparedStatement pstmt = (PreparedStatement) conn
					.prepareStatement("insert into bank (User_Email,User_Name,User_Password) values (?,?,?)");){
		
	
			pstmt.setString(1, user.getEmail());
			pstmt.setString(2, user.getFirstName());
			pstmt.setString(3,user.getPassword());
			int records = pstmt.executeUpdate();
			return records;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}
	public ResultSet checkUser(UserBean user){
		try(Connection conn=Dbconnection.getDBConnection();
				PreparedStatement pstmt = (PreparedStatement) conn
						.prepareStatement("select User_Email,User_Name from bank where User_Name=(?) and User_password=(?)");){
			
			pstmt.setString(1, user.getEmail());
			pstmt.setString(2, user.getPassword());
			ResultSet records=pstmt.executeQuery();
			return records;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
		
	}
	}

