package Controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.security.provider.certpath.ResponderId;

/**
 * Servlet implementation class Bank_Login
 */

//@WebServlet("/Bank_Login") 
public class Bank_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String dbEmail="";
	String dbPassword="";
			@Override
				public void init(ServletConfig config) throws ServletException {
					
				dbEmail=config.getInitParameter("email");
				dbPassword=config.getInitParameter("Password");
				System.out.println(dbEmail+" -----" +dbPassword);
	}
			
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("Password");
		if(dbEmail.equalsIgnoreCase(email) && dbPassword.equalsIgnoreCase(password)) {
		response.sendRedirect("Admin_home.jsp");
		}
			
	}

}
