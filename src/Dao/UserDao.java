package Dao;

import java.sql.Connection;
import java.util.ArrayList;

import com.mysql.jdbc.PreparedStatement;

import Bean.UserBean;
import Util.Dbconnection;

public class UserDao {
	try(Connection conn=Dbconnection.getDBConnection();
			PreparedStatement pstmt = (PreparedStatement) conn
					.prepareStatement("insert into student (firstName,email,password) values (?,?,?)");){
		
	}
	

}
