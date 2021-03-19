package com.templates.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.templates.bean.UsersBean;
import com.templates.dao.UsersDao;

@WebServlet("/usersServlet")
public class usersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user_name = request.getParameter("uname");
		String user_email = request.getParameter("uemail");
		String user_password = request.getParameter("upass");
		
		UsersBean data = new UsersBean();
		data.setName(user_name);
		data.setEmail(user_email);
		data.setPassword(user_password);
		
		String message = null;
		Boolean boolmsg = new UsersDao().Insert(data);
	      if(boolmsg) {
	    	  message = "Record inserted";
	      }
	      else {
	    	  message ="Failed";
	      }
	      response.getWriter().write(message); 
	}

}
