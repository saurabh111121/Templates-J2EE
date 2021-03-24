package com.templates.servlet;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.templates.dao.ImageDao;
import com.templates.bean.ImageBean;

@WebServlet("/ImageServlet")
@MultipartConfig(maxFileSize = 16177215)
public class ImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		Part filePart = request.getPart("image");

		InputStream inputStream = null;
		if (filePart != null) {
			String imgData = " Size: " + filePart.getSize() + ", Content-Type: " + filePart.getContentType() ;
			  System.out.println(imgData);
			inputStream = filePart.getInputStream();
		}
		String message;
		ImageBean data = new ImageBean();
		data.setName(name);
		data.setImage(inputStream);
		

		Boolean boolmsg = new ImageDao().Insert(data);
		if (boolmsg) {
			message = "Record updated";
		} else {
			message = "Failed";
		}
		response.getWriter().write(message);
	}

}
