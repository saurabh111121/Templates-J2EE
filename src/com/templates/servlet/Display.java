package com.templates.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.templates.dao.ImageDao;

@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String name = request.getParameter("name");
		String name = "Saurabh";
		ImageDao dao =  new ImageDao();
		ServletOutputStream outputStream = null;	
		byte[] image = dao.getImage(name);
		outputStream = response.getOutputStream();
		outputStream.write(image);
		outputStream.close();
	}

}
