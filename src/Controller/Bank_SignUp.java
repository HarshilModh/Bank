package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Bean.UserBean;
import Dao.UserDao;

/**
 * Servlet implementation class Bank_SignUp
 */
public class Bank_SignUp extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String Name=request.getParameter("Name");
		String Password=request.getParameter("Password");
		String email=request.getParameter("email");
		
		UserBean users=new UserBean();
		users.setEmail(email);
		users.setFirstName(Name);
		users.setPassword(Password);
		
		UserDao userdao=new UserDao();
		int results=userdao.insertUser(users);
		System.out.println(results);
		if (results!=0) {
			response.sendRedirect("Bank_login.jsp");
		}
	}

}
